/**
 * 
 */
package com.codegen.platform.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author WuLiangzhi
 *
 */
public class CommentUtil {

	private static final Logger logger = LoggerFactory.getLogger(CommentUtil.class);

	/**
	 * 生成注释
	 * 
	 * @param comment
	 *            String 注释信息
	 * @return String
	 */
	public static String generateComment(String comment) {
		logger.info("generateComment before replace comment={}", comment);
		comment = replaceSpecialChar(comment, ";");
		comment = replaceBlankChar(comment, "");
		comment = comment.replaceAll(";", "  ");
		logger.info("generateComment after replace comment={}", comment);

		StringBuilder sb = new StringBuilder();
		sb.append("/** ");
		sb.append(comment);
		sb.append(" */");
		logger.info("generateComment sb={}", sb);
		return sb.toString();
	}

	/**
	 * 替换掉字符串中的换行符、制表符、回车
	 * 
	 * @param srcStr
	 *            String 源字符串
	 * @param replaceStr
	 *            String 特殊字符需替换成的字符串
	 * @return String
	 */
	public static String replaceSpecialChar(String srcStr, String replaceStr) {
		String dest = "";
		if (srcStr != null) {
			Pattern p = Pattern.compile("\\t|(\r\n)|\r|\n");
			Matcher m = p.matcher(srcStr);
			dest = m.replaceAll(replaceStr);
		}
		return dest;
	}

	/**
	 * 替换掉字符串中的空格
	 * 
	 * @param srcStr
	 *            String 源字符串
	 * @param replaceStr
	 *            String 特殊字符需替换成的字符串
	 * @return String
	 */
	public static String replaceBlankChar(String srcStr, String replaceStr) {
		String dest = "";
		if (srcStr != null) {
			Pattern p = Pattern.compile("\\s*");
			Matcher m = p.matcher(srcStr);
			dest = m.replaceAll(replaceStr);
		}
		return dest;
	}

	public static void main(String[] args) {
		String comment = "01 - 身份证认证\n02 - 行驶证认证\n03 - 驾驶证认证\n04 - 营业执照认证\n05 - 进口资质认证\n06 - 检验检疫证认证\n07 - 银行卡认证\n多个‘，’分隔";
		comment = "01 - 身份证认证\r\n            02 - 行驶证认证\r\n            03 - 驾驶证认证\r\n            04 - 营业执照认证\r\n            05 - 进口资质认证\r\n            06 - 检验检疫证认证\r\n            07 - 银行卡认证\r\n            多个‘，’分隔\r\n            ";

		logger.info("main comment={}", comment);

		String formatComment = generateComment(comment);
		logger.info("main formatComment={}", formatComment);
	}

}
