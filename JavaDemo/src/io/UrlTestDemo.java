package io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.nio.CharBuffer;

public class UrlTestDemo {
	public static void main(String[] args) throws IOException {
		String name="src/io/Test.txt";
		File file=new File(name);
		file.createNewFile();
		OutputStream output=new FileOutputStream(name);
		URL url=new URL("https://www.hupu.com/");
		BufferedReader reader=new BufferedReader(new InputStreamReader(url.openStream()));
		String str=null;
		while((str=reader.readLine())!=null) {
			byte bytes[]=str.getBytes();
			output.write(bytes);
		
		}
	}

}