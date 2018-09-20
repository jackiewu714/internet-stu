package study.javabase.jdk.annotation;

import org.junit.Ignore;
import org.junit.Test;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * 注解测试类1
 * @author WuLiangzhi  2018/09/20 20:49
 */
@TestAnnotation(id = 0)
public class AnnoTest1 {

    @Check("hi")
    int a;

    @Perform
    public void testMethod1(){

    }

    @SuppressWarnings("deprecation")
    public void testMethod2() {
        String str = "1111";
        str = "432";
        str = "4321";
    }

    @Ignore
    @Test
    public void test1() {
        boolean hasAnnotation = AnnoTest1.class.isAnnotationPresent(TestAnnotation.class);
        if (hasAnnotation) {
            TestAnnotation testAnnotation = AnnoTest1.class.getAnnotation(TestAnnotation.class);

            System.out.println("id: " + testAnnotation.id());
            System.out.println("msg: " + testAnnotation.msg());
        }
    }

    @Test
    public void test2() throws IllegalAccessException {
        System.out.println("step1 类注解 =====================");
        boolean hasAnno = AnnoTest1.class.isAnnotationPresent(TestAnnotation.class);
        if (hasAnno) {
            //获取类的注解
            TestAnnotation testAnnotation = AnnoTest1.class.getAnnotation(TestAnnotation.class);
            System.out.println("id: " + testAnnotation.id());
            System.out.println("msg: " + testAnnotation.msg());
        }

        System.out.println("\nstep2 成员变量注解 =====================");
        Field[] fields = AnnoTest1.class.getDeclaredFields();
        if (fields != null) {
            for (Field field : fields) {
                field.setAccessible(true);
                String fieldName = field.getName();

                ////获取一个成员变量上的注解
                Annotation[] annotations = field.getAnnotations();
                System.out.println(String.format("fieldName: %S, annotations: %s", fieldName, annotations));

                for(Annotation anno : annotations) {
                    System.out.println(String.format("fieldName: %S, annotations: %s", fieldName, anno.annotationType()));
//                    if (anno.annotationType().getName().equals(Check.class.getName())) {
                    if (anno instanceof Check) {
                        Check check = (Check) anno;
                        System.out.println("check.value()=" + check.value());
                    }
                }

            }
        }

        System.out.println("\nstep3 方法注解 =====================");
        Method[] methods = AnnoTest1.class.getMethods();
        if (methods != null) {
            for (Method method : methods) {
                // 获取方法中的注解
                Annotation[] annotations = method.getAnnotations();
                if (annotations != null) {
                    for (Annotation anno : annotations) {
                        System.out.println(String.format("methodName: %s, Annotation: %s", method.getName(), anno.annotationType().getName()));
                    }
                }
            }
        }

    }

}
