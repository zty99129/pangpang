package com.object;
class Animal extends java.lang.Object{
	void shout() {
		System.out.println("动物叫");
	}
	@Override
	public String toString() {
		return"这是一只动物";
	}
}
public class E06 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Animal dw=new Animal();
		Animal dw2=new Animal();
		System.out.println(dw.toString());
		System.out.println(dw2.toString());
	}

}
