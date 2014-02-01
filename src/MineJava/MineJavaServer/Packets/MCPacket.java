package MineJava.MineJavaServer.MineServer.Packets;

import java.net.*;
import java.nio.*;

class MCPacket{

	//// packet values
	public final static int PING=0x0;
	public final static int PONG=0x1;

	public final static int MOVE_YAW=0x93,
		MOVE=0x94
		;
	public final static int BANNED=0x17
		;

}
