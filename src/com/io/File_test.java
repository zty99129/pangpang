package com.io;

import java.io.File;
import java.sql.Date;
import java.text.SimpleDateFormat;

import javax.xml.crypto.dsig.spec.SignatureMethodParameterSpec;

public class File_test {

	
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		File file=new File("d:\\test.txt");
		System.out.println("文件名是:"+file.getName());
		System.out.println("文件的相对路径是:"+file.getPath());
		System.out.println("文件的相对路径是:"+file.getAbsolutePath());
		System.out.println("文件的父路径是:"+file.getParent());
		System.out.println(file.canRead()?"文件可读":"文件不可读");
		System.out.println(file.canWrite()?"文件可写":"文件不可写");
		System.out.println(file.isFile()?"是一个文件":"是一个目录");
		System.out.println(file.isFile()?"是一个目录":"是一个文件");
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日HH:m");
		System.out.println("最后的修改时间是:"+sdf.format(new Date(file.lastModified())));
		System.out.println("文件大小为"+file.length()+"字节");
		System.out.println("是否成功删除文件"+file.delete());
		
	}

}
