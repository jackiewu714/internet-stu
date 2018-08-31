package study.javabase.string;

import com.alibaba.fastjson.JSON;
import com.cw.platform.util.math.HisStringUtils;
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

    @Ignore
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

    @Ignore
    @Test
    public void testGetString() {
        int i = 3;
        String s = getString(i);
        System.out.println("s=" + s);
    }

    /**
     * 获取字符串，如果obj为空则返回null
     * @param obj   Object
     * @return  String
     */
    public static String getString(Object obj) {
        if(obj == null) {
            return null;
        }
        return obj.toString();
    }

    @Test
    public void testReplaceString(){
        String insurLevelName = "甲类";
        insurLevelName = "乙类";
        insurLevelName = "丙类";
//        insurLevelName = null;
//        insurLevelName = "112";
//        insurLevelName = "甲类乙类丙类类";
        String sName = getSimpleInsurLevelName(insurLevelName);
        System.out.println(String.format("insurLevelName=%s, sName=%s", insurLevelName, sName));
    }

    private String getSimpleInsurLevelName(String insurLevelName) {
        if(HisStringUtils.isEmpty(insurLevelName)) {
            return "";
        }

        return insurLevelName.replaceAll("类", "");
    }

    @Test
    public void testFilePath() {
        String filePath = "c:\\111\\222\\test.xlsx";
        int lIdx = filePath.lastIndexOf("\\");
        System.out.println("lIdx=" + lIdx);

        String fileName = filePath.substring(lIdx + 1);
        System.out.println("fileName=" + fileName);

        filePath = filePath.replaceAll("\\\\", "/");
        System.out.println("filePath=" + filePath);
        lIdx = filePath.lastIndexOf("/");
        if (lIdx > 0) {
            fileName = filePath.substring(lIdx + 1);
        }
        System.out.println("fileName=" + fileName);

    }

}
