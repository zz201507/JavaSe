package down;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class IoDemo {
	public static void main(String[] args) throws IOException {
		
		Scanner input=new Scanner(System.in);
		System.out.println("������������");
		String StrUrl=input.nextLine();
		URL url=new URL(StrUrl);
		//HttpURLConnection connection = (HttpURLConnection) url.openConnection();//���ӵ�������
		String fileName=url.getFile();
		System.out.println(fileName);
		input.close();
	}

}
