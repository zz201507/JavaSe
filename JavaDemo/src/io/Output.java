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
//		String str1=new String(bytes);//��byteת����string
//		System.out.println(str1);
		
		
		
		Scanner input=new Scanner(System.in);
		String name="D:/JAVA/readdemo/gameDemo.txt";
		File file=new File(name);
		//System.out.println(file.exists());�ж��ļ��Ƿ����
		file.createNewFile();
		OutputStream output=new FileOutputStream(name,true);//׷��д�� true ,����д��false
		System.out.println("������Ҫ�洢������!");
		String str;
		str=input.nextLine();
		output.write(str.getBytes());
		input.close();
		output.close();
		System.out.println("д�����!");
	}


}
