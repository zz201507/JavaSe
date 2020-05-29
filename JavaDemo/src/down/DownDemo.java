package down;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class DownDemo {
	static String Catalog;//下载路径
	static  String StrUrl;//下载网址
	static HttpURLConnection connection=null;
	public static void main(String[] args) {
		Scanner input1=new Scanner(System.in);
		System.out.println("输入下载链接");
		StrUrl=input1.nextLine();
		try {
			System.out.println("输入下载的文件名");
			Catalog=input1.nextLine();
			File file = new File("D:/音乐文件/"+Catalog);
			file.createNewFile();
			byte bytes[]=null; 
			URL url=new URL(StrUrl);
			connection=(HttpURLConnection)url.openConnection();
			//设置连接属性
			//connection.setRequestProperty("Range", "bytes=0-");
			connection.connect();//连接到服务器,连接成功后会返回代码，200-299
			if(connection.getResponseCode()/100!=2) {
				System.err.println("连接失败");
				return;	
			}
			BufferedInputStream input = new BufferedInputStream(connection.getInputStream());
			RandomAccessFile file1=new RandomAccessFile("D:/音乐文件/"+Catalog,"rw");//以读写的方式下载至指定路径
			//file1.seek(0);//文件指针置0
			int filesize=connection.getContentLength();//获取文件大小
			int downfile=0;
			while(downfile<filesize) {
				bytes=new byte[102400];
				int num=input.read(bytes);
				downfile=downfile+num;
				System.out.println("已经下载"+(downfile*1.0/filesize)*100.0+"%");
				file1.write(bytes,0,num);
			}
			System.out.println("下载完成");
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			connection.disconnect();
			input1.close();
		}
		
		
	}
}
