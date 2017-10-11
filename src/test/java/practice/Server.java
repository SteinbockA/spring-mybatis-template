package practice;

import lombok.Cleanup;

import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Iterator;

/**
 * Created by duanyixiao on 2017/9/28.
 */
public class Server {
    public static void main(String[] args) throws Exception{
        ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
        serverSocketChannel.socket().bind(new InetSocketAddress(8001));
        serverSocketChannel.configureBlocking(false);

        Selector selector = Selector.open();
        serverSocketChannel.register(selector, SelectionKey.OP_ACCEPT);

        while(true){
            if(selector.select()==0)
                continue;
            Iterator<SelectionKey> iterator = selector.selectedKeys().iterator();
            while(iterator.hasNext()){
                SelectionKey selectionKey = iterator.next();
                iterator.remove();
                if(selectionKey.isAcceptable()){
                    SocketChannel socketChannel = ((ServerSocketChannel)selectionKey.channel()).accept();
                    socketChannel.configureBlocking(false);
                    System.out.println("<<<< accepet");
                    socketChannel.register(selector,SelectionKey.OP_READ|SelectionKey.OP_WRITE,ByteBuffer.allocate(126));
                }
                if(selectionKey.isValid() && selectionKey.isReadable()){
                    @Cleanup SocketChannel socketChannel  = (SocketChannel)selectionKey.channel();
                    System.out.println(">>>>> read");
//                    socketChannel.configureBlocking(false);
                    ByteBuffer byteBuffer = (ByteBuffer) selectionKey.attachment();
                    System.out.println(byteBuffer.capacity());
                    byteBuffer.clear();
                    socketChannel.read(byteBuffer);
                    byteBuffer.flip();
                    byte[] bytes = new byte[byteBuffer.limit()];
                    int index = 0;
                    while(byteBuffer.hasRemaining())
                        bytes[index++] = byteBuffer.get();
                    System.out.println(new String(bytes));

                }

            }
        }



    }
}
