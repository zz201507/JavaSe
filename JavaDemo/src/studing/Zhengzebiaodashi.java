package studing;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Zhengzebiaodashi {
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		System.out.println("����绰����!");
		String num=input.nextLine();
		String regex="1[3578]\\d{9}";
		Pattern p=Pattern.compile(regex);//������ʽ
		Matcher m =p.matcher(num);
		boolean right=m.matches();
		if(right) 
			System.out.println("����һ���绰����!");
		else
			System.out.println("�ⲻ��һ���绰����!");
		input.close();
	}
	
	
	

}
