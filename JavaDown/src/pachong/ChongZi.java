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
	static String name="https://v.qq.com/";//Ŀ����ַ
	static String Catalog="D:\\JAVA\\readdemo\\phone.txt";//�洢·��
	static URLConnection connection=null;//URL����
	static OutputStream output=null;
	public static void main(String[] args){
		File file = new File(Catalog);
		try {
				byte bytes[]=null;
				OutputStream output=new FileOutputStream(Catalog);
				URL url = new URL(name);
				file.createNewFile();//�����ļ�
				connection =url.openConnection();//������ַ
				connection.connect();//���ӵ�������,���ӳɹ���᷵�ش��룬200-299
				BufferedInputStream in=new BufferedInputStream(connection.getInputStream());	
				bytes = new byte[200000000];
				in.read(bytes);
				output.write(bytes);
				System.out.println("��ȡ���");
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
	