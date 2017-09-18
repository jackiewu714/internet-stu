/**
 * @Title: DateEditor.java
 * @Package com.yy.rp.common.web.property
 * @Description: spring mvc页面的时间参数转换为Date对象
 * Copyright: Copyright (c) 2014 
 * Company:YY
 * 
 * @author WuLiangzhi
 * @date May 9, 2014 10:12:45 AM
 * @version V1.0
 */

package com.cw.platform.spring.property;

import java.beans.PropertyEditorSupport;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StringUtils;

/**
 * @ClassName: DateEditor
 * @Description: spring mvc页面的时间参数转换为Date对象
 * @author WuLiangzhi
 * @date May 9, 2014 10:12:45 AM
 * 
 */

public class DateEditor extends PropertyEditorSupport {

	/**
	 * log printer
	 */
	private static final Logger logger = LoggerFactory.getLogger(DateEditor.class);

	private static final DateFormat DATEFORMAT = new SimpleDateFormat("yyyy-MM-dd");
	private static final DateFormat TIMEFORMAT = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

	private DateFormat dateFormat;
	private boolean allowEmpty = true;

	public DateEditor() {
	}

	public DateEditor(DateFormat dateFormat) {
		this.dateFormat = dateFormat;
	}

	public DateEditor(DateFormat dateFormat, boolean allowEmpty) {
		this.dateFormat = dateFormat;
		this.allowEmpty = allowEmpty;
	}

	/**
	 * Parse the Date from the given text, using the specified DateFormat.
	 */
	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		if (this.allowEmpty && !StringUtils.hasText(text)) {
			// Treat empty String as null value.
			setValue(null);
		} else {
			try {
				if (this.dateFormat != null)
					setValue(this.dateFormat.parse(text));
				else {
					if (text.contains(":"))
						setValue(TIMEFORMAT.parse(text));
					else
						setValue(DATEFORMAT.parse(text));
				}
			} catch (ParseException ex) {
				logger.error(ex.getMessage(), ex);
				throw new IllegalArgumentException("Could not parse date: " + ex.getMessage(), ex);
			}
		}
	}

	/**
	 * Format the Date as String, using the specified DateFormat.
	 */
	@Override
	public String getAsText() {
		Date value = (Date) getValue();
		DateFormat dateFormat = this.dateFormat;
		if (dateFormat == null)
			dateFormat = TIMEFORMAT;
		return (value != null ? dateFormat.format(value) : "");
	}
}
