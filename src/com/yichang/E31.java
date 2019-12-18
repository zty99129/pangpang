package com.yichang;
class BlcException extends Exception{
	public BlcException() {
		super();
	}
	public  BlcException(String message) {
		super(message);
	}
}
public class E31 {
	public static void main(String[] args) {
		int result;
		// TODO 自动生成的方法存根
		try {
			result = divide(4, 0);
		System.out.println(result);
	}catch (Exception e) {
		System.out.println("捕捉到得异常为："+e.getMessage());
	}

}
	
	private static int divide(int i,int j) throws BlcException{
		if (j==0) {
			throw new BlcException("除数不能为0");
		}
		int result=i/j;
		return result;
	}
}