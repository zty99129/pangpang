package com.api;

import java.util.HashSet;
import java.util.Random;

public class Ssq_text {

	public static void main(String[] args)throws InterruptedException {
		// TODO 自动生成的方法存根
		System.out.println("双色球开奖：");
		System.out.println("六个红球号码是：");
		Thread.sleep(1000);
		Random r=new Random();
		
		HashSet<Integer> hs=new HashSet<>();
		
		for(int i=0; i<10000;i++) {
			int hq=r.nextInt(33)+1;
			hs.add(hq);
			if(hs.size()==6) {
				break;
			}
		}
			for(Integer hq:hs) {
				System.out.print(hq+" ");
				Thread.sleep(1000);
			}
			/*System.out.print(hs+" ");*/
		}

		/*System.out.println("\n一个蓝球号码");
		Thread.sleep(1000);
		Random q=new Random();
		for(int i=0; i<1;i++) {
			int hq=r.nextInt(16)+1;
			System.out.print(hq+" ");
			Thread.sleep(1000);
	}

}*/
}