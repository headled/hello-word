package netlib;



import java.nio.ByteBuffer;

import java.nio.channels.SocketChannel;



public interface NetEventListener

{

	public boolean handleWrite(SocketChannel ch, int count);

	public boolean handleRead(SocketChannel ch, ByteBuffer buffer, int count);

	public boolean handleConnection(SocketChannel ch);

	public boolean handleConnectionClose(SocketChannel ch);

}