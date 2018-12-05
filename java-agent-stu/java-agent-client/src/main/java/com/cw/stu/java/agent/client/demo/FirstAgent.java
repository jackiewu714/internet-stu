package com.cw.stu.java.agent.client.demo;

import javassist.*;

import java.io.IOException;
import java.lang.instrument.ClassFileTransformer;
import java.lang.instrument.IllegalClassFormatException;
import java.lang.instrument.Instrumentation;
import java.security.ProtectionDomain;

/**
 * @author WuLiangzhi  2018/12/05 14:40
 */
public class FirstAgent implements ClassFileTransformer {

    /**
     * 要增加对象的类名（全路径）
     */
    private final String injectedClassName = "com.cw.stu.java.agent.test.demo.FirstAgentTest";
    /**
     * 要增加对象的方法名
     */
    private final String methodName = "hello";

    /**
     * 该方法在main方法之前运行，与main方法运行在同一个JVM中
     * @param agentOps          String
     * @param instrumentation   Instrumentation
     */
    public static void premain(String agentOps, Instrumentation instrumentation) {
        System.out.println("=========premain执行方法1========");
        System.out.println(agentOps);

        //添加Transformer
        instrumentation.addTransformer(new FirstAgent());
    }

    /**
     * 如果不存在 premain(String agentArgs, Instrumentation inst)，则会执行 premain(String agentArgs)
     * @param agentOps  String
     */
    public static void premain(String agentOps) {
        System.out.println("=========premain执行方法2========");
        System.out.println(agentOps);
    }

    @Override
    public byte[] transform(ClassLoader loader,
                            String className,
                            Class<?> classBeingRedefined,
                            ProtectionDomain protectionDomain,
                            byte[] classfileBuffer) throws IllegalClassFormatException {
        className = className.replaceAll("/", ".");
//        System.out.println(String.format("className=%s", className));

        if (className.equals(injectedClassName)) {
            CtClass ctClass = null;
            try {
                ctClass = ClassPool.getDefault().get(className);
                CtMethod ctMethod = ctClass.getDeclaredMethod(methodName);

                String desc = "before " + methodName;
                //1.对象的方法执行之前增加处理逻辑
                ctMethod.insertBefore("System.out.println(\" before method[" + methodName + "], FirstAgent.transform(...)\");");

                //2.对象的方法执行之后增加处理逻辑
                ctMethod.insertAfter("System.out.println(\" after method[" + methodName + "], FirstAgent.transform(...)\");");
                return ctClass.toBytecode();
            } catch (NotFoundException e) {
                e.printStackTrace();
            } catch (CannotCompileException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return classfileBuffer;
    }
}
