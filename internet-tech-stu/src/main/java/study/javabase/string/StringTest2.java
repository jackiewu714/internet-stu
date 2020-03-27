package study.javabase.string;

import org.junit.Test;

/**
 * @author WuLiangzhi  2019/06/18 17:57
 */
public class StringTest2 {

    @Test
    public void testCompare(){
        String str1 = "HA0105B00801191102";
        String str2 = "HA0105B00801191102Z";

        int comp = str1.compareTo(str2);
        System.out.println("comp=" + comp);
    }

    @Test
    public void testSplit(){
        String str = "11";
        String[] strArr = str.split(",");
        System.out.println("strArr=" + strArr);
    }

}
