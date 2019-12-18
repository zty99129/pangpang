package com.net;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class UDPSender {

	public static void main(String[] args) throws Exception {
		DatagramSocket client=new DatagramSocket(3000);
		String str="来自臧天业";
		byte[] zjsz=str.getBytes("UTF-8");
		DatagramPacket packet=new DatagramPacket(zjsz,zjsz.length,InetAddress.getByName("10.2.103.17"),8900);
		System.out.println("开始发送信息...");
		client.send(packet);
		client.close();

	}

}
