/**
 * @Title: XmlTest.java
 * @Package com.cw.javabase.xml
 * @Description: TODO
 * Copyright: Copyright (c) 2014 
 * Company:YY Inc
 * 
 * @author WuLiangzhi
 * @date Apr 20, 2014 12:50:31 PM
 * @version V1.0
 */

package study.javabase.xml;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.cw.stu.internet.tech.platform.util.xml.XmlUtil;

/**
 * @ClassName: XmlTest
 * @Description: TODO
 * @author WuLiangzhi
 * @date Apr 20, 2014 12:50:31 PM
 *
 */

public class XmlTest {
	
	/**
	 * log printer
	 */
	private static final Logger logger = LoggerFactory.getLogger(XmlTest.class);
	
	public void test() {

		BrcMsg bm = new BrcMsg();
		bm.setIcon("http://zbasefile.bs2.yy.com/1841-37c474862702e62dc969ba07b17ec748.jpg");
		bm.setText("YY官方黑马被黑，导致大家被踢出频道，请大家退出频道然后重新进入就好了，非常抱歉");
		bm.setLink("http://bbs.yy.com");
		
		String xml = XmlUtil.getXmlStrFromAnnoObj(bm);
		logger.info("xml:\n" + xml);
	}

	/**
	 * @Title: main
	 * @Description: TODO
	 * @param args
	 */

	public static void main(String[] args) {
		XmlTest xt = new XmlTest();
		xt.test();
	}

}
