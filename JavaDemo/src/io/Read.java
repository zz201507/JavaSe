package io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.Scanner;
public class Read {
	public static void main(String[] args) throws IOException {
		byte bytes[] = new byte[100];
		File file = new File("D:/JAVA/readdemo/Text.txt");
		InputStream input = new FileInputStream(file);
		input.read(bytes);
		String str = new String(bytes);
		System.out.println(bytes);
		System.out.println(str);
//		Scanner input = new Scanner(System.in);
//		byte bytes[] = new byte[20];
//		System.out.println(" ‰»Î≤‚ ‘");
//		String s = input.nextLine();
//		bytes = s.getBytes();
//		File file = new File("D:/JAVA/readdemo/Text.txt");
//		OutputStream out = new FileOutputStream(file,true);
//		out.write(bytes);
//		input.close();
//		out.close();
//		
//		
//		
//		BufferedReader read = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
//		String name = read.readLine();
//		System.out.println(name);
	}
}
