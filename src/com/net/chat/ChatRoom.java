package com.net.chat;

import java.net.DatagramSocket;
import java.net.SocketException;

import org.apache.poi.hssf.record.chart.ChartRecord;

@SuppressWarnings("unused")
public class ChatRoom {

	public static void main(String[] args) throws SocketException {
		// TODO 自动生成的方法存根
		DatagramSocket ds=new DatagramSocket(8900);
		new Thread(new ChatSender(ds,3000),"发送服务").start();
		new Thread(new ChartReceiver(ds),"接收服务").start();
		
	}

}
