import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;

/**
 * Created by duanyixiao on 2017/9/19.
 */
public class ReadClient {
    private static final String HOST = "127.0.0.1";
    private static final int PORT = 8088;
    public static void main(String[] args) throws Exception{
        SocketChannel socketChannel = SocketChannel.open();
        socketChannel.configureBlocking(false);
        socketChannel.connect(new InetSocketAddress(HOST,PORT));
        while(!socketChannel.finishConnect()){
            System.out.println("waiting to connect");
        }
        ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
        int num = socketChannel.read(byteBuffer);
        System.out.println(num);
        if(num!=-1){
            System.out.println(byteBuffer.position());
            byteBuffer.flip();
            byte[] bytes = new byte[byteBuffer.limit()];
            int index = 0;
            while(byteBuffer.hasRemaining())
                bytes[index++]=byteBuffer.get();
            System.out.println(new String(bytes));
        }
    }
}
