package com.jihe;
import java.util.ArrayList;
import java.util.Iterator;
public class E606 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		ArrayList<String> list=new ArrayList<String>();
		list.add("jack");
		list.add("Annie");
		list.add("Rose");
		list.add("Tom");
		Iterator<String> it =list.iterator();
		while(it.hasNext()) {
			Object obj=it.next();
			if ("Annie".equals(obj)) {
				list.remove(obj);
				break;
			}
		}
		System.out.println(list);
		
	}

}
