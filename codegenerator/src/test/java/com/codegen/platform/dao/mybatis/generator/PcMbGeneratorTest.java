package com.codegen.platform.dao.mybatis.generator;

public class PcMbGeneratorTest {

	/**
	 * @param args	String[]
	 */
	public static void main(String[] args) {
		String location = "/mbg/base/pc/mbg.xml";
		MbGenerator.generat(location);
	}

}
