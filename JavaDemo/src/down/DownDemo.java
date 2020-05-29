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
	static String Catalog;//����·��
	static  String StrUrl;//������ַ
	static HttpURLConnection connection=null;
	public static void main(String[] args) {
		Scanner input1=new Scanner(System.in);
		System.out.println("������������");
		StrUrl=input1.nextLine();
		try {
			System.out.println("�������ص��ļ���");
			Catalog=input1.nextLine();
			File file = new File("D:/�����ļ�/"+Catalog);
			file.createNewFile();
			byte bytes[]=null; 
			URL url=new URL(StrUrl);
			connection=(HttpURLConnection)url.openConnection();
			//������������
			//connection.setRequestProperty("Range", "bytes=0-");
			connection.connect();//���ӵ�������,���ӳɹ���᷵�ش��룬200-299
			if(connection.getResponseCode()/100!=2) {
				System.err.println("����ʧ��");
				return;	
			}
			BufferedInputStream input = new BufferedInputStream(connection.getInputStream());
			RandomAccessFile file1=new RandomAccessFile("D:/�����ļ�/"+Catalog,"rw");//�Զ�д�ķ�ʽ������ָ��·��
			//file1.seek(0);//�ļ�ָ����0
			int filesize=connection.getContentLength();//��ȡ�ļ���С
			int downfile=0;
			while(downfile<filesize) {
				bytes=new byte[102400];
				int num=input.read(bytes);
				downfile=downfile+num;
				System.out.println("�Ѿ�����"+(downfile*1.0/filesize)*100.0+"%");
				file1.write(bytes,0,num);
			}
			System.out.println("�������");
			
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
