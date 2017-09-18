package com.cw.platform.util;

import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.alibaba.fastjson.JSON;

/**
 * 公共数据格式转换：时间格式，。。
 * 
 * @author huangzigao 20120426
 * 
 */
public class DataUtil {

	// 日期时间全格式 24小时制
	public static String DATETIME_FORMAT = "yyyy-MM-dd HH:mm:ss";
	public static String DATETIME_FORMAT2 = "yyyyMMddHHmmss";

	public static String DATE_ZEROTIME_FORMAT = "yyyy-MM-dd 00:00:00";
	public static String DATE_ZEROTIME_FORMAT2 = "yyyyMMdd000000";

	public static String DATE_FULLTIME_FORMAT = "yyyy-MM-dd 23:59:59";
	public static String DATE_FULLTIME_FORMAT2 = "yyyyMMdd235959";

	// 日期时间全格式 12小时制
	public static String DATETIME12_FORMAT = "yyyy-MM-dd hh:mm:ss";
	public static String DATETIME12_FORMAT2 = "yyyyMMddhhmmss";

	// 日期全格式
	public static String DATE_FORMAT = "yyyy-MM-dd";
	public static String DATE_FORMAT2 = "yyyyMMdd";

	// 年月
	public static String YEAR_MONTH_FORMAT = "yyyy-MM";
	public static String YEAR_MONTH_FORMAT2 = "yyyyMM";

	// 某年某月的第一天
	public static String YEAR_MONTH_FIRSTDAY = "yyyy-MM-01";

	// 年、月、日
	public static String YEAR_FORMAT = "yyyy";
	public static String MONTH_FORMAT = "MM";
	public static String DAY_FORMAT = "dd";

	// 时间全格式 24小时制
	public static String TIME_FORMAT = "HH:mm:ss";
	public static String TIME_FORMAT2 = "HHmmss";

	// 时间全格式 12小时制
	public static String TIME12_FORMAT = "hh:mm:ss";
	public static String TIME12_FORMAT2 = "hhmmss";

	public static String DATETIME_SLASH_FORMAT = "yyyy/MM/dd HH:mm:ss";
	public static String DATE_SLASH_FORMAT = "yyyy/MM/dd";

	private static final Logger log = LoggerFactory.getLogger(DataUtil.class);

	public DataUtil() {
	}

	/**
	 * 把String的时间转换成yyyy-MM-dd HH:mm:ss格式的Date时间。
	 * 
	 * @param inputDate
	 * @return
	 */
	public static Date tryStringToDate(String inputDate) {
		if (inputDate == null || inputDate.equalsIgnoreCase(""))
			return null;
		SimpleDateFormat sdf = new SimpleDateFormat(DATETIME_FORMAT);
		Date date = sdf.parse(inputDate, new ParsePosition(0));
		if (date == null) {
			log.error("执行函数cvtStringToDate(\"" + inputDate + "\",\"DATETIME_FORMAT\")失败，原因：SimpleDateFormat和输入日期不匹配！");
		}
		return new Date(date.getTime());
	}

	public static Date tryStrToDateYYYYMMDD(String inputDate) {
		if (inputDate == null || inputDate.equalsIgnoreCase(""))
			return null;
		SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT);
		Date date = sdf.parse(inputDate, new ParsePosition(0));
		if (date == null) {
			log.error("执行函数cvtStringToDate(\"" + inputDate + "\",\"DATETIME_FORMAT\")失败，原因：SimpleDateFormat和输入日期不匹配！");
		}
		return new Date(date.getTime());
	}

	/**
	 * 把String的时间转换成指定格式的Date时间。格式：format，可以使用此类的格式定义为入参
	 */
	public static Date tryStringToDate(String inputDate, String format) {
		if (inputDate == null || inputDate.equalsIgnoreCase(""))
			return null;
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		Date date = sdf.parse(inputDate, new ParsePosition(0));
		if (date == null) {
			log.error("执行函数cvtStringToDate(\"" + inputDate + "\",\"" + format + "\")失败，原因：SimpleDateFormat和输入日期不匹配！");
		}
		return new Date(date.getTime());
	}

	/**
	 * 把Date转换成String,格式为有入参决定strPattern，可以使用此类的格式定义为入参
	 * 
	 * @param time
	 * @param strPattern
	 * @return
	 */
	public static String tryDateToString(java.util.Date time, String strPattern) {
		SimpleDateFormat sdf = new SimpleDateFormat(strPattern);
		return sdf.format(time);
	}

	/**
	 * 把Date转换成String,格式为yyyy-MM-dd HH:mm:ss，长度为10；
	 * 
	 * @param time
	 * @return
	 */
	public static String tryDateToString(java.util.Date time) {
		if (time == null) {
			return "";
		}
		SimpleDateFormat sdf = new SimpleDateFormat(DATETIME_FORMAT);
		return sdf.format(time);
	}

	public static String tryDateToString(long time) {
		Calendar c = Calendar.getInstance();
		c.setTimeInMillis(time);
		Date date = new Date(c.getTimeInMillis());
		return tryDateToString(date);
	}

	public static String tryDateToStrYYYYMMDD(java.util.Date time) {
		SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT);
		return sdf.format(time);
	}

	/**
	 * 取当天的最后时间。在日前上自动拼上 hour:00:00
	 * 
	 * @param time
	 * @param hour
	 * @return
	 */
	public static Date getAssignTimeOfDate(java.util.Date time, int hour) {
		if (time == null) {
			return time;
		}
		Calendar c = Calendar.getInstance();
		c.setTimeInMillis(time.getTime());
		c.set(Calendar.HOUR_OF_DAY, hour);
		c.set(Calendar.MINUTE, 00);
		c.set(Calendar.SECOND, 00);
		c.set(Calendar.MILLISECOND, 0);
		return new Date(c.getTimeInMillis());
	}

	/**
	 * 取当天的最后时间。在日前上自动拼上23:59:59
	 * 
	 * @param time
	 * @return
	 */
	public static Date getLastTimeOfDate(java.util.Date time) {
		if (time == null) {
			return time;
		}
		Calendar c = Calendar.getInstance();
		c.setTimeInMillis(time.getTime());
		c.set(Calendar.HOUR_OF_DAY, 23);
		c.set(Calendar.MINUTE, 59);
		c.set(Calendar.SECOND, 59);
		c.set(Calendar.MILLISECOND, 0);
		return new Date(c.getTimeInMillis());
	}

	/**
	 * 取当天的凌晨时间。在日前上自动拼上00:00:00
	 * 
	 * @param time
	 * @return
	 */
	public static Date getFirstTimeOfDate(java.util.Date time) {
		if (time == null) {
			return time;
		}
		Calendar c = Calendar.getInstance();
		c.setTimeInMillis(time.getTime());
		c.set(Calendar.HOUR_OF_DAY, 0);
		c.set(Calendar.MINUTE, 0);
		c.set(Calendar.SECOND, 0);
		c.set(Calendar.MILLISECOND, 0);
		return new Date(c.getTimeInMillis());
	}

	public static Date getFirstTimeOfDate(long time) {
		Calendar c = Calendar.getInstance();
		c.setTimeInMillis(time);
		c.set(Calendar.HOUR_OF_DAY, 0);
		c.set(Calendar.MINUTE, 0);
		c.set(Calendar.SECOND, 0);
		c.set(Calendar.MILLISECOND, 0);
		return new Date(c.getTimeInMillis());
	}

	/**
	 * 取当天的清除：分秒。在日前上自动拼上**:00:00
	 * 
	 * @param time
	 * @return
	 */
	public static Date getFirstTimeOfHour(java.util.Date time) {
		if (time == null) {
			return time;
		}
		Calendar c = Calendar.getInstance();
		c.setTimeInMillis(time.getTime());
		// c.set(Calendar.HOUR_OF_DAY, 0);
		c.set(Calendar.MINUTE, 0);
		c.set(Calendar.SECOND, 0);
		c.set(Calendar.MILLISECOND, 0);
		return new Date(c.getTimeInMillis());
	}

	/**
	 * 取当天的清除：秒。在日前上自动拼上**:**:00
	 * 
	 * @param time
	 * @return
	 */
	public static Date getFirstTimeOfMinute(java.util.Date time) {
		if (time == null) {
			return time;
		}
		Calendar c = Calendar.getInstance();
		c.setTimeInMillis(time.getTime());
		// c.set(Calendar.HOUR_OF_DAY, 0);
		// c.set(Calendar.MINUTE, 0);
		c.set(Calendar.SECOND, 0);
		c.set(Calendar.MILLISECOND, 0);
		return new Date(c.getTimeInMillis());
	}

	/**
	 * 取当天的清除：毫秒。在日前上自动拼上**:**:**：00
	 * 
	 * @param time
	 * @return
	 */
	public static Date getFirstTimeOfSecond(java.util.Date time) {
		if (time == null) {
			return time;
		}
		Calendar c = Calendar.getInstance();
		c.setTimeInMillis(time.getTime());
		// c.set(Calendar.HOUR_OF_DAY, 0);
		// c.set(Calendar.MINUTE, 0);
		// c.set(Calendar.SECOND, 0);
		c.set(Calendar.MILLISECOND, 0);
		return new Date(c.getTimeInMillis());
	}

	public static Date getFirstYearOfDate(java.util.Date time) {
		Calendar c = Calendar.getInstance();
		c.setTimeInMillis(time.getTime());
		c.set(Calendar.MONTH, 0);
		c.set(Calendar.DAY_OF_MONTH, 1);
		c.set(Calendar.HOUR_OF_DAY, 0);
		c.set(Calendar.MINUTE, 0);
		c.set(Calendar.SECOND, 0);
		c.set(Calendar.MILLISECOND, 0);
		return new Date(c.getTimeInMillis());
	}

	public static Date getLastYearOfDate(java.util.Date time) {
		Calendar c = Calendar.getInstance();
		c.setTimeInMillis(time.getTime());
		c.set(Calendar.MONTH, 11);
		c.set(Calendar.DAY_OF_MONTH, 31);
		c.set(Calendar.HOUR_OF_DAY, 23);
		c.set(Calendar.MINUTE, 59);
		c.set(Calendar.SECOND, 59);
		c.set(Calendar.MILLISECOND, 0);
		return new Date(c.getTimeInMillis());
	}

	/**
	 * 把分秒设为零，取小时
	 * 
	 * @param cal
	 * @return
	 */
	public static Date getDateHourClearMin(Date time) {
		if (time == null) {
			return time;
		}
		Calendar c = Calendar.getInstance();
		c.setTimeInMillis(time.getTime());
		c.set(Calendar.MINUTE, 0);
		c.set(Calendar.SECOND, 0);
		c.set(Calendar.MILLISECOND, 0);
		return new Date(c.getTimeInMillis());
	}

	public static Date getDateHourClearMin(long time) {
		Calendar c = Calendar.getInstance();
		c.setTimeInMillis(time);
		c.set(Calendar.MINUTE, 0);
		c.set(Calendar.SECOND, 0);
		c.set(Calendar.MILLISECOND, 0);
		return new Date(c.getTimeInMillis());
	}

	public static Date addYear(java.util.Date time, int year) {
		if (time == null) {
			return time;
		}
		Calendar c = Calendar.getInstance();
		c.setTimeInMillis(time.getTime());
		c.set(Calendar.YEAR, c.get(Calendar.YEAR) + year);
		return new Date(c.getTimeInMillis());
	}

	public static Date addMonth(java.util.Date time, int month) {
		if (time == null) {
			return time;
		}
		Calendar c = Calendar.getInstance();
		c.setTimeInMillis(time.getTime());
		c.set(Calendar.MONTH, c.get(Calendar.MONTH) + month);
		return new Date(c.getTimeInMillis());
	}

	/**
	 * 在原来天数上加多少天。若为负数则表示减多少天。
	 * 
	 * @param time
	 * @param day
	 * @return
	 */
	public static Date addDate(java.util.Date time, int day) {
		if (time == null) {
			return time;
		}
		Calendar c = Calendar.getInstance();
		c.setTimeInMillis(time.getTime());
		c.set(Calendar.DATE, c.get(Calendar.DATE) + day);
		return new Date(c.getTimeInMillis());
	}

	/**
	 * 在原来天数上加多少分钟。若为负数则表示减多少分钟。
	 * 
	 * @param time
	 * @param minute
	 * @return
	 */
	public static Date addMinute(java.util.Date time, int minute) {
		if (time == null) {
			return time;
		}
		Calendar c = Calendar.getInstance();
		c.setTimeInMillis(time.getTime());
		c.set(Calendar.MINUTE, c.get(Calendar.MINUTE) + minute);
		return new Date(c.getTimeInMillis());
	}

	/**
	 * 在原来天数上加多少秒。若为负数则表示减多少分钟。
	 * 
	 * @param time
	 * @param minute
	 * @return
	 */
	public static Date addSecond(java.util.Date time, int second) {
		if (time == null) {
			return time;
		}
		Calendar c = Calendar.getInstance();
		c.setTimeInMillis(time.getTime());
		c.set(Calendar.SECOND, c.get(Calendar.SECOND) + second);
		return new Date(c.getTimeInMillis());
	}

	public static Date addHour(java.util.Date time, int hour) {
		if (time == null) {
			return time;
		}
		Calendar c = Calendar.getInstance();
		c.setTimeInMillis(time.getTime());
		c.set(Calendar.HOUR_OF_DAY, c.get(Calendar.HOUR_OF_DAY) + hour);
		return new Date(c.getTimeInMillis());
	}

	/**
	 * 把Date类型的日期转换成指定格式的字符串,如果时间值为null、年份小于1900、转换出错 等，返回默认值。
	 * 
	 * @param dtDate
	 *            Date 被转换的时间
	 * @param strFormatTo
	 *            String 转换的时间格式
	 * @param defaultValue
	 *            String 默认值
	 * @return String 转换后的字符串格式
	 */
	public static String cvtFormattedDate(java.sql.Date dtDate, String strFormatTo, String defaultValue) {
		String dateString = cvtFormattedDate(dtDate, strFormatTo);
		if (dateString == null || "".equals(dateString)) {
			return defaultValue;
		}

		return dateString;

	}

	public static String cvtFormattedDate(java.sql.Date dtDate, String strFormatTo) {
		if (dtDate == null) {
			return "";
		}
		strFormatTo = strFormatTo.replace('/', '-');
		try {
			SimpleDateFormat formatter = new SimpleDateFormat(strFormatTo);
			return formatter.format(dtDate);
		} catch (Exception e) {
			return "";
		}
	}

	/**
	 * Adds the specified (signed) amount of time to the given time field
	 * 
	 * @param original
	 * @param field
	 *            year:Calendar.YEAR; month:Calendar.MONTH; date:Calendar.DATE;
	 *            hour:Calendar.HOUR; minute:Calendar.MINUTE;
	 *            second:Calendar.SECOND
	 * @param amount
	 * @return
	 */
	public static Date addDateTime(Date original, int field, int amount) {
		Calendar calOriginal = Calendar.getInstance();
		calOriginal.setTime(original);

		// +1900
		GregorianCalendar calendar = new GregorianCalendar(calOriginal.get(Calendar.YEAR), calOriginal.get(Calendar.MONTH),
				calOriginal.get(Calendar.DAY_OF_MONTH), calOriginal.get(Calendar.HOUR_OF_DAY), calOriginal.get(Calendar.MINUTE),
				calOriginal.get(Calendar.SECOND));
		calendar.add(field, amount);
		Date temp = new Date(calendar.getTime().getTime());
		return temp;
	}

	/**
	 * date2-date1 等于多少天
	 * 
	 * @param date1
	 * @param date2
	 * @return
	 */
	public static long getBetweenDays(Date date1, Date date2) {
		long days = (getFirstTimeOfDate(date2).getTime() - getFirstTimeOfDate(date1).getTime()) / (24 * 60 * 60 * 1000);
		return days;
	}

	/**
	 * 获取
	 * 
	 * @param ts
	 * @return
	 */
	public static Date getEndOfAMonth(Date ts) {
		Calendar c = Calendar.getInstance();
		c.setTimeInMillis(ts.getTime());
		c.add(Calendar.MONTH, 1);
		c.set(Calendar.DAY_OF_MONTH, 1);
		c.add(Calendar.DAY_OF_MONTH, -1);
		c.set(Calendar.HOUR_OF_DAY, 23);
		c.set(Calendar.MINUTE, 59);
		c.set(Calendar.SECOND, 59);
		c.set(Calendar.MILLISECOND, 0);
		return new Date(c.getTimeInMillis());
	}

	/**
	 * 获得所在月的第一天
	 * 
	 * @param ts
	 * @return
	 */
	public static Date getStartOfAmonth(Date ts) {
		Calendar c = Calendar.getInstance();
		c.setTimeInMillis(ts.getTime());
		c.set(Calendar.DAY_OF_MONTH, 1);
		c.set(Calendar.HOUR_OF_DAY, 0);
		c.set(Calendar.MINUTE, 0);
		c.set(Calendar.SECOND, 0);
		c.set(Calendar.MILLISECOND, 0);
		return new Date(c.getTimeInMillis());

	}

	/**
	 * 获得上一年的时间
	 * 
	 * @return
	 */
	public static Date getLastYearDate() {
		Calendar c = Calendar.getInstance();
		c.set(Calendar.YEAR, c.get(Calendar.YEAR) - 1);
		return new Date(c.getTimeInMillis());
	}

	/**
	 * 根据201202 计算整个月份开始及结束时间
	 * 
	 * 返回startDate:2013-02-01 00:00:00 endDate:2013-02-29 23:59:59
	 * 
	 * @param yyyyMM
	 * @return
	 */
	public static Map<String, Date> getWholeMonthDateByYYYYMM(String yyyyMM) {

		Map<String, Date> map = new HashMap<String, Date>();
		if (StringUtils.isEmpty(yyyyMM) || yyyyMM.length() != 6) {
			return map;
		}
		// String month = DataFormat.tryDateToString(now,
		// DataFormat.YEAR_MONTH_FORMAT2);
		// System.out.println("month=" + month);
		int year = Integer.parseInt(yyyyMM.substring(0, 4));
		int mth = Integer.parseInt(yyyyMM.substring(4, 6));
		Calendar calendar = Calendar.getInstance();
		calendar.clear(); // 在使用set方法之前，必须先clear一下，否则很多信息会继承自系统当前时间
		calendar.set(Calendar.YEAR, year);
		calendar.set(Calendar.MONTH, mth - 1); // Calendar对象默认一月为0
		// int endday = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);//
		// 获得本月的天数
		// System.out.println("endday=" + endday);

		map.put("startDate", getStartOfAmonth(calendar.getTime()));
		map.put("endDate", getEndOfAMonth(calendar.getTime()));
		return map;
	}

	public static boolean isNullOrEmpty(String obj) {
		if (null == obj || "".equals(obj) || "null".equals(obj)) {
			return true;
		}
		return false;
	}

	/**
	 * 根据冻结/撤销时间+周期获得解禁时间
	 * 
	 * @param rankTime
	 * @param cancelPeriod
	 * @return
	 */
	public static Date getValidByCancelPeriod(Date rankTime, int updatePeriod, int cancelPeriod) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(rankTime);
		long longTimeStmp = cal.getTimeInMillis();
		// 下面时间只是一个周一的采样点，由原来的2011-01-03 12:00改为：2013-04-08 00:00
		// 然后再采样点上增加周期。
		// cal.set(Calendar.YEAR, 2011);
		// cal.set(Calendar.MONTH, 0);
		// cal.set(Calendar.DAY_OF_MONTH, 3);
		// cal.set(Calendar.HOUR_OF_DAY, 12);
		cal.set(Calendar.YEAR, 2013);
		cal.set(Calendar.MONTH, 3);
		cal.set(Calendar.DAY_OF_MONTH, 8);
		cal.set(Calendar.HOUR_OF_DAY, 0);
		cal.set(Calendar.MINUTE, 0);
		cal.set(Calendar.SECOND, 0);
		cal.set(Calendar.MILLISECOND, 0);
		long endStmp = cal.getTimeInMillis();
		long aWeek = (7 * 24 * 60 * 60 * 1000);
		while (endStmp < longTimeStmp) {
			endStmp += aWeek * updatePeriod;
		}
		endStmp += (aWeek * updatePeriod * (cancelPeriod - 1));
		cal.setTimeInMillis(endStmp);

		System.out.println("nowDate=" + DataUtil.tryDateToString(cal.getTime()));
		return cal.getTime();
	}

	/**
	 * 取排行上周开始结束时间(上周一-周日)
	 * 
	 * @param year
	 * @param week
	 * @return
	 */
	public static Map<String, Date> getDateByWeek(int year, int week) {
		Map<String, Date> map = new HashMap<String, Date>();
		Calendar cal = Calendar.getInstance();
		cal.setMinimalDaysInFirstWeek(7);
		cal.setFirstDayOfWeek(Calendar.MONDAY);
		cal.set(Calendar.YEAR, year);
		cal.set(Calendar.WEEK_OF_YEAR, week);
		cal.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
		cal.set(Calendar.HOUR_OF_DAY, 12);
		cal.set(Calendar.MINUTE, 0);
		cal.set(Calendar.SECOND, 0);
		cal.set(Calendar.MILLISECOND, 0);
		map.put("start", cal.getTime());
		cal.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);
		map.put("end", cal.getTime());
		return map;
	}

	/**
	 * 取得周一12点date对象
	 * 
	 * 排行历史，排行时间都写着周一12点的。故排行写表数据不变。只是一个记录标识不是控制逻辑。
	 * 
	 * @param week
	 *            周
	 * @return
	 */
	public static Date getRankDateByWeek(int year, int week) {
		Calendar cal = Calendar.getInstance();
		cal.setMinimalDaysInFirstWeek(7);
		cal.setFirstDayOfWeek(Calendar.MONDAY);
		cal.set(Calendar.YEAR, year);
		cal.set(Calendar.WEEK_OF_YEAR, week);
		cal.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
		cal.set(Calendar.HOUR_OF_DAY, 12);
		cal.set(Calendar.MINUTE, 0);
		cal.set(Calendar.SECOND, 0);
		cal.set(Calendar.MILLISECOND, 0);
		Date d = cal.getTime();
		return d;
	}

	/**
	 * 根据更新周期判断是否今天更新
	 * 
	 * @param updatePeriod
	 *            更新周期
	 * @return 是否需要更新
	 */
	public static boolean isTodyUpdate(int updatePeriod) {
		Calendar cal = Calendar.getInstance();
		long longTimeStmp = cal.getTimeInMillis();
		cal.set(Calendar.YEAR, 2011);
		cal.set(Calendar.MONTH, 0);
		cal.set(Calendar.DAY_OF_MONTH, 1);
		cal.set(Calendar.HOUR_OF_DAY, 0);
		cal.set(Calendar.MINUTE, 0);
		cal.set(Calendar.SECOND, 0);
		cal.set(Calendar.MILLISECOND, 0);
		long timeStmp = cal.getTimeInMillis();
		long betweenStmp = (longTimeStmp - timeStmp) / (7 * 24 * 60 * 60 * 1000);
		// 如果当前周除于更新周期无余数则返回true
		int updateWeek = (int) betweenStmp % updatePeriod;
		return updateWeek == 0;
	}

	/**
	 * 根据排行时间跟更新周期生成排行结束时间
	 * 
	 * @param rankTime
	 *            排行开始时间
	 * @param updatePeriod
	 *            更新周期
	 * @return 排行结束时间
	 */
	public static Date genRankEndTime(Date rankTime, int updatePeriod) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(rankTime);
		cal.add(Calendar.DAY_OF_YEAR, updatePeriod * 7);
		return cal.getTime();
	}

	/**
	 * 判断还需不需要发送系统消息
	 * 
	 * @param validTime
	 *            冻结/撤销时间
	 * @param updatePeriod
	 *            更新周期
	 * @return
	 */
	public static boolean canSendMsg(Date validTime, int updatePeriod) {
		if (validTime == null) {
			return true;
		}
		Calendar cal = Calendar.getInstance();
		cal.setTime(validTime);
		cal.add(Calendar.DAY_OF_YEAR, 7 * updatePeriod);
		if (cal.getTime().after(new Date())) {
			return true;
		}
		return false;
	}

	/**
	 * Date日期转换为UNIX_TIMESTAMP格式(数值型保存)
	 * 
	 * @param date
	 * @return
	 */
	public static long date2UNIX_TIMESTAMP(Date date) {
		if (null != date) {
			Calendar calendar = Calendar.getInstance();
			calendar.setTime(date);
			return calendar.getTimeInMillis() / 1000;
		}

		return 0;
	}

	public static boolean isNullObject(Object obj) {
		if (obj == null)
			return true;
		return false;
	}

	public static void main_test(String[] arg) {
		Date now = new Date();
		Date nextDate = DataUtil.addHour(now, 16);
		System.out.println(DataUtil.tryDateToString(nextDate));
		List<Integer> uidList = new ArrayList<Integer>();
		uidList.add(123);
		uidList.add(434);

		String result = JSON.toJSONString(uidList);
		System.out.println(result);
		List<Integer> tempList = JSON.parseObject(result, ArrayList.class);
		System.out.println(tempList);

		if (tempList != null) {
			for (int i = 0; i < tempList.size(); i++) {
				System.out.println("" + tempList.get(i));
			}
		}

		Date beginDate = DataUtil.tryStringToDate("2013-02-01 00:00:00");
		Date endDate = DataUtil.tryStringToDate("2013-02-28 23:59:59");
		if (now.getTime() >= beginDate.getTime() && now.getTime() <= endDate.getTime()) {
		}
		System.out.println(DataUtil.tryDateToString(beginDate));
		System.out.println(DataUtil.tryDateToString(endDate));

		int year = 0;
		int week = 0;
		if (week <= 0) {
			Calendar cal = Calendar.getInstance();
			cal.setMinimalDaysInFirstWeek(7);
			week = cal.get(Calendar.WEEK_OF_YEAR);
		}
		if (year <= 0) {
			Calendar cal = Calendar.getInstance();
			year = cal.get(Calendar.YEAR);
		}
		System.out.println("year=" + year + "/week=" + week);
		Calendar nowcal = Calendar.getInstance();
		System.out.println(DataUtil.tryDateToString(nowcal.getTime()));
		nowcal.setMinimalDaysInFirstWeek(7);
		nowcal.setFirstDayOfWeek(Calendar.MONDAY);
		System.out.println(DataUtil.tryDateToString(nowcal.getTime()));
		if (week == nowcal.get(Calendar.WEEK_OF_YEAR)) {
		}

		Calendar c = Calendar.getInstance();
		c.setFirstDayOfWeek(Calendar.MONDAY);
		c.setTime(new Date());
		c.set(Calendar.DAY_OF_WEEK, c.getFirstDayOfWeek()); // Monday
		System.out.println(DataUtil.tryDateToString(c.getTime()));
		Date beginTime = DataUtil.addDate(c.getTime(), -7);
		Date endTime = DataUtil.addDate(c.getTime(), -1);
		System.out.println(DataUtil.tryDateToString(DataUtil.getFirstTimeOfDate(beginTime)));
		System.out.println(DataUtil.tryDateToString(DataUtil.getLastTimeOfDate(endTime)));

		String openRate = "0.2";
		if (openRate.indexOf(".") > -1) {
			openRate = openRate.substring(0, openRate.indexOf("."));
		}
		openRate += "%";
		System.out.println(openRate);

		Date recycleDate = DataUtil.getAssignTimeOfDate(new Date(), 10);
		System.out.println(DataUtil.tryDateToString(recycleDate));

		int needAp = 2500;
		// 考核每天可能最高分
		int everyDayMaxAp = 200;
		// 已经获得的积分.
		int hadAp = 15234;
		// 还需要多少积分
		int hasNeedAp = (needAp - hadAp);
		// 完成任务最少所需天数。
		int hasNeedHowLongDay = 0;
		int remainder = 0;
		if (hasNeedAp > 0) {
			remainder = hasNeedAp % everyDayMaxAp;
			hasNeedHowLongDay = hasNeedAp / everyDayMaxAp;
			if (remainder > 0) {
				hasNeedHowLongDay = hasNeedHowLongDay + 1;
			}
		}
		Date begin = DataUtil.getFirstTimeOfDate(DataUtil.addDate(now, -14));
		Date end = DataUtil.getLastTimeOfDate(DataUtil.addDate(begin, 29));
		System.out
				.println("now=" + DataUtil.tryDateToString(now) + "/begin=" + DataUtil.tryDateToString(begin) + "/end=" + DataUtil.tryDateToString(end));
		// 是否已经到提醒时间;剩余时长<=提醒时长，则需要提醒。
		// 离考核日还有多少天。因为当天只能计算前一天的分数，故当天还没有计算。故提醒要当天早上，因为包含当天才可能达标。
		long remindDay = DataUtil.getBetweenDays(now, end) + 1;
		// 已经计算等分的天数16-1=15已经考核结果。
		long hadDealDay = DataUtil.getBetweenDays(begin, now);
		System.out.println("hasNeedHowLongDay=" + hasNeedHowLongDay + "/hadDealDay=" + hadDealDay + "/remindDay=" + remindDay + "/remainder=" + remainder);
		String enddate = "2013-04-04";

		System.out.println("enddate=" + DataUtil.tryStrToDateYYYYMMDD(enddate));

		long batchNo = now.getTime();
		System.out.println("batchNo=" + JSON.toJSONString(null));

		Calendar freezeCal = Calendar.getInstance();
		freezeCal.add(Calendar.HOUR_OF_DAY, 1);
		System.out.println("freezeCal=" + DataUtil.tryDateToString(freezeCal.getTime()));
		// 调用smanager冻结频道 频道冻结时间，转为秒s
		long freezeLength = freezeCal.getTimeInMillis() / 1000;
		System.out.println("freezeLength=" + freezeLength);

		Date nowDate = getValidByCancelPeriod(new Date(), 1, 1 + 1);
		System.out.println("nowDate=" + DataUtil.tryDateToString(nowDate));

		Calendar cal = Calendar.getInstance();
		cal.setMinimalDaysInFirstWeek(7);
		cal.setFirstDayOfWeek(Calendar.MONDAY);
		System.out.println("cal=" + DataUtil.tryDateToString(cal.getTime()));
		// test1();
		// test3();
		test_date();
		Date endDateYYYYMD = DataUtil.tryStrToDateYYYYMMDD("2013-09-03 11:42:41");
		System.out.println("endDateYYYYMD=" + DataUtil.tryDateToString(DataUtil.getLastTimeOfDate(endDateYYYYMD)));
	}

	private static void test_date() {

		Date currentDate = new Date();
		Date endTime = DataUtil.getFirstTimeOfDate(DataUtil.addDate(currentDate, -1));
		Date startTime = DataUtil.getFirstTimeOfDate(DataUtil.addDate(currentDate, -30));

		Calendar cal = Calendar.getInstance();
		cal.setTime(startTime);
		// 若不是连续的天数，给补0.
		while (cal.getTime().before(DataUtil.tryStringToDate("2013-04-30 00:00:00")) && cal.getTime().before(endTime)) {
			// 增加1天
			cal.setTime(DataUtil.addDate(cal.getTime(), 1));
		}
	}

	private static void test1() {

		String value = "{\"error\":false,\"resultMap\":{\"applyDate\":\"2013-04-12 14:33:54\",\"applyReason\":\"活动奖品短位号绑定\",\"asid\":\"10606\",\"busiId\":4,\"owUid\":117555279,\"sid\":\"67566216\"},\"success\":false}";
		Map<String, Object> paramsMap = JSON.parseObject(value, HashMap.class);
		System.out.println(JSON.toJSONString(paramsMap));
		Object resultStr = paramsMap.get("resultMap");
		Map<String, Object> resultMap = JSON.parseObject(resultStr.toString(), HashMap.class);
		if (resultMap == null) {
			// logger.debug("resultStr is null;return false.");
			// return result;
		}
		System.out.println(JSON.toJSONString(resultStr));
		String applyDate = (String) resultMap.get("applyDate");
		String applyReason = (String) resultMap.get("applyReason");
		String asid = (String) resultMap.get("asid");
		String sid = (String) resultMap.get("sid");
		String busiIdstr = String.valueOf(resultMap.get("busiId"));
		Integer busiId = (Integer) resultMap.get("busiId");
		String owUid = String.valueOf(resultMap.get("owUid"));
		// String applyId = String.valueOf(null);
		System.out.println("applyDate=" + applyDate);
		System.out.println("applyReason" + applyReason);
		System.out.println("asid" + asid);
		System.out.println("sid" + sid);
		System.out.println("busiId" + busiId);
		System.out.println("owUid" + owUid);

	}

	private static void test3() {
		Integer PP_ChannelName = 1; // 限制频道名称修改
		Integer PP_ChannelReception = 2; // 限制频道接待语修改
		Integer PP_ChannelBulletin = 3; // 限制频道公告修改
		Map<String, String> mapKey2Value = new HashMap<String, String>();
		Set<String> setDelKeys = new HashSet<String>();
		// Map<RuleKey, RuleValue> mapKey2Value = new HashMap<RuleKey,
		// RuleValue>();
		// Set<RuleKey> setDelKeys = new HashSet<RuleKey>();
		String ruleKey = new String();
		ruleKey = String.format("%s|%s|%s", 67566216, 67566216, PP_ChannelBulletin);
		String ruleValue = new String();
		ruleValue = String.format("%s|%s", "23", "testbyhzg");
		mapKey2Value.put(ruleKey, ruleValue);
		setDelKeys.add(ruleKey);

		// {\"mapKey2Value\":{\"67566216|67566216|3\":\"23|testbyhzg\"},\"setDelKeys\":[\"67566216|67566216|3\"]}

		String value = "{\"mapKey2Value\":{\"67566216|67566216|3\":\"23|testbyhzg\"},\"setDelKeys\":[\"67566216|67566216|3\"]}";
		Map<String, Object> paramsMap = JSON.parseObject(value, HashMap.class);
		System.out.println(JSON.toJSONString(paramsMap));
		Object resultStrmapKey2Value = paramsMap.get("mapKey2Value");
		Object resultStrsetDelKeys = paramsMap.get("setDelKeys");
		Map<String, Object> resultMapKey2Value = JSON.parseObject(resultStrmapKey2Value.toString(), HashMap.class);
		Set<String> resultMapDelKeys = JSON.parseObject(resultStrsetDelKeys.toString(), HashSet.class);
		System.out.println("resultStrmapKey2Value=" + JSON.toJSONString(resultStrmapKey2Value));
		System.out.println("resultStrsetDelKeys=" + JSON.toJSONString(resultStrsetDelKeys));
		System.out.println("resultMap=" + JSON.toJSONString(resultMapKey2Value));
		System.out.println("resultMapDelKeys=" + JSON.toJSONString(resultMapDelKeys));

		for (Entry<String, Object> entry : resultMapKey2Value.entrySet()) {
			String key = entry.getKey();
			String keyValue = (String) entry.getValue();
		}
		Iterator<String> itor = resultMapDelKeys.iterator();
		while (itor.hasNext()) {

		}
	}

	public static void main(String[] arg) {

		long remindDay = DataUtil.getBetweenDays(DataUtil.tryStringToDate("2013-07-28 01:00:00"), DataUtil.tryStringToDate("2013-07-28 23:59:59")) + 1;

		long hadDealDay = DataUtil.getBetweenDays(DataUtil.tryStringToDate("2013-06-29 00:00:00"), DataUtil.tryStringToDate("2013-07-28 01:00:00"));
		System.out.println("remindDay=" + remindDay + "/hadDealDay=" + hadDealDay);

		System.out.println("getFirstYearOfDate=" + DataUtil.tryDateToString(DataUtil.getFirstYearOfDate(new Date())));
		System.out.println("getLastYearOfDate=" + DataUtil.tryDateToString(DataUtil.getLastYearOfDate(new Date())));

		System.out.println((new Date()).getTime());
		System.out.println(System.currentTimeMillis());
		System.out.println((DataUtil.tryStringToDate("2013-12-30 23:59:59")).getTime());
		System.out.println((DataUtil.tryStringToDate("2014-12-30 23:59:59")).getTime());
		System.out.println((DataUtil.tryStringToDate("2015-12-30 23:59:59")).getTime());

		Date now = new Date();
		Date whiteEndDate = DataUtil.addDate(DataUtil.getLastTimeOfDate(now), Integer.valueOf("90") + 1);
		System.out.println(DataUtil.tryDateToString(whiteEndDate));

		Date addYear = DataUtil.addYear(now, 1);
		System.out.println("addYear=" + DataUtil.tryDateToString(addYear));

		Date addMonth = DataUtil.addMonth(now, 1);
		System.out.println("addMonth=" + DataUtil.tryDateToString(addMonth));

		String month = DataUtil.tryDateToString(now, DataUtil.YEAR_MONTH_FORMAT2);
		System.out.println("month=" + month);

		int year = Integer.parseInt(month.substring(0, 4));
		int mth = Integer.parseInt(month.substring(4, 6));
		Calendar calendar = Calendar.getInstance();
		calendar.clear(); // 在使用set方法之前，必须先clear一下，否则很多信息会继承自系统当前时间
		calendar.set(Calendar.YEAR, 2012);
		calendar.set(Calendar.MONTH, 2 - 1); // Calendar对象默认一月为0
		int endday = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);// 获得本月的天数
		System.out.println("endday=" + endday);
		Map<String, Date> map = getWholeMonthDateByYYYYMM("201302");
		System.out.println("startDate=" + DataUtil.tryDateToString(map.get("startDate")));
		System.out.println("endDate=" + DataUtil.tryDateToString(map.get("endDate")));
	}
}
