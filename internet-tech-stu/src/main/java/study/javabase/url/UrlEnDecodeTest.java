/**
 * @Title: UrlEnDecodeTest.java
 * @Package com.cw.javabase.url
 * @Description: TODO
 * Copyright: Copyright (c) 2014 
 * Company:YY Inc
 * 
 * @author WuLiangzhi
 * @date Apr 21, 2014 7:23:48 PM
 * @version V1.0
 */

package study.javabase.url;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.internal.runners.JUnit4ClassRunner;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import junit.framework.TestCase;

/**
 * @ClassName: UrlEnDecodeTest
 * @Description: 
 * @author WuLiangzhi
 * @date Apr 21, 2014 7:23:48 PM
 *
 */
@RunWith(JUnit4ClassRunner.class)
public class UrlEnDecodeTest extends TestCase{
	
	/**
	 * log printer
	 */
	private static final Logger logger = LoggerFactory.getLogger(UrlEnDecodeTest.class);
	
	
	@Test
	public void encodeTest() {
		StringBuffer sb = new StringBuffer();
		sb.append("<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?><brcmsg>");
		sb.append("<icon>http://zbasefile.bs2.yy.com/20130918153325.jpg</icon>");
		sb.append("<link>yy://pd-[sid=14055639&amp;subid=14055639]</link>");
		sb.append("<text>游戏公测了，欢迎免费玩</text>");
		sb.append("</brcmsg>");
		
		logger.info("UrlEnDecodeTest->encodeTest, before encode sb:{}", sb.toString());
		try {
			String encodeStr = URLEncoder.encode(sb.toString(), "UTF-8");
			logger.info("UrlEnDecodeTest->encodeTest, after encode sb:{}", encodeStr);
		} catch (UnsupportedEncodingException e) {
			logger.error(e.getMessage(), e);
		}

	}
	
	@Test
	public void decodeTest() {
		String encodeStr = "%3C%3Fxml+version%3D%221.0%22+encoding%3D%22UTF-8%22+standalone%3D%22yes%22%3F%3E%3Cbrcmsg%3E%3Cicon%3Ehttp%3A%2F%2Fzbasefile.bs2.yy.com%2F20130918153325.jpg%3C%2Ficon%3E%3Clink%3Eyy%3A%2F%2Fpd-%5Bsid%3D14055639%26amp%3Bsubid%3D14055639%5D%3C%2Flink%3E%3Ctext%3E%E6%B8%B8%E6%88%8F%E5%85%AC%E6%B5%8B%E4%BA%86%EF%BC%8C%E6%AC%A2%E8%BF%8E%E5%85%8D%E8%B4%B9%E7%8E%A9%3C%2Ftext%3E%3C%2Fbrcmsg%3E";
		logger.info("UrlEnDecodeTest->decodeTest, encodeStr:{}", encodeStr);
		
		String decodeStr;
		try {
			decodeStr = URLDecoder.decode(encodeStr, "UTF-8");
			logger.info("UrlEnDecodeTest->decodeTest, decodeStr:{}", decodeStr);
		} catch (UnsupportedEncodingException e) {
			logger.error(e.getMessage(), e);
		}
	}


}
