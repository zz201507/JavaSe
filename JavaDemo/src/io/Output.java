package io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;
import java.util.Scanner;

public class Output {

	public static void main(String[] args) throws IOException {
		//String name=null;
		//File file = new File("D:\\JAVA\\readdemo\\test.txt");
		//InputStream input=new FileInputStream(file);
		//BufferedReader reader=new BufferedReader(new InputStreamReader(new FileInputStream(file)));
		//		reader.readLine();
		//InputStream a=new FileInputStream(file);
		//Reader b=new InputStreamReader(a);
		///BufferedReader c=new BufferedReader(b);
		//char name1[]=new char[50];
		//c.read(name1);
		//name=new String(name1);
		//System.out.println(name);
		
		
		
		
		
		
		
		
		
		
		
//		String name="";
//		File file=new File(name);
//		InputStream input=new FileInputStream(file);
//		byte bytes[]=new byte[1000];
//		input.read(bytes);
//		input.read();
//		String str1=new String(bytes);//将byte转换成string
//		System.out.println(str1);
		
		
		
		Scanner input=new Scanner(System.in);
		String name="D:/JAVA/readdemo/gameDemo.txt";
		File file=new File(name);
		//System.out.println(file.exists());判断文件是否存在
		file.createNewFile();
		OutputStream output=new FileOutputStream(name,true);//追加写入 true ,覆盖写入false
		System.out.println("输入需要存储的数据!");
		String str;
		str=input.nextLine();
		output.write(str.getBytes());
		input.close();
		output.close();
		System.out.println("写入完成!");
	}


}
