package studing;
import java.util.Scanner;
public class Test2 {
	String name;
	String num;
	public void yes() {
		Scanner input=new Scanner(System.in);
		System.out.println("输入名字");
        name=input.nextLine();
		if(name.equals("zz"))
			System.out.println("我叫张哲");
		else
			System.out.println("猜猜我是谁");
		/*
		 * 
		 * ********分割线********
		 * 
		 */
		System.out.println("输入年龄");
		num=input.nextLine();
		input.close();
		if(num.equals("18"))
			System.out.println("我今年18岁");
		else
			System.out.println("猜猜我多大");
	}
}
