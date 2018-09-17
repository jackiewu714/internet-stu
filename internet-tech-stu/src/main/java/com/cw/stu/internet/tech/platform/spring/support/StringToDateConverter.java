package com.cw.stu.internet.tech.platform.spring.support;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.convert.converter.Converter;

import com.cw.stu.internet.tech.platform.util.DateUtils;
import com.cw.stu.internet.tech.platform.util.StringUtil;

import java.util.Date;

/**
 * Description: 字符串转日期类型转换器
 * Author: WuLiangzhi
 * Date: 2016/12/8 19:32
 */
public class StringToDateConverter implements Converter<String, Date> {

    private static final Logger logger = LoggerFactory.getLogger(StringToDateConverter.class);

    private String pattern;

    public StringToDateConverter(String pattern) {
        this.pattern = pattern;
    }

    @Override
    public Date convert(String s) {
        if (StringUtil.isEmpty(s)) {
            return null;
        }

        return DateUtils.stringToDate(s, pattern);
    }

}
