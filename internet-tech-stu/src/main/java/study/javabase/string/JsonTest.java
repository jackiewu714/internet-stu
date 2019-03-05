package study.javabase.string;

import com.alibaba.fastjson.JSON;
import org.junit.Test;

import java.util.Map;

/**
 * @author WuLiangzhi  2019/01/09 17:17
 */
public class JsonTest {

    @Test
    public void testMap() {
        String jsonStr = "{\"SQYY03\":{\"open\":false,\"effStartDate\":\"08:30:00\",\"effEndDate\":\"23:00:00\"},\"ZJYY01\":{\"open\":false,\"effStartDate\":\"08:30:00\",\"effEndDate\":\"23:00:00\"},\"ZJYY02\":{\"open\":false,\"effStartDate\":\"08:30:00\",\"effEndDate\":\"23:00:00\"}}";
        Map map = JSON.parseObject(jsonStr, Map.class);
        System.out.println("map: " + map);

        Object obj = map.get("SQYY03");
        System.out.println("obj: " + JSON.toJSONString(obj));

    }

}
