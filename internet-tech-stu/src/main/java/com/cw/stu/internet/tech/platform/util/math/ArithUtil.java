package com.cw.stu.internet.tech.platform.util.math;

import org.apache.commons.lang.StringUtils;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * 在Java中纯Double的计算会存在精度不准确的问题<br/>
 * 参考：http://zhaow-381002134.iteye.com/blog/420369<br/>
 * http://blog.csdn.net/yinan9/article/details/17283081
 * 
 * @author wangweiquan
 */
public final class ArithUtil
{
    /**
     * double 除法
     * 
     * @param d1
     * @param d2
     * @param scale 四舍五入 小数点位数
     * @return
     * @throws IllegalArgumentException 分母为0
     */
    public static double div (final double d1, final double d2, final int scale)
    {
        // 当然在此之前，你要判断分母是否为0，
        // 为0你可以根据实际需求做相应的处理
        if (d2 == 0)
        {
            throw new IllegalArgumentException("分母不允许为0，参数信息：【" + d1 + "," + d2 + "," + scale + "】");
        }
        final BigDecimal bd1 = new BigDecimal(Double.toString (d1));
        final BigDecimal bd2 = new BigDecimal(Double.toString (d2));
        return bd1.divide (bd2, scale, BigDecimal.ROUND_HALF_UP).doubleValue ();
    }

    /**
     * double 乘法
     * 
     * @param d1
     * @param d2
     * @return
     */
    public static double mul (final double d1, final double d2)
    {
        final BigDecimal bd1 = new BigDecimal(Double.toString (d1));
        final BigDecimal bd2 = new BigDecimal(Double.toString (d2));
        return bd1.multiply (bd2).doubleValue ();
    }

    /**
     * 对double数据进行取精度.
     * 
     * @param value double数据.
     * @param scale 精度位数(保留的小数位数).
     * @param roundingMode 精度取值方式.
     * @return 精度计算后的数据.
     */
    public static double round (final double value, final int scale, final RoundingMode roundingMode)
    {
        BigDecimal bd = new BigDecimal(value);
        bd = bd.setScale (scale, roundingMode);
        final double d = bd.doubleValue ();
        bd = null;
        return d;
    }

    /**
     * double 相减
     * 
     * @param d1
     * @param d2
     * @return
     */
    public static double sub (final double d1, final double d2)
    {
        final BigDecimal bd1 = new BigDecimal(Double.toString (d1));
        final BigDecimal bd2 = new BigDecimal(Double.toString (d2));
        return bd1.subtract (bd2).doubleValue ();
    }

    /**
     * double 相加
     * 
     * @param d1
     * @param d2
     * @return
     */
    public static double sum (Double d1, Double d2)
    {
        if(d1==null)
        {
            d1=0d;
        }
        if(d2==null)
        {
            d2= 0d;
        }
        final BigDecimal bd1 = new BigDecimal(Double.toString (d1));
        final BigDecimal bd2 = new BigDecimal(Double.toString (d2));
        return bd1.add (bd2).doubleValue ();
    }

    /**
     * 保留2位小数
     * 
     * @return
     */
    public static Double accuracy (final Double douBle)
    {
        Double db = 0.0D;
        if (douBle != null)
        {
            db = douBle;
        }
//        final BigDecimal bigDecimal = new BigDecimal(db); //直接以Double类型构造BigDecimal会导致精度丢失

        // 以下面两种方式构建不会精度丢失
//        final BigDecimal bigDecimal = new BigDecimal(Double.toString(db));    //方式1
        final BigDecimal bigDecimal = BigDecimal.valueOf(db);   //方式2
        final Double d = bigDecimal.setScale (2, BigDecimal.ROUND_HALF_DOWN).doubleValue ();
        return d;
    }
    
    /**
     * 保留2位小数
     * 
     * @return
     */
    public static Double accuracy (final Double douBle, int newScale)
    {
        Double db = 0.0D;
        if (douBle != null)
        {
            db = douBle;
        }
//        final BigDecimal bigDecimal = new BigDecimal(db); //直接以Double类型构造BigDecimal会导致精度丢失

        // 以下面两种方式构建不会精度丢失
//        final BigDecimal bigDecimal = new BigDecimal(Double.toString(db));    //方式1
        final BigDecimal bigDecimal = BigDecimal.valueOf(db);   //方式2
        final Double d = bigDecimal.setScale (newScale, BigDecimal.ROUND_HALF_UP).doubleValue ();
        return d;
    }
    /**
     * 发票总数
     * 
     * @param str1 结束票据号
     * @param str2 开始票据号
     * @return
     */
    public static BigDecimal getStringAndStringSubtract (String str1, String str2)
    {
        List<String> numberStrList1 = getStringListByNumber (str1);
        List<String> numberStrList2 = getStringListByNumber (str2);
        int maxIndex1 = getMaxLengthInStringList (numberStrList1);
        int maxIndex2 = getMaxLengthInStringList (numberStrList2);
        String maxStr1 = numberStrList1.get (maxIndex1);
        String maxStr2 = numberStrList2.get (maxIndex2);
        BigDecimal bigDecimal1 = new BigDecimal(maxStr1);
        BigDecimal bigDecimal2 = new BigDecimal(maxStr2);
        return bigDecimal1.subtract (bigDecimal2).add (new BigDecimal("1"));
    }

    /**
     * 票据号加数量
     * 
     * @param str1 票据号
     * @param str2 数量
     * @return 加后的结束票据号
     */
    public static String add (String str1, String str2)
    {
        List<String> numberStrList1 = getStringListByNumber (str1);
        List<String> numberStrList2 = getStringListByNumber (str2);
        int maxIndex1 = getMaxLengthInStringList (numberStrList1);
        int maxIndex2 = getMaxLengthInStringList (numberStrList2);
        String maxStr1 = numberStrList1.get (maxIndex1);
        String maxStr2 = numberStrList2.get (maxIndex2);
        BigDecimal bigDecimal1 = new BigDecimal(maxStr1);
        BigDecimal bigDecimal2 = new BigDecimal(maxStr2);
        BigDecimal temp = bigDecimal1.add (bigDecimal2).subtract (new BigDecimal("1"));
        String value = StringUtils.leftPad (temp.toString (), maxStr1.length (), '0');
        numberStrList1.set (maxIndex1, value);
        value = "";
        for (String string : numberStrList1)
        {
            value += string;
        }

        return value;
    }

    /**
     * 票据号减数量
     * 
     * @param str1 票据号
     * @param str2 数量
     * @return 减后的开始票据号
     */
    public static String subtract (String str1, String str2)
    {
        List<String> numberStrList1 = getStringListByNumber (str1);
        List<String> numberStrList2 = getStringListByNumber (str2);
        int maxIndex1 = getMaxLengthInStringList (numberStrList1);
        int maxIndex2 = getMaxLengthInStringList (numberStrList2);
        String maxStr1 = numberStrList1.get (maxIndex1);
        String maxStr2 = numberStrList2.get (maxIndex2);
        BigDecimal bigDecimal1 = new BigDecimal(maxStr1);
        BigDecimal bigDecimal2 = new BigDecimal(maxStr2);
        BigDecimal temp = bigDecimal1.subtract (bigDecimal2).add (new BigDecimal("1"));
        String value = StringUtils.leftPad (temp.toString (), maxStr1.length (), '0');
        numberStrList1.set (maxIndex1, value);
        value = "";
        for (String string : numberStrList1)
        {
            value += string;
        }
        return value;
    }

    private static List<String> getStringListByNumber (String str)
    {
        char[] strChars = str.toCharArray ();
        List<String> list = new ArrayList<String>();
        Boolean isDigit = null;
        for (int i = 0; i < strChars.length; i++)
        {
            if (i == 0)
            {
                list.add (strChars[i] + "");
                isDigit = Character.isDigit (strChars[i]);
                continue;
            }
            if (isDigit == Character.isDigit (strChars[i]))
            {
                int index = list.size () - 1;
                String value = list.get (index);
                list.set (index, value + strChars[i]);
            }
            if (isDigit != Character.isDigit (strChars[i]))
            {
                list.add (strChars[i] + "");
            }
            isDigit = Character.isDigit (strChars[i]);
        }
        return list;
    }

    private static int getMaxLengthInStringList (List<String> list)
    {
        int length = 0;
        int index = 0;
        for (int i = 0; i < list.size (); i++)
        {
            if (list.get (i).length () > length && list.get (i).matches ("[0-9]*"))
            {
                length = list.get (i).length ();
                index = i;
            }
        }
        return index;
    }
    
    /**
     * double 除法,获取百分比
     * 
     * @param d1
     * @param d2
     * @param scale 四舍五入 小数点位数
     * @return
     * @throws IllegalArgumentException 分子为0，返回0%;分母为0,默认返回100%
     */
    public static String percent (final double d1, final double d2, final int scale)
    {
        // 当然在此之前，你要判断分母是否为0，
        // 为0你可以根据实际需求做相应的处理
        if(d1 == 0)
        {
            return "0.0%";
        }
        if (d2 == 0)
        {
            return "100%";
        }
        final BigDecimal bd1 = new BigDecimal(Double.toString (d1));
        final BigDecimal bd2 = new BigDecimal(Double.toString (d2));
        Double dou = ArithUtil.mul(bd1.divide (bd2, scale, BigDecimal.ROUND_HALF_UP).doubleValue (), 100);
        return dou.toString()+"%";
    }
    
    /**
     * 
     */
    private ArithUtil()
    {
        throw new UnsupportedOperationException();
    }

    public static void main (String[] args)
    {
        BigDecimal bigDecimal = new BigDecimal(1.555);
        Double d = bigDecimal.setScale (2, BigDecimal.ROUND_HALF_UP).doubleValue ();

        //向下取整 保留2位小数
        System.out.println (d);
        bigDecimal = new BigDecimal(1.551);
        double b = bigDecimal.setScale (2, BigDecimal.ROUND_HALF_UP).doubleValue ();
        //向下
        System.out.println (b);

        DecimalFormat df   = new DecimalFormat("######0.00");
        String a=df.format (1.551);

        System.out.println (a);

        double dt = 0.0d;
        Double dd = ArithUtil.accuracy(null);
        if(dt == dd.doubleValue()) {
            System.out.println("dt==dd");
        } else {
            System.out.println("dt!=dd");
        }
    }
}
