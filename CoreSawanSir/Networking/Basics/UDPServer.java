package Basics;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPServer {
	public static void main(String[] args) throws IOException {
		DatagramSocket socket=new DatagramSocket();
		byte[]bt=new byte[256];
		DatagramPacket packet=new DatagramPacket(bt, bt.length);
		socket.receive(packet);
		String receive=new String(packet.getData(),0,packet.getLength());
		System.out.println("receive clint"+receive);
		String response="hello udp server";
		bt=response.getBytes();
		packet=new DatagramPacket(bt, bt.length, packet.getAddress(), packet.getPort());
		socket.send(packet);
		
	}

}
