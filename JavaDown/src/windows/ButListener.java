package windows;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.swing.JTextField;

public class ButListener implements ActionListener {
		WindowsDemo l=new WindowsDemo();
		private JTextField str1;
		private JTextField str2;
		public void setJt(JTextField jtf1,JTextField jtf2){
			 str1 = jtf1;
			 str2 = jtf2;
		}
		@Override
		public void actionPerformed(ActionEvent e) {
			String URL=str1.getText();
			String Catalog = str2.getText();
			HttpURLConnection connection=null;
			RandomAccessFile file1=null;
			File file = new File(Catalog);
			try {
				file.createNewFile();
				byte bytes[]=null; 
				URL url=new URL(URL);
				connection=(HttpURLConnection)url.openConnection();
				//������������
				//connection.setRequestProperty("Range", "bytes=0-");
				connection.connect();//���ӵ�������,���ӳɹ���᷵�ش��룬200-299
				if(connection.getResponseCode()/100!=2) {
					WindowsDemo.fun1("����ʧ��");
					return;
				}
				else {
					BufferedInputStream input = new BufferedInputStream(connection.getInputStream());
					file1=new RandomAccessFile(Catalog,"rw");//�Զ�д�ķ�ʽ������ָ��·��
					//file1.seek(0);//�ļ�ָ����0
					int filesize=connection.getContentLength();//��ȡ�ļ���С
					int downfile=0;
					while(downfile<filesize) {
						bytes=new byte[102400];
						int num=input.read(bytes);
						downfile+=num;
						file1.write(bytes,0,num);
//						String name = String.valueOf(num*1.0/filesize*100)+"%";
//						WindowsDemo.fun1("��ǰ����:"+name);
					}
				}
				WindowsDemo.fun1("�������");
			} catch (IOException e1) {
				e1.printStackTrace();
			}finally {
				try {
					file1.close();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
			
		}
	
	
	
}