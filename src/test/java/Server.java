import com.github.pagehelper.PageInterceptor;
import lombok.Cleanup;
import org.apache.ibatis.annotations.SelectKey;

import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by duanyixiao on 2017/9/19.
 */
public class Server {
    private static final String HOST = "127.0.0.1";
    private static final int PORT = 8089;

    public static void main(String[] args) throws Exception {
        ServerSocketChannel server = ServerSocketChannel.open();
        server.socket().bind(new InetSocketAddress(PORT));
        server.configureBlocking(false);
        Selector selector = Selector.open();
        server.register(selector, SelectionKey.OP_ACCEPT);
        System.out.println("I am waiting for client");
        int count = 0;
        while(true){
            if (selector.select()==0) {
                System.out.print(".");
                continue;
            }
            System.out.println("<<<<<<<<<<<< count="+count++);
            Iterator<SelectionKey> selectionKeys = selector.selectedKeys().iterator();
            while(selectionKeys.hasNext()){
                SelectionKey selectionKey = selectionKeys.next();
                selectionKeys.remove();

                if(selectionKey.isAcceptable()){
                    SocketChannel socketChannel = ((ServerSocketChannel)selectionKey.channel()).accept();
                    socketChannel.configureBlocking(false);
                    socketChannel.register(selectionKey.selector(),SelectionKey.OP_READ);
                }
                if(selectionKey.isValid() && selectionKey.isReadable()){
                    @Cleanup SocketChannel channel = (SocketChannel)selectionKey.channel();
                    ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
                    channel.read(byteBuffer);
                    System.out.println("capacity="+byteBuffer.capacity());
                    System.out.println("limit="+byteBuffer.limit());
                    byteBuffer.flip();
                    System.out.println("limit ="+byteBuffer.limit());
                    byte[] bytes = new byte[byteBuffer.limit()];
                    int index = 0;
                    while(byteBuffer.hasRemaining()){
                        bytes[index++]=byteBuffer.get();
                    }
                    System.out.println("<<<<< length="+bytes.length);
                    System.out.println("<<<<<< client send message ="+new String(bytes));
                }
                if(selectionKey.isValid() && selectionKey.isWritable()){
                    @Cleanup SocketChannel channel = (SocketChannel)selectionKey.channel();
                    ByteBuffer byteBuffer = ByteBuffer.wrap("get your message, client, I am server".getBytes());
                    channel.write(byteBuffer);
                    if (!byteBuffer.hasRemaining()) {
                        channel.register(selectionKey.selector(),SelectionKey.OP_READ);
                    }
                }
            }
        }
    }
}
