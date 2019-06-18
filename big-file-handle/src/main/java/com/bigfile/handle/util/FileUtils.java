package com.bigfile.handle.util;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author WuLiangzhi  2019/06/17 23:36
 */
public class FileUtils {

    /**
     * 清空文件内容，如果文件不存在则新建一个空文件
     *
     * @param filePath    String  结果文件路径
     */
    public static void clearFileContent(String filePath) {
        File file = new File(filePath);
        FileWriter fileWriter = null;
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            fileWriter = new FileWriter(file);
            fileWriter.write("");
            fileWriter.flush();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fileWriter != null) {
                    fileWriter.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
