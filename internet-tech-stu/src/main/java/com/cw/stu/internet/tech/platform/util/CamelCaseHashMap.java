package com.cw.stu.internet.tech.platform.util;

import java.util.HashMap;

/**
 * 扩展HashMap, 驼峰式命名法命名里面的key. <br>
 * 第一个单字以小写字母开始；第二个单字的首字母大写. <br>
 * 原始的key是sqlMap里的以下划线"_"分隔的, 该类把key转成驼峰式.
 */
@SuppressWarnings("serial")
public class CamelCaseHashMap<K, V> extends HashMap<String, V> {

    @Override
    public boolean containsKey(Object key) {
	return super.containsKey(CamelCaseUtil.transform((String) key));
    }

    @Override
    public V put(String key, V value) {
	return super.put(CamelCaseUtil.transform(key), value);
    }

    @Override
    public V get(Object key) {
	return super.get(key);
    }

}