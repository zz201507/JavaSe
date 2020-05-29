package down;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class Lndaos {
	static  String StrUrl;
	//下载网址
	static final int MAX_BUFFER_SIZE=10240;
	//缓存大小1M
	static HttpURLConnection connection=null;
	static InputStream bInStream=null;
	static RandomAccessFile file=null;
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("输入下载链接");
		StrUrl=input.nextLine();
		try {
			URL url=new URL(StrUrl);
			connection=(HttpURLConnection)url.openConnection();//连接到服务器
			//connection.connect();//
			//connection.setRequestProperty("Range", "bytes=0-");
			if(connection.getResponseCode()/100!=2) {
				System.err.println("连接失败");
				return;
			}
			int filesize=connection.getContentLength();
			bInStream=new BufferedInputStream(connection.getInputStream(), MAX_BUFFER_SIZE);
			int downloaded=0;//已经下载的字节数，用来计算下载的百分比
			String fileName=url.getFile();//获取文件名
			fileName=fileName.substring(fileName.lastIndexOf("/")+1);//截取字符串，从/后面的位置开始截取
			RandomAccessFile file=new RandomAccessFile("D:\\JAVA\\readdemo/ndajsjdsa.mp3", "rw");//以读写的方式下载至指定路径
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
				if(read==-1)break;//下载完毕
				file.seek(downloaded);//设置文件指针
				file.write(buffer,0,read);//把buffer里的数据储存至file里，从0-read
				downloaded+=read;
				System.out.println("当下下载进度:"+downloaded*1.0/filesize*10000/100+"%");
				
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
