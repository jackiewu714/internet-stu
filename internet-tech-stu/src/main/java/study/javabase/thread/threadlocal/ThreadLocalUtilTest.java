package study.javabase.thread.threadlocal;

/**
 * @author WuLiangzhi  2019/10/22 16:49
 */
public class ThreadLocalUtilTest {

    private static ThreadLocal<String> threadLocal = new ThreadLocal<>();

    /**
     * 获取 name 属性
     *
     * @return the value of name
     */
    public static String getName() {
        return ThreadLocalUtilTest.threadLocal.get();
    }

    /**
     * 设置 name 属性
     *
     * @param name name
     */
    public static void setName(String name) {
        ThreadLocalUtilTest.threadLocal.set(name);
    }

}
