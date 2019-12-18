package com.thread;
class DeadLockhread implements Runnable{
	static Object chopsticks=new Object();
	static Object knifeAndFork=new Object();
	private boolean flag;
	DeadLockhread(boolean flag){
		this.flag=flag;
			}
	public void run() {
		if (flag) {
		while (true) {
				synchronized (chopsticks) {
					System.out.println(Thread.currentThread().getName()+"---if---knifeAndFork");
					synchronized (knifeAndFork) {
						System.out.println(Thread.currentThread().getName()+"---if---knifeAndFork");
					}
				}	
		}
	}else {
		while (true) {
			synchronized (knifeAndFork) {
				System.out.println(Thread.currentThread().getName()+"---else---knifeAndFork");
				synchronized (chopsticks) {
					System.out.println(Thread.currentThread().getName()+"---else---knifeAndFork");
				}
			}
		}
	}
}}
public class Thread_tset14 {

	public static void main(String[] args) {
		DeadLockhread thread1=new DeadLockhread(true);
		DeadLockhread thread2=new DeadLockhread(false);
		new Thread(thread1,"Chinese").start();
		new Thread(thread2,"American").start();


	}

}
