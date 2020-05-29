package pachong;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ChongZi {
	static String name="https://v.qq.com/";//目标网址
	static String Catalog="D:\\JAVA\\readdemo\\phone.txt";//存储路径
	static URLConnection connection=null;//URL对象
	static OutputStream output=null;
	public static void main(String[] args){
		File file = new File(Catalog);
		try {
				byte bytes[]=null;
				OutputStream output=new FileOutputStream(Catalog);
				URL url = new URL(name);
				file.createNewFile();//创建文件
				connection =url.openConnection();//连接网址
				connection.connect();//连接到服务器,连接成功后会返回代码，200-299
				BufferedInputStream in=new BufferedInputStream(connection.getInputStream());	
				bytes = new byte[200000000];
				in.read(bytes);
				output.write(bytes);
				System.out.println("获取完成");
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				output.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
	