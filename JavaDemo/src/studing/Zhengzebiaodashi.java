package studing;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Zhengzebiaodashi {
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		System.out.println("输入电话号码!");
		String num=input.nextLine();
		String regex="1[3578]\\d{9}";
		Pattern p=Pattern.compile(regex);//正则表达式
		Matcher m =p.matcher(num);
		boolean right=m.matches();
		if(right) 
			System.out.println("这是一个电话号码!");
		else
			System.out.println("这不是一个电话号码!");
		input.close();
	}
	
	
	

}
