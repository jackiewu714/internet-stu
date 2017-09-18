/**
 * @Title: ExeclReportUtil.java
 * @Package com.yy.zbase.common.util
 * @Description: Excel报表工具类
 * Copyright: Copyright (c) 2011 
 * Company:YY
 * 
 * @author WuLiangzhi
 * @date Feb 21, 2014 7:55:28 PM
 * @version V1.0
 */

package com.cw.platform.util.report;

import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.HSSFColor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cw.platform.common.exception.BusiException;

/**
 * @ClassName: ExeclReportUtil
 * @Description: Excel报表工具类
 * @author WuLiangzhi
 * @date Feb 21, 2014 7:55:28 PM
 * 
 */

public class ExcelReportUtil {

	/**
	 * log printer
	 */
	private static final Logger logger = LoggerFactory
			.getLogger(ExcelReportUtil.class);

	private static ApplicationContext ctxload = new ClassPathXmlApplicationContext();

	/**
	 * 根据模板生成excel报表(一个sheet里面可能包含多个表格，视TableBean[]数组的长度而定)
	 * 
	 * @Title: generateExcelFromTemplate
	 * @Description: 根据模板生成excel报表(一个sheet里面可能包含多个表格，视TableBean[]数组的长度而定)
	 * @param templateFilePath
	 *            模板文件路径(默认取模板文件中的第一个sheet作为模板)
	 * @param tableBeanArr
	 *            表格Bean数组(该数组长度表明本报表包含几张表格)
	 * @return byte[]
	 * @throws BusiException
	 */
	public static byte[] generateExcelFromTemplate(String templateFilePath,
			List<SheetBean> sheetBeanList) throws BusiException {
		logger.info(
				"ExeclReportUtil -> generateExcelFromTemplate begin, templateFilePath={}",
				new Object[] { templateFilePath });
		if (sheetBeanList == null || sheetBeanList.size() < 1) {
			logger.info("sheetBeanList is null");
			return null;
		}
		try {
			InputStream is = ctxload.getResource(templateFilePath)
					.getInputStream();
			HSSFWorkbook workbook = new HSSFWorkbook(is);
			for (int i = 0; i < sheetBeanList.size(); i++) {
				SheetBean sheetBean = sheetBeanList.get(i);
				generateSingleSheet(workbook, sheetBean, (i + 1));
			}
			// 删除模板sheet
			workbook.removeSheetAt(0);
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			workbook.write(baos);
			byte[] byteContent = baos.toByteArray();
			logger.info(
					"ExeclReportUtil -> generateExcelFromTemplate end, templateFilePath={}, byteContent.length={}",
					new Object[] { templateFilePath,
							String.valueOf(byteContent.length) });
			return byteContent;
		} catch (FileNotFoundException e) {
			logger.error("ExeclReportUtil -> generateExcelFromTemplate error[FileNotFoundException], reason is:");
			logger.error(e.getMessage(), e);
			throw new BusiException(e);
		} catch (IOException e) {
			logger.error("ExeclReportUtil -> generateExcelFromTemplate error[IOException], reason is:");
			logger.error(e.getMessage(), e);
			throw new BusiException(e);
		}
	};

	/**
	 * 生成excel报表中的一张sheet
	 * 
	 * @Title: generateSingleSheet
	 * @Description: 生成excel报表中的一张sheet
	 * @param workbook
	 *            HSSFWorkbook
	 * @param sheetBean
	 *            excel中的一个sheet
	 * @param sheetIx
	 *            sheet的索引位置(从0开始，一般0索引位置的是模板)
	 */
	private static void generateSingleSheet(HSSFWorkbook workbook,
			SheetBean sheetBean, int sheetIx) {
		if (sheetBean != null) {
			TableBean[] tableBeanArr = sheetBean.getTableBeanArray();
			if (tableBeanArr == null || tableBeanArr.length < 1) {// 数据项为空，则直接返回
				logger.info("tableBeanArr is null");
				return;
			}

			HSSFSheet sheet = workbook.cloneSheet(0); // 克隆模板sheet，往里面塞数据
			if (!StringUtils.isBlank(sheetBean.getSheetName())) {
				workbook.setSheetName(sheetIx, sheetBean.getSheetName()); // 设置sheet的名称
			}
			HSSFCellStyle style = getStyle(workbook);
			for (int j = 0; j < tableBeanArr.length; j++) {// 循环生成多个表格
				TableBean tableBean = tableBeanArr[j];
				if (tableBean == null) {
					logger.info("tableBean is null, i={}", j);
					continue;
				}
				List<List<String>> dataList = tableBean.getDataList();
				if (dataList == null || dataList.size() < 1) {
					continue;
				}
				int startRow = tableBean.getStartRow();// 开始行
				int startColumn = tableBean.getStartColumn();// 开始列
				for (int m = 0; m < dataList.size(); m++) {// 生成一个表格
					List<String> rowDataList = dataList.get(m);
					if (rowDataList == null || rowDataList.size() < 1) {
						logger.info("rowDataList is null, m={}", m);
						continue;
					}
					// HSSFRow row = sheet.createRow(startRow);
					HSSFRow row = sheet.getRow(startRow);
					if (row == null) {// 当前行不存在，则创建新行
						row = sheet.createRow(startRow);
					}
					for (int n = 0; n < rowDataList.size(); n++) {// 生成一行
						HSSFCell cell = row.createCell(startColumn + n);
						cell.setCellType(HSSFCell.CELL_TYPE_STRING);
						cell.setCellStyle(style);
						cell.setCellValue(StringUtils.trimToEmpty(rowDataList
								.get(n)));
						// startColumn++;//列+1
					}
					startRow++;// 行+1
				}

				// 处理需替换值的单元格
				List<CellBean> replaceList = tableBean.getReplaceList(); // 需要替换值的单元格列表
				if (replaceList == null || replaceList.size() < 1) {
					continue;
				}
				for (int k = 0; k < replaceList.size(); k++) {
					CellBean cellBean = replaceList.get(k);
					HSSFRow row = sheet.getRow(cellBean.getRow());
					if (row != null) {
						HSSFCell cell = row.getCell(cellBean.getColumn());
						if (cell != null) {
							cell.setCellValue(cellBean.getValue());
						}
					}
				}
			}
		}
	}

	/**
	 * 设置excel单元格样式
	 * 
	 * @Title: getStyle
	 * @Description: 设置excel单元格样式
	 * @param workbook
	 * @return
	 */
	private static HSSFCellStyle getStyle(HSSFWorkbook workbook) {
		// 设置字体;
		HSSFFont font = workbook.createFont();
		// 设置字体大小;
		font.setFontHeightInPoints((short) 9);
		// 设置字体名字;
		font.setFontName("Courier New");
		// font.setItalic(true);
		// font.setStrikeout(true);
		// 设置样式;
		HSSFCellStyle style = workbook.createCellStyle();
		// 设置底边框;
		style.setBorderBottom(HSSFCellStyle.BORDER_THIN);
		// 设置底边框颜色;
		style.setBottomBorderColor(HSSFColor.BLACK.index);
		// 设置左边框;
		style.setBorderLeft(HSSFCellStyle.BORDER_THIN);
		// 设置左边框颜色;
		style.setLeftBorderColor(HSSFColor.BLACK.index);
		// 设置右边框;
		style.setBorderRight(HSSFCellStyle.BORDER_THIN);
		// 设置右边框颜色;
		style.setRightBorderColor(HSSFColor.BLACK.index);
		// 设置顶边框;
		style.setBorderTop(HSSFCellStyle.BORDER_THIN);
		// 设置顶边框颜色;
		style.setTopBorderColor(HSSFColor.BLACK.index);
		// 在样式用应用设置的字体;
		style.setFont(font);
		// 设置自动换行;
		style.setWrapText(false);
		// 设置水平对齐的样式为居中对齐;
		style.setAlignment(HSSFCellStyle.ALIGN_CENTER);
		// 设置垂直对齐的样式为居中对齐;
		style.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER);
		return style;
	}

}
