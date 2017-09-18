/**
 * @Title: RegexTest.java
 * @Package com.cw.regex
 * @Description: TODO
 * Copyright: Copyright (c) 2014 
 * Company:YY Inc
 * 
 * @author WuLiangzhi
 * @date Apr 20, 2014 10:38:23 AM
 * @version V1.0
 */

package study.javabase.regex;

import java.util.regex.Pattern;

/**
 * @ClassName: RegexTest
 * @Description: TODO
 * @author WuLiangzhi
 * @date Apr 20, 2014 10:38:23 AM
 *
 */

public class RegexTest {
	
	/**
	 * 使用正则表达式相关工具类匹配
	  * @Title: test1
	  * @Description: TODO
	 */
	public void test1() {
		String ptRegex = "^yy://{1}[\\S]*$";
		Pattern pattern = Pattern.compile(ptRegex);
		String pt1 = "yy://";
		String pt2 = "yy://pd-[sid=14055639&subid=14055639]";
		String pt3 = "123yy://456";
		String pt4 = "123yy://pd-[sid=14055639&subid=14055639]456";
		String pt5 = "yy://yxdt-[key=游戏名字&from=来源]";
		System.out.println("pt1=" + pattern.matcher(pt1).find());
		System.out.println("pt2=" + pattern.matcher(pt2).find());
		System.out.println("pt3=" + pattern.matcher(pt3).find());
		System.out.println("pt4=" + pattern.matcher(pt4).find());
		System.out.println("pt5=" + pattern.matcher(pt5).find());
	}
	
	/**
	 * 使用 String 的matches方法匹配
	  * @Title: test2
	  * @Description: TODO
	 */
	public void test2() {
		String ptRegex = "^yy://{1}[\\S]*$";
		System.out.println("yy://, ret=" + "yy://".matches(ptRegex));
		System.out.println("yy://pd-[sid=14055639&subid=14055639], ret=" + "yy://pd-[sid=14055639&subid=14055639]".matches(ptRegex));
		System.out.println("123yy://, ret=" + "123yy://".matches(ptRegex));
		System.out.println("123yy://pd-[sid=14055639&subid=14055639], ret=" + "123yy://pd-[sid=14055639&subid=14055639]".matches(ptRegex));
	}
	

	/**
	 * @Title: main
	 * @Description: TODO
	 * @param args
	 */

	public static void main(String[] args) {
		RegexTest rt = new RegexTest();
		rt.test2();
		
		rt.test1();
	}

}
