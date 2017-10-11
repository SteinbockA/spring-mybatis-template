import lombok.Cleanup;

import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;

/**
 * Created by duanyixiao on 2017/9/19.
 */
public class Client {
    private static final String HOST = "127.0.0.1";
    private static final int PORT = 8089;

    public static void main(String[] args) throws Exception {
        SocketChannel socketChannel = SocketChannel.open();
        socketChannel.configureBlocking(false);
        socketChannel.connect(new InetSocketAddress(HOST, PORT));
        while (!socketChannel.finishConnect()) {
            System.out.print(".");
        }
        System.out.println("<<<<<");
        String word = "hello server, I am client";
        ByteBuffer byteBuffer = ByteBuffer.wrap(word.getBytes());
        while (byteBuffer.hasRemaining())
            socketChannel.write(byteBuffer);
        System.out.println(byteBuffer.capacity());
    }
}
