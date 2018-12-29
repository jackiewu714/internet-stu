package com.codegen.platform.dao.mybatis.generator;

public class DaoGeneratorTest {

	private static void genFrameDao() {
		System.out.println("genFrameDao begin");
		String[] locations = new String[] { "/mbg/base/em/mbg.xml", "/mbg/base/pc/mbg.xml", "/mbg/base/sm/mbg.xml" };
		for (String location : locations) {
			MbGenerator.generat(location);
		}
		System.out.println("genFrameDao end");
	}
	
	/**
	 * 生成protal系统的dao文件
	 * 
	 * @Title: genProtalDao
	 * @Description: 生成protal系统的dao文件
	 */
	private static void genProtalDao() {
		String[] locations = { "/mbg/portal/mbg.xml" };
		for (String location : locations) {
			MbGenerator.generat(location);
		}
		System.out.println("genProtalDao end");
	}

	/**
	 * 生成buss系统的dao文件
	 * 
	 * @Title: genBussDao
	 * @Description: 生成buss系统的dao文件
	 */
	private static void genBussDao() {
		String[] locations = {"/mbg/buss/buss/mbg.xml", "/mbg/buss/sys/mbg.xml"};
		for (String location : locations) {
			MbGenerator.generat(location);
		}
		System.out.println("genBussDao end");
	}

	/**
	 * 生成本地数据库的dao文件
	 * 
	 * @Title: genBussDao
	 * @Description: 生成buss系统的dao文件
	 */
	private static void genLocalDBDao() {
		String[] locations = {"/mbg/localdb/study/mbg.xml", "/mbg/localdb/test/mbg.xml"};
		for (String location : locations) {
			MbGenerator.generat(location);
		}
		System.out.println("genBussDao end");
	}
	
	public static void main(String args[]) {
		// genFrameDao();
		// genProtalDao();
//		genBussDao();
		genLocalDBDao();
		System.out.println("end");
	}
}
