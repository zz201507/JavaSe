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
				//设置连接属性
				//connection.setRequestProperty("Range", "bytes=0-");
				connection.connect();//连接到服务器,连接成功后会返回代码，200-299
				if(connection.getResponseCode()/100!=2) {
					WindowsDemo.fun1("连接失败");
					return;
				}
				else {
					BufferedInputStream input = new BufferedInputStream(connection.getInputStream());
					file1=new RandomAccessFile(Catalog,"rw");//以读写的方式下载至指定路径
					//file1.seek(0);//文件指针置0
					int filesize=connection.getContentLength();//获取文件大小
					int downfile=0;
					while(downfile<filesize) {
						bytes=new byte[102400];
						int num=input.read(bytes);
						downfile+=num;
						file1.write(bytes,0,num);
//						String name = String.valueOf(num*1.0/filesize*100)+"%";
//						WindowsDemo.fun1("当前下载:"+name);
					}
				}
				WindowsDemo.fun1("下载完成");
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