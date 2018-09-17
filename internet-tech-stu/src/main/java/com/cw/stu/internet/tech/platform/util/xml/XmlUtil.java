/**
 * @Title: XmlUtil.java
 * @Package com.cw.platform.util
 * @Description: TODO
 * Copyright: Copyright (c) 2014 
 * Company:YY Inc
 * 
 * @author WuLiangzhi
 * @date Apr 20, 2014 1:09:28 PM
 * @version V1.0
 */

package com.cw.stu.internet.tech.platform.util.xml;

import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @ClassName: XmlUtil
 * @Description: TODO
 * @author WuLiangzhi
 * @date Apr 20, 2014 1:09:28 PM
 *
 */

public class XmlUtil {
	
	/**
	 * log printer
	 */
	private static final Logger logger = LoggerFactory.getLogger(XmlUtil.class);

	/**
	 * 根据注解的对象，获取其对应的xml字符串
	  * @Title: getXmlStrFromAnnoObj
	  * @Description: 根据注解的对象，获取其对应的xml字符串
	  * @param obj
	  * @return	注解的对象对应的xml字符串
	 */
	public static String getXmlStrFromAnnoObj(Object obj) {
		JAXBContext context;
		try {
			context = JAXBContext.newInstance(obj.getClass());
			Marshaller mar = context.createMarshaller();
			mar.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			mar.setProperty(Marshaller.JAXB_ENCODING, "UTF-8");
			
			StringWriter writer = new StringWriter();
			mar.marshal(obj, writer);
			
			logger.info("xml:\n" + writer.toString());
			
			return writer.toString();
		} catch (JAXBException e) {
			e.printStackTrace();
			logger.error(e.getMessage(), e);
		}
		
		return null;

	
	}
	
}
