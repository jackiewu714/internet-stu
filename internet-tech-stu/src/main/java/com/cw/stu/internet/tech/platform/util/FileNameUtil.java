/**
 * @Title: BroadcastUtil.java
 * @Package com.yy.zbase.business.inteyyadmin.broadcast.util
 * @Description: 频道广播工具类
 * Copyright: Copyright (c) 2011
 * Company:YY Inc
 * @author WuLiangzhi
 * @date Dec 14, 2013 3:48:37 PM
 * @version V1.0
 */

package com.cw.stu.internet.tech.platform.util;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import com.cw.stu.internet.tech.platform.util.math.RandomUtil;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @ClassName: BroadcastUtil
 * @Description: 频道广播工具类
 * @author WuLiangzhi
 * @date Dec 14, 2013 3:48:37 PM
 *
 */

public class FileNameUtil {

    /**
     * log printer
     */
    private static final Logger logger = LoggerFactory.getLogger(FileNameUtil.class);

    /**
     * 把File转换为byte
     *
     * @Title: getBytesFromFile
     * @Description: 把File转换为byte
     * @param file
     *            File
     * @return byte[]
     */
    public static byte[] getBytesFromFile(File file) {
        if (file == null) {
            return null;
        }
        InputStream stream = null;
        ByteArrayOutputStream out = null;
        try {
            stream = new FileInputStream(file);
            out = new ByteArrayOutputStream(1000);
            byte[] b = new byte[1000];
            int n;
            while ((n = stream.read(b)) != -1)
                out.write(b, 0, n);
            return out.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                stream.close();
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    /**
     * 根据业务类型和文件后缀名生成新的文件名称(生成格式：业务类型_时间字符串(yyMMddHHmmssSSS)+3位随机数.后缀名)
     *
     * @Title: generateFileNameByEFN
     * @Description:
     *               根据业务类型和文件后缀名生成新的文件名称(生成格式 ： 业务类型_时间字符串 ( yyMMddHHmmssSSS)+3位随机数.
     *               后缀名)
     * @param busiType
     *            业务类型
     * @param extraFileName
     *            文件后缀名
     * @return 生成的文件名
     * @throws BusiException
     */
    public static String generateFileNameByEFN(String busiType, String extraFileName) throws Exception {
        if (StringUtils.isEmpty(extraFileName)) {
            throw new Exception("文件名后缀不能为空");
        }
        String genFileName = busiType + "-" + RandomUtil.getCurrentDateString() + RandomUtil.generateRandomString(3)
                + "." + extraFileName;
        if (logger.isInfoEnabled()) {
            logger.info("BroadcastUtil->generateFileNameByEFN busiType={}, extraFileName={}, genFileName={}",
                    new Object[]{busiType, extraFileName, genFileName});
        }
        return genFileName;
    }

    /**
     * 根据业务类型和文件全名生成新的文件名称(生成格式：业务类型_时间字符串(yyMMddHHmmssSSS)+3位随机数.后缀名)
     *
     * @Title: generateFileNameByWFN
     * @Description: 生成文件名称(生成格式 ： 业务类型_时间字符串 ( yyMMddHHmmssSSS)+3位随机数.后缀名)
     * @param busiType
     *            业务类型
     * @param fileName
     *            文件全名
     * @return 生成的文件名
     * @throws BusiException
     */
    public static String generateFileNameByWFN(String busiType, String fileName) throws Exception {
        if (StringUtils.isEmpty(fileName) || fileName.indexOf(".") < 0) {
            throw new Exception("文件全名错误");
        }
        String extraFileName = fileName.substring(fileName.lastIndexOf(".") + 1);
        String genFileName = generateFileNameByEFN(busiType, extraFileName);
        if (logger.isInfoEnabled()) {
            logger.info("BroadcastUtil->generateFileNameByWFN busiType={}, fileName={}, genFileName={}", new Object[]{
                    busiType, fileName, genFileName});
        }
        return genFileName;
    }

    public static void main(String[] args) throws Exception {

    }

}
