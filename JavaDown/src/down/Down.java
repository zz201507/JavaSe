package down;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
/*
 * 简易下载器
 * 2020.3.22制作
 * */

public class Down {
	static String Catalog;
	static String name;
	//输入路径
	static  String StrUrl;
	//下载网址
	static final int MAX_BUFFER_SIZE=10240;
	//缓存大小1M
	static HttpURLConnection connection=null;
	static BufferedInputStream bInStream=null;
	static RandomAccessFile file=null;
	public static void main(String[] args) throws IOException {
		Scanner input=new Scanner(System.in);
		System.out.println("请输入要保存的路径,格式为：盘符名称:/文件夹");
		Catalog=input.nextLine();
		System.out.println("输入你要下载的文件名以及格式");
		name=input.nextLine();
		System.out.println("输入下载链接");
		StrUrl=input.nextLine();
		String name1=Catalog+"/"+name;
		File file5=new File(name1);
		file5.createNewFile();
		try {
			URL url=new URL(StrUrl);
			connection=(HttpURLConnection)url.openConnection();//连接到服务器
			//connection.setRequestProperty("Range", "bytes=0-");
			//connection.connect();//连接到服务器,连接成功后会返回代码，200-299
			if(connection.getResponseCode()/100!=2) {
				System.err.println("连接失败");
				return;
			}
			int filesize=connection.getContentLength();//得到文件大小
			bInStream=new BufferedInputStream(connection.getInputStream(), MAX_BUFFER_SIZE);
			int downloaded=0;//已经下载的字节数，用来计算下载的百分比
			RandomAccessFile file=new RandomAccessFile(name1, "rw");//以读写的方式下载至指定路径
			file.seek(0);//文件指针置0
			while(downloaded<filesize)
			{//未下载完时继续下载
				byte buffer[]=null;
				if(filesize-downloaded>MAX_BUFFER_SIZE) {
					//判断未下载大小是否超过最大缓存1M
					buffer=new byte[MAX_BUFFER_SIZE];
				}
				else {
					buffer=new byte[filesize-downloaded];
				}
				int read=bInStream.read(buffer);//下载到buffer数组里面
				file.write(buffer,0,read);//把buffer里的数据储存至file里，从0-read
				downloaded+=read;
				System.out.println("当前下载进度:"+((downloaded*1.0)/filesize)*100+"%");
			}
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			connection.disconnect();
			input.close();
			try {
				file.close();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			try {
				bInStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}
}
