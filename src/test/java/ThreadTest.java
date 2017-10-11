import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;

import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;
import java.util.concurrent.*;

/**
 * Created by duanyixiao on 2017/9/14.
 */
public class ThreadTest {
    private static CountDownLatch countDownLatch = new CountDownLatch(2);
    private byte[] lock = new byte[0];
    private static ExecutorService executorService = Executors.newFixedThreadPool(8);

    public static void main(String[] args) throws Exception {
        SocketChannel socketChannel = SocketChannel.open();
        Selector selector = Selector.open();
        socketChannel.configureBlocking(false);
        SelectionKey selectionKey = socketChannel.register(selector, SelectionKey.OP_ACCEPT);
        System.out.println(selectionKey.interestOps());
    }

    public void testThread() throws Exception {


    }

    public void test2() {
        try {
            System.out.println(Thread.currentThread().getName());
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        countDownLatch.countDown();
        System.out.println(Thread.currentThread().getName() + " step out");

    }
}
