package com.codegen.platform.util;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections.CollectionUtils;
import org.apache.ibatis.session.RowBounds;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.codegen.platform.web.ControllerContext;

/**
 * @author Jackie
 */
public class LigerGridUtil {

    private static ThreadLocal<Integer> total = new ThreadLocal<Integer>();
    private static ThreadLocal<Boolean> countpage = new ThreadLocal<Boolean>();
    private static ThreadLocal<String> countSql = new ThreadLocal<String>();

    private static void clear() {
        total.set(null);
        countpage.set(null);
        countSql.set(null);
    }

    public static int getPage() {
        if (ControllerContext.getRequest() != null && ControllerContext.getRequest().getParameter("page") != null) {
            return Integer.parseInt(ControllerContext.getRequest().getParameter("page"));
        } else {
            return 1;
        }
    }

    public static int getPageSize() {
        if (ControllerContext.getRequest() != null && ControllerContext.getRequest().getParameter("pagesize") != null) {
            return Integer.parseInt(ControllerContext.getRequest().getParameter("pagesize"));
        } else {
            return 10;
        }
    }

    public static int getOffset() {
        return (getPage() - 1) * getPageSize();
    }

    public static int getLimit() {
        return getPageSize();
    }

    public static String toJSONString(List list) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("Rows", list);
        map.put("Total", total.get());
        Encoder.escape(map);
        return JSON.toJSONString(map, SerializerFeature.BrowserCompatible);
    }

    public static String toJSONStringWithDateFormat(List list, String format) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("Rows", list);
        map.put("Total", total.get());
        if (total.get() == null && list != null) {
            map.put("Total", list.size());
        }
        Encoder.escape(map);
        String json = JSON.toJSONStringWithDateFormat(map, format, SerializerFeature.BrowserCompatible).replace("\t",
                "\\t");
        clear();
        return json;
    }

    public static String toJSONStringWithDateFormat(Result result, String format) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("Total", total.get());
        if (total.get() == null) {
            if (result.getResultList() != null) {
                map.put("Total", result.getResultList().size());
            }
        }
        map.put("success", result.isSuccess());
        map.put("message", result.getMessage());
        map.put("error", result.isError());
        map.put("resultCode", result.getResultCode());
        map.put("Rows", paginationByHand(result.getResultList()));
        Encoder.escape(map);
        String json = JSON.toJSONStringWithDateFormat(map, format, SerializerFeature.BrowserCompatible).replace("\t",
                "\\t");
        clear();
        return json;
    }

    private static List paginationByHand(List list) {
        List rslist = null;
        if (CollectionUtils.isNotEmpty(list)) {
            if (LigerGridUtil.getOffset() > list.size()) {
                return null;
            } else {
                int toIndex = LigerGridUtil.getOffset() + LigerGridUtil.getLimit();
                if (toIndex > list.size()) {
                    rslist = list.subList(LigerGridUtil.getOffset(), list.size());
                } else {
                    rslist = list.subList(LigerGridUtil.getOffset(), toIndex);
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

    public static Boolean getCountpage() {
        if (ControllerContext.getRequest() != null
                && ControllerContext.getRequest().getParameter("countpage") != null) {
            countpage.set(Boolean.parseBoolean(ControllerContext.getRequest().getParameter("countpage")));
        } else {
            countpage.set(false);
        }
        return countpage.get();
    }

    public static void setTotal(Integer total) {
        LigerGridUtil.total.set(total);
    }

    public static RowBounds getRowBounds() {
        return new RowBounds(LigerGridUtil.getOffset(), LigerGridUtil.getLimit());
    }

    public static void setCountSql(String sql) {
        countSql.set(sql);
    }

    public static String getCountSql() {
        return countSql.get();
    }
}
