package practice;

import lombok.Cleanup;
import org.apache.commons.lang3.math.NumberUtils;

import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;

/**
 * Created by duanyixiao on 2017/9/28.
 */
public class Client {
    public static void main(String[] args) throws Exception{
        @Cleanup SocketChannel socketChannel = SocketChannel.open();
        socketChannel.configureBlocking(false);
        socketChannel.connect(new InetSocketAddress("127.0.0.1",8001));
        while(!socketChannel.finishConnect()){
        }
        ByteBuffer byteBuffer = ByteBuffer.wrap("hello server".getBytes());
        while(byteBuffer.hasRemaining())
            socketChannel.write(byteBuffer);
    }
}
