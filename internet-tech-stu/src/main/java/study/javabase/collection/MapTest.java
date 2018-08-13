package study.javabase.collection;

import com.alibaba.fastjson.JSON;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * @author WuLiangzhi  2018/08/13 18:05
 */
public class MapTest {

    @Test
    public void test1() {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("obj", 1);

        List<Map<String, Object>> list = (List<Map<String, Object>>) map.get("appItemList");
        for (Map<String, Object> tmpMap : list) {
            System.out.println(JSON.toJSONString(tmpMap));
        }

    }

}
