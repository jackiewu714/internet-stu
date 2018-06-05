package study.javabase.date;

import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author WuLiangzhi  2018/06/05 22:10
 */
public class DateTest {

    /**
     * 时间格式化
     *
     * @param date 需要格式化的时间类型的参数
     * @param format 格式(如：yyyy-MM-dd)
     * @return String
     * */
    private String formatDate (final Date date, final String format)
    {
        if (null == date)
        {
            return "";
        }
        final SimpleDateFormat sdf = new SimpleDateFormat(format);
        final String dt = sdf.format(date);
        return dt;
    }

    @Test
    public void testFormat1() {
        String dateStr = formatDate(new Date(), "yyyy年MM月dd日");
        System.out.println("dateStr:" + dateStr);
    }
}
