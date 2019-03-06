package com.cw.stu.internet.tech.platform.dao;

import org.apache.commons.lang.StringUtils;

public class DataSourceSwitcher {
    private static final ThreadLocal<String> contextHolder = new ThreadLocal<String>();

    public static void setDataSourceKey(String dataSourceType) {
        contextHolder.set(dataSourceType);
    }

    public static String getDataSourceKey() {
        String key = (String) contextHolder.get();
        if (StringUtils.isEmpty(key)) {
            key = "DEFAULT";
        }
        return key;
    }

    public static void clearDataSourceKey() {
        contextHolder.remove();
    }

}
