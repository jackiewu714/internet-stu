package com.codegen.platform.dao;

public class SplitTableUtils {
    static ThreadLocal<String> tableSuffix = new ThreadLocal<String>();

    public static void setTableSuffix(String tableSuffix) {
	SplitTableUtils.tableSuffix.set(tableSuffix);
    }

    public static String getTableSuffix() {
	return SplitTableUtils.tableSuffix.get();
    }
}
