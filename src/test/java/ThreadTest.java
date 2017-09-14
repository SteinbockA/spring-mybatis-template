import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CountDownLatch;

/**
 * Created by duanyixiao on 2017/9/14.
 */
public class ThreadTest {
    private byte[] lock = new byte[0];
    private static CountDownLatch countDownLatch = new CountDownLatch(2);
    public void testThread(){

            try {
                System.out.println(Thread.currentThread().getName());
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            countDownLatch.countDown();
            System.out.println(Thread.currentThread().getName()+" step out");

    }

    public void test2(){
            try {
                System.out.println(Thread.currentThread().getName());
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            countDownLatch.countDown();
            System.out.println(Thread.currentThread().getName()+" step out");

    }

    public static void main(String[] args) {
        ThreadTest test1 = new ThreadTest();
        ThreadTest test2 = new ThreadTest();
        CompletableFuture.runAsync(()->test1.testThread());
        CompletableFuture.runAsync(()->test1.test2());
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
