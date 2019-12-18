package com.net.chat;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class ChartReceiver implements Runnable {
private DatagramSocket server;
	public ChartReceiver(DatagramSocket server) {
		this.server=server;
	}

	@Override
	public void run() {
		// TODO 自动生成的方法存根
		System.out.println("等待接收数据...");
		byte[] buf=new byte[1024];
		DatagramPacket packet=new DatagramPacket(buf, buf.length);
		
		while (true) {
			try {
				server.receive(packet);
				String str =new String(packet.getData(),0,packet.getLength());
				System.out.println(packet.getAddress()+":"+packet.getPort()+"发送消息:"+str);
			} catch (IOException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
			
		}
	}

}
