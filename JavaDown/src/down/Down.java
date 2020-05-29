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
 * ����������
 * 2020.3.22����
 * */

public class Down {
	static String Catalog;
	static String name;
	//����·��
	static  String StrUrl;
	//������ַ
	static final int MAX_BUFFER_SIZE=10240;
	//�����С1M
	static HttpURLConnection connection=null;
	static BufferedInputStream bInStream=null;
	static RandomAccessFile file=null;
	public static void main(String[] args) throws IOException {
		Scanner input=new Scanner(System.in);
		System.out.println("������Ҫ�����·��,��ʽΪ���̷�����:/�ļ���");
		Catalog=input.nextLine();
		System.out.println("������Ҫ���ص��ļ����Լ���ʽ");
		name=input.nextLine();
		System.out.println("������������");
		StrUrl=input.nextLine();
		String name1=Catalog+"/"+name;
		File file5=new File(name1);
		file5.createNewFile();
		try {
			URL url=new URL(StrUrl);
			connection=(HttpURLConnection)url.openConnection();//���ӵ�������
			//connection.setRequestProperty("Range", "bytes=0-");
			//connection.connect();//���ӵ�������,���ӳɹ���᷵�ش��룬200-299
			if(connection.getResponseCode()/100!=2) {
				System.err.println("����ʧ��");
				return;
			}
			int filesize=connection.getContentLength();//�õ��ļ���С
			bInStream=new BufferedInputStream(connection.getInputStream(), MAX_BUFFER_SIZE);
			int downloaded=0;//�Ѿ����ص��ֽ����������������صİٷֱ�
			RandomAccessFile file=new RandomAccessFile(name1, "rw");//�Զ�д�ķ�ʽ������ָ��·��
			file.seek(0);//�ļ�ָ����0
			while(downloaded<filesize)
			{//δ������ʱ��������
				byte buffer[]=null;
				if(filesize-downloaded>MAX_BUFFER_SIZE) {
					//�ж�δ���ش�С�Ƿ񳬹���󻺴�1M
					buffer=new byte[MAX_BUFFER_SIZE];
				}
				else {
					buffer=new byte[filesize-downloaded];
				}
				int read=bInStream.read(buffer);//���ص�buffer��������
				file.write(buffer,0,read);//��buffer������ݴ�����file���0-read
				downloaded+=read;
				System.out.println("��ǰ���ؽ���:"+((downloaded*1.0)/filesize)*100+"%");
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
