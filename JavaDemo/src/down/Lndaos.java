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
	//������ַ
	static final int MAX_BUFFER_SIZE=10240;
	//�����С1M
	static HttpURLConnection connection=null;
	static InputStream bInStream=null;
	static RandomAccessFile file=null;
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("������������");
		StrUrl=input.nextLine();
		try {
			URL url=new URL(StrUrl);
			connection=(HttpURLConnection)url.openConnection();//���ӵ�������
			//connection.connect();//
			//connection.setRequestProperty("Range", "bytes=0-");
			if(connection.getResponseCode()/100!=2) {
				System.err.println("����ʧ��");
				return;
			}
			int filesize=connection.getContentLength();
			bInStream=new BufferedInputStream(connection.getInputStream(), MAX_BUFFER_SIZE);
			int downloaded=0;//�Ѿ����ص��ֽ����������������صİٷֱ�
			String fileName=url.getFile();//��ȡ�ļ���
			fileName=fileName.substring(fileName.lastIndexOf("/")+1);//��ȡ�ַ�������/�����λ�ÿ�ʼ��ȡ
			RandomAccessFile file=new RandomAccessFile("D:\\JAVA\\readdemo/ndajsjdsa.mp3", "rw");//�Զ�д�ķ�ʽ������ָ��·��
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
				if(read==-1)break;//�������
				file.seek(downloaded);//�����ļ�ָ��
				file.write(buffer,0,read);//��buffer������ݴ�����file���0-read
				downloaded+=read;
				System.out.println("�������ؽ���:"+downloaded*1.0/filesize*10000/100+"%");
				
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
