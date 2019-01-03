/**
 * @Title: DataTablesUtil.java
 * @Description: jquery.datatables表格插件查询处理类
 * Copyright: Copyright (c) 2018 
 * 
 * @author WuLiangzhi
 * @date May 23, 2016 3:58:18 PM
 * @version V1.0
 */

package com.codegen.platform.datatables.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.apache.commons.collections.CollectionUtils;
import org.apache.ibatis.session.RowBounds;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.codegen.platform.datatables.model.DataTablesQryCriteira;
import com.codegen.platform.util.DateUtils;
import com.codegen.platform.util.Encoder;
import com.codegen.platform.util.ListUtil;
import com.codegen.platform.util.MapUtil;
import com.codegen.platform.util.Result;
import com.codegen.platform.util.StringUtil;
import com.codegen.platform.web.ControllerContext;

/**
 * @ClassName: DataTablesUtil
 * @Description: jquery.datatables表格插件查询处理类
 * @author WuLiangzhi
 * @date May 23, 2016 3:58:18 PM
 * 
 */

public class DataTablesUtil {

	private static final Logger LOG = LoggerFactory.getLogger(DataTablesUtil.class);

	private static ThreadLocal<Integer> total = new ThreadLocal<Integer>();
	private static ThreadLocal<Boolean> countpage = new ThreadLocal<Boolean>();

	private static ThreadLocal<Map<String, Object>> paramMapTL = new ThreadLocal<Map<String, Object>>();

	public static void clear() {
		total.set(null);
		countpage.set(null);

		if (paramMapTL.get() != null) {
			paramMapTL.get().clear();
		}
		paramMapTL.set(null);
	}

	public static Map<String, Object> getParamMap() {
		Map<String, Object> paramMap = paramMapTL.get();
		if (paramMap == null) {
			paramMap = parseRequestParams();
			paramMapTL.set(paramMap);
		}
		return paramMap;
	}

	/**
	 * 解析 jquery.datatables 表格提交的参数
	 * 
	 * @Title: getRequestParams
	 * @Description: 解析 jquery.datatables 表格提交的参数
	 * @return Map<String, Object>
	 */
	private static Map<String, Object> parseRequestParams() {
		Map<String, Object> paramMap = new TreeMap<String, Object>();
		String aoData = ControllerContext.getRequest().getParameter("aoData");
		LOG.info("getRequestParams aoData={}", aoData);
		if (StringUtil.isNotEmpty(aoData) && !"undefined".equals(aoData)) {
			JSONArray jsonArray = JSON.parseArray(aoData);
			if (jsonArray != null && !jsonArray.isEmpty()) {
				for (int i = 0; i < jsonArray.size(); i++) {
					JSONObject jsonObj = jsonArray.getJSONObject(i);
					String name = String.valueOf(jsonObj.get("name"));
					Object value = jsonObj.get("value");
					if (value instanceof String && "ALL".equals(value.toString())) { // select2的js插件中设置下拉框选中全部，则默认值为ALL，将其转换为数据库对应的空字符串
						value = "";
					}
					paramMap.put(name, value);
				}
			}
		}

		String oAjaxData = ControllerContext.getRequest().getParameter("oAjaxData");
		LOG.info("parseRequestParams oAjaxData={}", oAjaxData);
		if (StringUtil.isNotEmpty(oAjaxData) && !"undefined".equals(oAjaxData)) {
			Map<String, Object> map = JSON.parseObject(oAjaxData, Map.class);
			LOG.debug("parseRequestParams oAjaxData map={}", map);
			if (map != null && !map.isEmpty()) {
				paramMap.putAll(map);
			}
		}

		LOG.info("parseRequestParams paramMap={}", paramMap);
		return paramMap;
	}

	/**
	 * 填充datatables表格的查询参数到obj中
	 * 
	 * @Title: fillQueryCondition
	 * @Description: 填充datatables表格的查询参数到obj中
	 * @param obj
	 *            Object
	 * @return Object
	 */
	public static Object fillQueryCondition(Object obj) {
		String jsonText = JSON.toJSONString(getParamMap());
		obj = JSON.parseObject(jsonText, obj.getClass());

		if (obj instanceof DataTablesQryCriteira) {
			((DataTablesQryCriteira) obj).setOrderByClause(getOrderByClause());
		}
		return obj;
	}

	public static int getOffset() {
		Integer iDisplayStart = getIDisplayStart();
		Integer start = getStart();
		if (iDisplayStart != null) {
			return iDisplayStart;
		}
		if (start != null) {
			return start;
		}
		return 0;
	}

	public static int getLimit() {
		Integer iDisplayLength = getIDisplayLength();
		Integer length = getLength();
		if (iDisplayLength != null) {
			return iDisplayLength;
		}
		if (length != null) {
			return length;
		}
		return 10;
	}

	private static String getSEcho() {
		return MapUtil.getString(getParamMap(), "sEcho");
	}

	private static Integer getIDisplayStart() {
		return MapUtil.getInteger(getParamMap(), "iDisplayStart");
	}

	private static Integer getIDisplayLength() {
		return MapUtil.getInteger(getParamMap(), "iDisplayLength");
	}

	private static Integer getStart() {
		return MapUtil.getInteger(getParamMap(), "start");
	}

	private static Integer getLength() {
		return MapUtil.getInteger(getParamMap(), "length");
	}

	public static Boolean getCountpage() {
		if (ControllerContext.getRequest() != null && (MapUtil.getInteger(getParamMap(), "iDisplayStart") != null
				|| MapUtil.getInteger(getParamMap(), "start") != null)) {
			countpage.set(true);
		} else {
			countpage.set(false);
		}
		return countpage.get();
	}

	public static void setTotal(Integer total) {
		DataTablesUtil.total.set(total);
	}

	/**
	 * 获取分页指示器
	 */
	public static RowBounds getRowBounds() {
		return new RowBounds(getOffset(), getLimit());
	}

	/**
	 * 获取ordery by条件
	 */
	public static String getOrderByClause() {
		StringBuffer sb = new StringBuffer();
		Map<String, Object> paramMap = getParamMap();

		String sColumns = MapUtil.getString(paramMap, "sColumns");
		List<String> columnList = ListUtil.parseStringToList(sColumns);
		if (CollectionUtils.isEmpty(columnList)) {
			return null;
		}
		for (String key : paramMap.keySet()) {
			if (key.indexOf("iSortCol_") >= 0) {
				String sortIdx = key.split("_")[1];
				String sortDir = MapUtil.getString(paramMap, "sSortDir_" + sortIdx);
				if (StringUtil.isEmpty(sortDir)) {
					continue;
				}
				Integer value = MapUtil.getInteger(paramMap, key);
				if (value != null && value >= 0) {
					if (columnList.size() >= value) {
						sb.append(columnList.get(value)).append(" ").append(sortDir).append(",");
					}
				}
			}
		}
		String orderBy = sb.toString();
		if (StringUtil.isNotEmpty(orderBy)) {
			orderBy = orderBy.substring(0, orderBy.length() - 1);
		}
		LOG.info("getOrderByClause orderBy={}", orderBy);
		return orderBy;
	}

	/**
	 * 将结果转换为datatables列表所需的格式
	 * 
	 * @Title: convertToDataTablesRet
	 * @Description: 将结果转换为datatables列表所需的格式
	 * @param list
	 *            List
	 * @return Map<String, Object>
	 */
	private static Map<String, Object> convertToDataTablesRet(List list) {
		if (list == null) {
			list = new ArrayList();
		}
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("sEcho", getSEcho());
		map.put("iTotalRecords", list == null ? 0 : list.size()); // 本次查询返回页面的总数据数量
		if (total.get() == null && list != null) {
			map.put("iTotalDisplayRecords", list.size()); // 本次查询返回页面的总数据数量
		} else {
			map.put("iTotalDisplayRecords", total.get() == null ? 0 : total.get()); // 数据库中所有记录总数量
		}
		map.put("aaData", list);

		String draw = MapUtil.getString(getParamMap(), "draw");
		map.put("draw", draw);
		map.put("recordsTotal", map.get("iTotalRecords"));
		map.put("recordsFiltered", map.get("iTotalDisplayRecords"));
		map.put("data", list);

		return map;
	}

	public static String toJSONString(List list) {
		Map<String, Object> map = convertToDataTablesRet(list);
		Encoder.escape(map);

		LOG.debug("toJSONString sEcho={}, iTotalRecords={}, iTotalDisplayRecords={}",
				new Object[] { map.get("sEcho"), map.get("iTotalRecords"), map.get("iTotalDisplayRecords") });
		LOG.debug("toJSONString draw={}, recordsTotal={}, recordsFiltered={}",
				new Object[] { map.get("draw"), map.get("recordsTotal"), map.get("recordsFiltered") });
		clear();
		return JSON.toJSONString(map, SerializerFeature.BrowserCompatible);
	}

	public static String toJSONStringWithDateFormat(List list, String format) {
		Map<String, Object> map = convertToDataTablesRet(list);

		Encoder.escape(map);
		String json = JSON.toJSONStringWithDateFormat(map, format, SerializerFeature.BrowserCompatible).replace("\t",
				"\\t");
		clear();
		return json;
	}

	public static String toJSONStringWithDateFormat(Result result, String format, boolean manualPage) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("success", result.isSuccess());
		map.put("message", result.getMessage());
		map.put("error", result.isError());
		map.put("resultCode", result.getResultCode());
		map.put("resultMap", result.getResultMap());
		map.put("result", result.getResult());

		List list = null;
		if (manualPage) {
			list = paginationByHand(result.getResultList());
		} else {
			list = result.getResultList();
		}

		Map<String, Object> dtMap = convertToDataTablesRet(list);
		map.putAll(dtMap);
		Encoder.escape(map);
		String json = JSON.toJSONStringWithDateFormat(map, format, SerializerFeature.BrowserCompatible).replace("\t",
				"\\t");
		clear();
		return json;
	}

	private static List paginationByHand(List list) {
		List rslist = null;
		if (CollectionUtils.isNotEmpty(list)) {
			if (getOffset() > list.size()) {
				return null;
			} else {
				int toIndex = getOffset() + getLimit();
				if (toIndex > list.size()) {
					rslist = list.subList(getOffset(), list.size());
				} else {
					rslist = list.subList(getOffset(), toIndex);
				}
			}
		}
		return rslist;
	}

	public static String toJSONStringWithCHNDateTimeFormat(List list) {
		return toJSONStringWithDateFormat(list, DateUtils.CHINESE_DATE_TIME);
	}

	public static String toJSONStringWithCHNDateFormat(List list) {
		return toJSONStringWithDateFormat(list, DateUtils.CHINESE_DATE);
	}

	public static String toJSONStringWithDateTimeFormat(List list) {
		return toJSONStringWithDateFormat(list, DateUtils.DEFAULT_DATE_TIME);
	}

	/**
	 * 处理map的空对象的值，防止datatables显示弹出警告
	 * 
	 * @Title: handlerNullResult
	 * @Description: 处理map的空对象的值，防止datatables显示弹出警告
	 * @param keyArr
	 *            字段数组
	 * @param mapList
	 *            List<Map<String, String>>
	 */
	public static void handlerNullResult(String[] keyArr, List<Map<String, String>> mapList) {
		long start = System.currentTimeMillis();
		if (CollectionUtils.isNotEmpty(mapList) && keyArr != null && keyArr.length > 0) {
			for (Map<String, String> map : mapList) {
				for (int i = 0; i < keyArr.length; i++) {
					String value = map.get(keyArr[i]);
					map.put(keyArr[i], StringUtil.handlerNull(value));
				}
			}
		}
		LOG.info("handlerNullResult cost {} millisecond.", (System.currentTimeMillis() - start));
	}
}
