package com.cw.stu.internet.tech.platform.dao.mybatis.generator;

import java.util.Properties;

public class ConstantGeneratorTest extends BaseGenerator {

	public static void main(String args[]) {
		Properties prop = System.getProperties();
		prop.put("constantPackage", "com.codegen.core.common.constant.gen");

		String[] locations = { "/mbg/base/util/mbg.xml" };
		for (String location : locations) {
			MbGenerator.generat(location);
			// MbGenerator.generat(location, prop);
		}
		System.out.println("end");
	}
}