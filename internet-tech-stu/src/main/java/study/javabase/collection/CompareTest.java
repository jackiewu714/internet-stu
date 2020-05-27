package study.javabase.collection;

import com.alibaba.fastjson.JSON;
import com.cw.stu.internet.tech.platform.util.DateUtils;
import org.junit.Test;

import java.util.*;

/**
 * @author WuLiangzhi  2020/05/27 11:01
 */
public class CompareTest {

    @Test
    public void testListCompare() {
        List<Rek> rekList = new ArrayList<Rek>();
        Rek rek0 = new Rek(0L,"02-THTEST1-000000", null);
        Rek rek1 = new Rek(1L,"02-THTEST1-000001", DateUtils.stringToDate("1976-01-01 12:01:01", DateUtils.SHOWING_DATE_TIME_FORMAT));
        Rek rek2 = new Rek(2L,"02-THTEST1-000002", DateUtils.stringToDate("2000-02-01 12:01:01", DateUtils.SHOWING_DATE_TIME_FORMAT));
        Rek rek3 = new Rek(3L,"02-THTEST1-000003", DateUtils.stringToDate("2020-03-01 12:01:01", DateUtils.SHOWING_DATE_TIME_FORMAT));
        Rek rek4 = new Rek(4L,"02-THTEST1-000004", null);

        rekList.add(rek0);
        rekList.add(rek1);
        rekList.add(rek2);
        rekList.add(rek3);
        rekList.add(rek4);
        System.out.println("testListCompare 排序前, rekList=" + JSON.toJSONString(rekList));

        Collections.sort(rekList, new Comparator<Rek>() {
            @Override
            public int compare(Rek o1, Rek o2) {
                if(o1.getRekDate() == null || o2.getRekDate() == null) {
                    return o1.getId()>o2.getId()?-1:1;
                }
                if(o1.getRekDate().getTime() > o2.getRekDate().getTime()) {
                    return  -1;
                } else if(o1.getRekDate().getTime() < o2.getRekDate().getTime()) {
                    return  1;
                }
                return 0;
            }
        });

        System.out.println("testListCompare 排序后, rekList=" + JSON.toJSONString(rekList));
    }

}

class Rek {
    /**
     * 主键标识.
     */
    private Long id;
    /**
     * 结算编号
     */
    private String rekNo;

    /**
     * 结算日期.
     */
    private Date rekDate;

    public Rek(Long id, String rekNo, Date rekDate) {
        this.id = id;
        this.rekNo = rekNo;
        this.rekDate = rekDate;
    }

    /**
     * 获取 id 属性
     *
     * @return Long
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置 m_id 属性
     *
     * @param id Long
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取 rekNo 属性
     *
     * @return String
     */
    public String getRekNo() {
        return rekNo;
    }

    /**
     * 设置 m_rekNo 属性
     *
     * @param rekNo String
     */
    public void setRekNo(String rekNo) {
        this.rekNo = rekNo;
    }

    /**
     * 获取 rekDate 属性
     *
     * @return Date
     */
    public Date getRekDate() {
        return rekDate;
    }

    /**
     * 设置 rekDate 属性
     *
     * @param rekDate Date
     */
    public void setRekDate(Date rekDate) {
        this.rekDate = rekDate;
    }
}
