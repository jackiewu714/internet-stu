package com.cw.stu.internet.tech.platform.dao.mybatis.generator;

public class TestGeneratorTest {

	public static void main(String args[]) {
		String[] locations = { "/mbg/wildman/util/mbg.xml" };
		for (String location : locations) {
			MbGenerator.generat(location);
		}
	}
}
