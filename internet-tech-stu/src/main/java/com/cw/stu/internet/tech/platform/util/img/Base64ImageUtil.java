/**
 * @Title: Base64ImageUtil.java
 * @Package com.duowan.coreuser.common
 * @Description: 图片base64编码工具类
 * Copyright: Copyright (c) 2011
 * Company:YY Inc
 * @author WuLiangzhi
 * @date 2013年12月7日 下午5:03:05
 * @version V1.0
 */

package com.cw.stu.internet.tech.platform.util.img;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import org.apache.log4j.Logger;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

/**
 * @author WuLiangzhi
 * @ClassName: Base64ImageUtil
 * @Description: 图片base64编码工具类
 * @date 2013年12月7日 下午5:03:05
 */
public class Base64ImageUtil {

    /**
     * log printer
     */
    private static final Logger logger = Logger.getLogger(Base64ImageUtil.class);

    /**
     * 根据本地图片地址生成base64字符串
     *
     * @param imgFilePath 本地图片地址
     * @return 图片的base64编码字符串
     * @Title: getLocalImageBase64Str
     * @Description: 根据本地图片地址生成base64字符串
     */
    public static String getLocalImageBase64Str(String imgFilePath) {// 将图片文件转化为字节数组字符串，并对其进行Base64编码处理
        byte[] data = null;

        // 读取图片字节数组
        try {
            InputStream inStream = new FileInputStream(imgFilePath);
            data = readInputStream(inStream);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return getBase64codeByByteArr(data);// 返回Base64编码过的字节数组字符串
    }

    /**
     * 根据图片的http地址生成base64字符串
     *
     * @param imgFilePath 图片http地址
     * @return 图片的base64编码字符串
     * @Title: getLocalImageBase64Str
     * @Description: 根据图片的http地址生成base64字符串
     */
    public static String getHttpImageBase64Str(String imgFilePath) {// 将图片文件转化为字节数组字符串，并对其进行Base64编码处理
        byte[] data = null;

        // 读取图片字节数组
        InputStream inStream = null;
        try {
            URL url = new URL(imgFilePath);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setReadTimeout(5 * 1000);

            inStream = conn.getInputStream();

            data = readInputStream(inStream);
        } catch (IOException e) {
            e.printStackTrace();
            logger.error(e.getMessage(), e);
        } finally {
            try {
                inStream.close();
            } catch (IOException e) {
                e.printStackTrace();
                logger.error(e.getMessage(), e);
            }

        }

        return getBase64codeByByteArr(data);// 返回Base64编码过的字节数组字符串
    }

    /**
     * 根据字节数组生成图片base64编码字符串
     *
     * @param byteArr 字节数组
     * @return base64编码字符串
     * @Title: getBase64codeByByteArr
     * @Description: 根据字节数组生成图片base64编码字符串
     */
    public static String getBase64codeByByteArr(byte[] byteArr) {
        // 对字节数组Base64编码
        BASE64Encoder encoder = new BASE64Encoder();
        return encoder.encode(byteArr);// 返回Base64编码过的字节数组字符串
    }

    /**
     * 读取输入流中的全部内容，并返回字节数组
     *
     * @param inStream InputStream
     * @return 字节数组
     * @Title: readInputStream
     * @Description: 读取输入流中的全部内容，并返回字节数组
     */
    public static byte[] readInputStream(InputStream inStream) {
        ByteArrayOutputStream outStream = new ByteArrayOutputStream();
        byte[] outByte = null;
        byte[] buffer = new byte[1024];
        int len = 0;
        try {
            while ((len = inStream.read(buffer)) != -1) {
                outStream.write(buffer, 0, len);
            }
            outByte = outStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            logger.error(e.getMessage(), e);
        } finally {
            try {
                outStream.close();
            } catch (IOException e) {
                e.printStackTrace();
                logger.error(e.getMessage(), e);
            }
        }
        return outByte;
    }

    /**
     * 根据图片的base64编码字符串，还原图片
     *
     * @param imgBase64Str 图片的base64编码字符串
     * @param imgFilePath  生成图片的本地路径
     * @return
     * @Title: generateImageFromBase64Str
     * @Description: 根据图片的base64编码字符串，还原图片
     */
    public static byte[] decodeImageBase64Str(String imgBase64Str) {// 对字节数组字符串进行Base64解码并生成图片
        byte[] bytes = null;
        if (imgBase64Str == null) // 图像数据为空
            return bytes;
        BASE64Decoder decoder = new BASE64Decoder();
        try {
            // Base64解码
            bytes = decoder.decodeBuffer(imgBase64Str);
            for (int i = 0; i < bytes.length; ++i) {
                if (bytes[i] < 0) {// 调整异常数据
                    bytes[i] += 256;
                }
            }
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
        }
        return bytes;
    }

    /**
     * 根据图片的base64编码字符串，还原图片
     *
     * @param imgBase64Str 图片的base64编码字符串
     * @param imgFilePath  生成图片的本地路径
     * @return
     * @Title: generateImageFromBase64Str
     * @Description: 根据图片的base64编码字符串，还原图片
     */
    public static boolean generateImageFromBase64Str(String imgBase64Str, String imgFilePath) {// 对字节数组字符串进行Base64解码并生成图片
        if (imgBase64Str == null) // 图像数据为空
            return false;
        BASE64Decoder decoder = new BASE64Decoder();
        try {
            // Base64解码
            byte[] bytes = decoder.decodeBuffer(imgBase64Str);
            for (int i = 0; i < bytes.length; ++i) {
                if (bytes[i] < 0) {// 调整异常数据
                    bytes[i] += 256;
                }
            }
            // 生成jpeg图片
            OutputStream out = new FileOutputStream(imgFilePath);
            out.write(bytes);
            out.flush();
            out.close();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static void main(String[] args) {
        // 测试从Base64编码转换为图片文件

        // 测试从本地图片文件转换为Base64编码
        String imgLocalFilePath = "D:\\Download\\coreuser\\20131203_3318_867249290_2.jpg";
        String base64LocalImgStr = getLocalImageBase64Str(imgLocalFilePath);
        System.out.println("getLocalImageBase64Str base64LocalImgStr:\n" + base64LocalImgStr);

        // 测试从图片http地址转换为Base64编码
        // String imgHttpFilePath =
        // "http://wenwen.soso.com/p/20110806/20110806170531-206508948.jpg";
        // String base64HttpImgStr = getHttpImageBase64Str(imgHttpFilePath);
        // System.out.println("getHttpImageBase64Str base64HttpImgStr:\n" +
        // base64HttpImgStr);

        // 根据图片的base64编码字符串，还原图片
        // String imgFilePathNew =
        // "D:\\Download\\coreuser\\20131203_3318_867249290_2_new.jpg";
        // GenerateImage(base64HttpImgStr, imgFilePathNew);
    }

}
