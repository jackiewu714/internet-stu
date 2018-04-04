package study.javabase.string;

import com.alibaba.fastjson.JSON;
import org.junit.Ignore;
import org.junit.Test;

/**
 * @author WuLiangzhi  2018/04/04 9:47
 */
public class StringTest {

    @Ignore
    @Test
    public void testCheckCardOld() {
        String trackData = "%E?;2900045138=99015015659;";
        trackData = "%E?;2900045138=99015015659?+E?";
        String[] list1 = null;
        String[] list2 = null;
        String trackDataTmp = null;
        //截取第二磁道
        //若trackData包含英文?;
        if (trackData.contains(";")) {
            list1 = trackData.split(";");
        }
        //若trackData包含中文？；
        else if (trackData.contains("；")) {
            list1 = trackData.split("；");
        }
        //若中英文符号都不包含，则将整个trackData传入trackDataTmp
        if (list1 == null || list1.length == 1) {
            trackDataTmp = trackData;
        } else {
            trackDataTmp = list1[1];
        }
        if (trackDataTmp.contains("?")) {
            list2 = trackDataTmp.split("\\?");
        } else {
            list2 = trackDataTmp.split("？");
        }

        System.out.println("list1=" + JSON.toJSONString(list1));
        System.out.println("list2=" + JSON.toJSONString(list2));
    }

    @Test
    public void testCheckCardNew(){
        String trackData = "%E?;2900045138=99015015659;";
        trackData = "%E?;2900045138=99015015659?+E?";
        trackData = trackData.replaceAll("；", ";").replaceAll("？", "?");

        String[] list1 = trackData.split(";");
        String[] list2 = null;
        String trackDataTmp = null;
        String param = null;
        String[] results = null;
        String result = "-1";

        if (list1 == null || list1.length == 1) {
            trackDataTmp = trackData;
        } else {
            trackDataTmp = list1[1];
        }

        if (trackDataTmp.contains("?")) {
            list2 = trackDataTmp.split("\\?");
        }

        if (list2 != null && list2.length > 0) {
            param = list2[0];
        }

        System.out.println("list1=" + JSON.toJSONString(list1));
        System.out.println("list2=" + JSON.toJSONString(list2));
        System.out.println("param=" + JSON.toJSONString(param));

    }

}
