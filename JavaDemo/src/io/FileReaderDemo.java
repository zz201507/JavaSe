package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class FileReaderDemo {
	public static void main(String[] args) throws IOException {
		String name="D:\\JAVA\\readdemo\\Test.txt";
		//InputStream input=new FileInputStream(name);
		OutputStream output=new FileOutputStream(name);
		System.out.println("输入储存的数据!");
		Scanner input1=new Scanner(System.in);
		String str=input1.nextLine();
		byte bytes[]=new byte[1000];
		bytes=str.getBytes();
		output.write(bytes);
		input1.close();
		//input.close();
		output.close();
	}

}
