package com.thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class LockThread4 implements Runnable{
	private int tickets=10;
	private final Lock lock =new ReentrantLock();
	public void run() {
		while (true) {
				lock.lock();
				if (tickets>0){
					try {
						Thread.sleep(100);
						System.out.println(Thread.currentThread().getName()+"正在发售"+tickets--+"张票");
					}catch (InterruptedException e) {
						e.printStackTrace();
					}finally {
						lock.unlock();
						}
					}
		}
	}

	
public class Thread_test13 {

	public void main(String[] args) {
		// TODO 自动生成的方法存根
		LockThread4 lockThread=new LockThread4();
		new Thread(lockThread,"窗口1").start();
		new Thread(lockThread,"窗口2").start();
		new Thread(lockThread,"窗口3").start();
		new Thread(lockThread,"窗口4").start();
	}

}
}
