/**
 *
 */
package com.cw.platform.util.math;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.regex.Pattern;

/**
 * His系统字符串工具类
 *
 * @author songzou
 */
public class HisStringUtils {
    private static final String PREFIX = "\\u";
    private static final Pattern INT_PATTERN = Pattern.compile("^\\d+$");

    /**
     * 字符串工具类
     */
    private HisStringUtils() {
    }

    /**
     * 检查一个字符串是否为空字符串或者对象是否为空
     *
     * @param str the candidate String
     */
    public static boolean isEmpty(Object str) {
        return (str == null || "".equals(str));
    }

    /**
     * 检查指定的CharSequence是否有长度，包含空白字符
     *
     * @param str 待检查的CharSequence
     * @return 如果有长度则返回true
     * @see #hasText(String)
     */
    public static boolean hasLength(CharSequence str) {
        return (str != null && str.length() > 0);
    }

    /**
     * 判断给定的字符串是否包含非空白字符
     *
     * @param str 待检查的字符串
     * @return 如果包含一个非空格就返回true
     * @see #hasLength(CharSequence)
     */
    public static boolean hasLength(String str) {
        return hasLength((CharSequence) str);
    }

    /**
     * 判断给定的字符串是否包含非空白字符
     *
     * @param str 待检查的字符串
     * @return 如果包含一个非空格就返回true
     * @see Character#isWhitespace
     */
    public static boolean hasText(CharSequence str) {
        if (!hasLength(str)) {
            return false;
        }
        int strLen = str.length();
        for (int i = 0; i < strLen; i++) {
            if (!Character.isWhitespace(str.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    /**
     * 判断给定的字符串是否包含非空白字符
     *
     * @param str 待检查的字符串
     * @return 如果包含一个非空格就返回true
     * @see #hasText(CharSequence)
     */
    public static boolean hasText(String str) {
        return hasText((CharSequence) str);
    }

    /**
     * 判断给定字符串是否为数字
     *
     * @param str
     * @return 是否为数字
     */
    public static boolean isInteger(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        return INT_PATTERN.matcher(str).matches();
    }

    /**
     * 把以字符串形式表达的布尔值转换为对应的数字。字符串比较将忽略大小写。
     *
     * @param value 以字符串表达的布尔值。
     * @return 布尔值对应的数字，"true"转换为"1", "false"转换为"0"，其他值保持不变。
     */
    public static String convertBool(String value) {
        if ("true".equalsIgnoreCase(value)) {
            return "1";
        } else if ("false".equalsIgnoreCase(value)) {
            return "0";
        } else {
            return value;
        }
    }

    /**
     * 判断指定字符串值逻辑是否为真，'false'(不区分大小写)，'0'，''，null返回false其他返回true。
     *
     * @param value 判断的字符串值。
     * @return 布尔值。
     */
    public static boolean getBool(String value) {
        if (value == null || value.equalsIgnoreCase("false") || value.equals("0") || value.isEmpty()) {
            return false;
        } else {
            return true;
        }
    }

    /**
     * 全部替换字符串中指定子串为另一字符串。该方法不支持正则表达式， 因此较String.replace具有更高效率。
     *
     * @param string    需要替换的文本。
     * @param oldString 替换的源字符串。
     * @param newString 替换的目标字符串。
     * @return 替换后的文本。
     * @see String#replaceAll(String, String)
     */
    public static String replaceAll(String string, String oldString, String newString) {
        return innerReplace(string, oldString, newString, true);
    }

    /**
     * 替换字符串中首个指定子串为另一字符串。该方法不支持正则表达式， 因此较String.replace具有更高效率。
     *
     * @param string    需要替换的文本。
     * @param oldString 替换的源字符串。
     * @param newString 替换的目标字符串。
     * @return 替换后的文本。
     * @see String#replaceFirst(String, String)
     */
    public static String replaceFirst(String string, String oldString, String newString) {
        return innerReplace(string, oldString, newString, false);
    }

    /**
     * 替换字符串中指定子串为另一字符串。该方法不支持正则表达式， 因此较String.replace方法具有更高效率。
     *
     * @param string    需要替换的文本。
     * @param oldString 替换的源字符串。
     * @param newString 替换的目标字符串。
     * @param isAll     是否替换全部出现的字符串，true替换全部，false替换首个。
     * @return 替换后的文本。
     */
    private static String innerReplace(String string, String oldString, String newString, boolean isAll) {
        int index = string.indexOf(oldString);
        if (index == -1)
            return string;
        int start = 0, len = oldString.length();
        if (len == 0)
            return string;
        StringBuilder buffer = new StringBuilder(string.length());
        do {
            buffer.append(string.substring(start, index));
            buffer.append(newString);
            start = index + len;
            if (!isAll)
                break;
            index = string.indexOf(oldString, start);
        }
        while (index != -1);
        buffer.append(string.substring(start));
        return buffer.toString();
    }

    /**
     * 连接多个字符串为单个字符串。
     *
     * @param string 多个字符串列表。
     * @return 多个字符串连接起来的单个字符串。
     */
    public static String concat(String... string) {
        int length = 0;
        // 计算StringBuilder初始容量
        for (String str : string)
            length += str.length();
        StringBuilder buf = new StringBuilder(length);
        for (String str : string)
            buf.append(str);
        return buf.toString();
    }

    /**
     * 判断是否为boolean值.
     *
     * @param str 待判断的字符串
     * @return 是否为boolean值
     */
    public static boolean isBooleanValue(final String str) {
        return Boolean.TRUE.toString().equalsIgnoreCase(str) || Boolean.FALSE.toString().equalsIgnoreCase(str);
    }

    /**
     * 判断是否为int值.
     *
     * @param str 待判断的字符串
     * @return 是否为int值
     */
    public static boolean isIntValue(final String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (final NumberFormatException ex) {
            return false;
        }
    }

    /**
     * 判断是否为long值.
     *
     * @param str 待判断的字符串
     * @return 是否为long值
     */
    public static boolean isLongValue(final String str) {
        try {
            Long.parseLong(str);
            return true;
        } catch (final NumberFormatException ex) {
            return false;
        }
    }

    /**
     * 判断一个数字是否为金额类，且小数位不超过2
     *
     * @param decimal 金额类字符串
     * @return
     */
    public static boolean isDecimalDigits(String decimal) {
        return isDecimalDigits(decimal, 2);
    }

    /**
     * 判断一个数字是否为金额类，且小数位不超过2
     *
     * @param decimal 金额类字符串
     * @param scale   小数位
     * @return
     */
    public static boolean isDecimalDigits(String decimal, int scale) {
        BigDecimal decimalValue;
        try {
            decimalValue = new BigDecimal(decimal);
        } catch (NumberFormatException e) {
            return false;
        }
        return decimalValue.scale() <= scale;
    }

    /**
     * 合并字符串
     *
     * @param arrays
     * @param delimiters
     * @return
     */
    public static String join(String[] arrays, String delimiters) {
        if (arrays == null) {
            return "";
        }
        if (arrays.length == 1) {
            return arrays[0];
        }
        int length = arrays.length;
        StringBuilder buffer = new StringBuilder(arrays[0]);
        for (int i = 1; i < length; i++) {
            buffer.append(delimiters).append(arrays[i]);
        }
        return buffer.toString();
    }

    /**
     * 合并字符串
     *
     * @param arrays
     * @param delimiters
     * @return
     */
    public static String join(Collection<String> arrays, String delimiters) {
        if (arrays == null) {
            return "";
        }
        if (arrays.size() == 1) {
            return arrays.iterator().next();
        }
        Iterator<String> iterator = arrays.iterator();
        StringBuilder buffer = new StringBuilder(iterator.next());
        for (; iterator.hasNext(); ) {
            buffer.append(delimiters).append(iterator.next());
        }
        return buffer.toString();
    }


    private static final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");

    /**
     * 格式化时间，用于调试信息 yyyy-MM-dd HH:mm:ss:SSS
     *
     * @param date 日期类型
     * @return 返回常规的日期格式化类型
     */
    public static String formatNormalDate(Date date) {
        return isEmpty(date) ? "null" : simpleDateFormat.format(date);
    }

    /**
     * 比较两个字符串是否相同,预防空指针
     *
     * @param input1
     * @param input2
     * @return
     */
    public static boolean equals(String input1, String input2) {
        if (input1 == input2) {
            return true;
        }
        boolean hasLength1 = hasLength(input1);
        boolean hasLength2 = hasLength(input2);
        if (!hasLength1 && !hasLength2) {
            return true;
        }
        if (!hasLength1 || !hasLength2) {
            return false;
        }
        return input1.equals(input2);
    }

    /**
     * 比较两个字符串是否相同,预防空指针
     *
     * @param input1
     * @param input2
     * @return
     */
    public static boolean equalsIgnoreCase(String input1, String input2) {
        if (input1 == input2) {
            return true;
        }
        boolean hasLength1 = hasLength(input1);
        boolean hasLength2 = hasLength(input2);
        if (!hasLength1 && !hasLength2) {
            return true;
        }
        if (!hasLength1 || !hasLength2) {
            return false;
        }
        return input1.equalsIgnoreCase(input2);
    }

    /**
     * 测试一个字符串是否为空,包括NULL
     *
     * @param input 待测试的字符串
     * @return true 为空，false，不为空
     */
    public static boolean isEmpty(String input) {
        return input == null ? true : input.trim().length() == 0;
    }

    /**
     * 测试一个字符串是否不为空,包括NULL
     */
    public static boolean isNotEmpty(String input) {
        return !isEmpty(input);
    }

    /**
     * 如果字符串为NULL，则返回NULL,否则trim这个字符串
     */
    public static String safeTrim(String text) {
        return text == null ? null : text.trim();
    }

    /**
     * 如果对象为NULL，则返回NUll，否则toString()
     */
    public static String safeToString(Object input) {
        return input == null ? null : input.toString();
    }

    /**
     * 如果text为空，则返回defaultValue
     */
    public static String defaultValue(String text, String defaultValue) {
        text = safeTrim(text);
        return isNotEmpty(text) ? text : defaultValue;
    }

    /**
     * 如果text不为合法的数字，则返回defaultValue
     */
    public static int defaultValue(String text, int defaultValue) {
        text = safeTrim(text);
        if (isNotEmpty(text)) {
            try {
                return Integer.parseInt(text);
            } catch (NumberFormatException e) {
            }
        }
        return defaultValue;
    }

    /**
     * 如果text不为合法的boolean，则返回defaultValue
     */
    public static boolean defaultValue(String text, boolean defaultValue) {
        text = safeTrim(text);
        if (isNotEmpty(text)) {
            if (Boolean.TRUE.toString().equalsIgnoreCase(text) || Boolean.FALSE.toString().equalsIgnoreCase(text)) {
                return Boolean.parseBoolean(text);
            }
        }
        return defaultValue;
    }

    /**
     * 测试values是否包含了value
     *
     * @param values
     * @param value
     * @return
     */
    public static boolean isContains(String[] values, String value) {
        if (value != null && value.length() > 0 && values != null && values.length > 0) {
            for (String v : values) {
                if (value.equals(v)) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * 将本地字符串转换为Ascii字符编码
     *
     * @param str
     * @return
     */
    public static String native2Ascii(String str) {
        char[] charArray = str.toCharArray();
        StringBuffer sb = new StringBuffer();
        for (char c : charArray) {
            sb.append(char2Ascii(c));
        }
        return sb.toString();
    }

    /**
     * 将本地字符转换为Ascii字符编码
     *
     * @param c
     * @return
     */
    public static String char2Ascii(char c) {
        if (c > 255) {
            StringBuffer sb = new StringBuffer();
            sb.append(PREFIX);

            // 高8位
            int code = (c >> 8);
            String tmp = Integer.toHexString(code);
            if (tmp.length() == 1) {
                sb.append("0");
            }
            sb.append(tmp);

            // 处理低8位
            code = (c & 0xff);
            tmp = Integer.toHexString(code);
            if (tmp.length() == 1) {
                sb.append("0");
            }
            sb.append(tmp);
            return sb.toString();
        } else {
            return Character.toString(c);
        }
    }

    /**
     * 将Ascii字符编码转换为本地字符串
     *
     * @param str
     * @return
     */
    public static String acsii2Native(String str) {
        StringBuffer sb = new StringBuffer();
        int begin = 0;
        int index = str.indexOf(PREFIX);
        while (index != -1) {
            //
            sb.append(str.substring(begin, index));
            sb.append(ascii2Char(str.substring(index, index + 6)));
            begin = index + 6;
            index = str.indexOf(PREFIX, begin);
        }
        sb.append(str.substring(begin));
        return sb.toString();
    }

    /**
     * 将Ascii字符编码转换为本地字符
     *
     * @param str
     * @return
     */
    private static char ascii2Char(String str) {
        if (str.length() != 6) {
            throw new IllegalArgumentException("Ascii string of a native character must be 6 character.");
        }

        if (!PREFIX.equals(str.substring(0, 2))) {
            throw new IllegalArgumentException("Ascii string of a native character must start with \"\\u\".");
        }

        // 处理高8位
        String tmp = str.substring(2, 4);
        int code = Integer.parseInt(tmp, 16) << 8;

        // 处理低8位
        tmp = str.substring(4, 6);
        code += Integer.parseInt(tmp, 16);

        return (char) code;
    }
}
