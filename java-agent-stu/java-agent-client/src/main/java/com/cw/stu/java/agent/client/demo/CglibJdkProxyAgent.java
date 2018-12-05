package com.cw.stu.java.agent.client.demo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.instrument.ClassFileTransformer;
import java.lang.instrument.IllegalClassFormatException;
import java.lang.instrument.Instrumentation;
import java.security.ProtectionDomain;

/**
 * CGLIB 和 JDK 动态代理Agent类
 *
 * @author WuLiangzhi  2018/12/05 16:06
 */
public class CglibJdkProxyAgent implements ClassFileTransformer {

    private String cglibProxyPattern = "$$EnhancerByCGLIB$$";
    private String jdkProxyPattern = "$Proxy";

    /**
     * 会在main方法之前执行，添加自定义的ClassFileTransformer
     *
     * @param agentArgs String
     * @param inst      Instrumentation
     */
    public static void premain(String agentArgs, Instrumentation inst) {
        System.out.println("========= CglibJdkProxyAgent->premain 方法执行 ========");
        System.out.println(agentArgs);

        inst.addTransformer(new CglibJdkProxyAgent());
    }

    /**
     * 每次装在class文件都会执行
     *
     * @param loader              ClassLoader
     * @param className           String
     * @param classBeingRedefined Class<?>
     * @param protectionDomain    ProtectionDomain
     * @param classfileBuffer     byte[]
     * @return byte[]
     * @throws IllegalClassFormatException 异常
     */
    @Override
    public byte[] transform(ClassLoader loader,
                            String className,
                            Class<?> classBeingRedefined,
                            ProtectionDomain protectionDomain,
                            byte[] classfileBuffer) throws IllegalClassFormatException {
        //com.cglib.MyTarget$$EnhancerByCGLIB$$65288428
        //com.sun.proxy.$Proxy4
        //CGLIB和JDK proxy生成的代理类进行拦截
        if (className.contains(cglibProxyPattern) || className.contains(jdkProxyPattern)) {
            //指定存放路径
//            String path = this.getClass().getResource("").getPath();
            String path = "F:/study/github/java/internet-stu/java-agent-stu/java-agent-test/target/classes/com/cw/stu/java/agent/test/demo/proxy/cglib/";
            System.out.println("path=" + path);
            int lastIndexOf = className.lastIndexOf("/") + 1;
            String classFileName = className.substring(lastIndexOf) + ".class";
            String fileFullPath = path + classFileName;
            writeClassToDisk(fileFullPath, classfileBuffer);
            System.out.println(className + " writeClassToDisk success.");
        }

        return classfileBuffer;
    }

    /**
     * 将class文件写到磁盘中
     * @param fileName  String  文件名（全路径）
     * @param data      byte[]
     */
    private void writeClassToDisk(String fileName, byte[] data) {
        File file = new File(fileName);
        FileOutputStream fos = null;
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            fos = new FileOutputStream(file);
            fos.write(data);
            fos.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fos != null) {
                    fos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
