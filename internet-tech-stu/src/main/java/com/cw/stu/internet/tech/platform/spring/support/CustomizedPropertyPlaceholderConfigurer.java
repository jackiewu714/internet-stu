/**
 * @Title: CustomizedPropertyPlaceholderConfigurer.java
 * @Package com.yy.cspp.common.spring
 * @Description: TODO
 * Copyright: Copyright (c) 2014
 * Company:YY Inc
 * @author WuLiangzhi
 * @date Oct 16, 2014 5:17:30 PM
 * @version V1.0
 */

package com.cw.stu.internet.tech.platform.spring.support;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * ClassName: CustomizedPropertyPlaceholderConfigurer
 * Description: TODO
 * Author WuLiangzhi
 * Date Oct 16, 2014 5:17:30 PM
 */

public class CustomizedPropertyPlaceholderConfigurer extends PropertyPlaceholderConfigurer {

    /**
     * 存放 spring加载的properties文件中的键值对
     */
    private static Map<String, String> ctxPropertiesMap = new HashMap<String, String>();

    @Override
    protected void processProperties(ConfigurableListableBeanFactory beanFactoryToProcess, Properties props)
            throws BeansException {

        super.processProperties(beanFactoryToProcess, props);

        for (Object keyObj : props.keySet()) {
            String key = keyObj.toString();
            String value = props.getProperty(key);
            ctxPropertiesMap.put(key, value);
        }
    }

    /**
     * 根据properties中的key获取对应的value
     *
     * @param errorCode int
     * @return String
     */
    public static String getPropertiesValueByKey(int errorCode) {
        return ctxPropertiesMap.get(String.valueOf(errorCode));
    }

}
