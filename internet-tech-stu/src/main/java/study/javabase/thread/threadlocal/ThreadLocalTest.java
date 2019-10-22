package study.javabase.thread.threadlocal;

/**
 * @author WuLiangzhi  2019/10/22 16:48
 */
public class ThreadLocalTest {

    public static void main(String[] args) {
        String[] strArr = new String[]{"Jackie","Nicky","Moon"};
        for (int i = 0; i < strArr.length; i++) {
            MyTrhead myTrhead = new MyTrhead(strArr[i]);
            myTrhead.start();
        }
    }

}

class MyTrhead extends Thread{
    private String name;
    public MyTrhead(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            String tmpStr = String.format("%s[%s]:%s", Thread.currentThread().getName(), i, name);
            ThreadLocalUtilTest.setName(tmpStr);
            try {
                Thread.sleep(500L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(ThreadLocalUtilTest.getName());
        }
    }
}
