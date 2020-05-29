package studing;
import java.util.Scanner;
public class If_demo {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		/*int a=input.nextInt();
		int b=input.nextInt();
		if(a>b)
			System.out.println(a+">"+b);
		else
			System.out.println(a+"<"+b);*/
		char name=input.next().charAt(5);
		/*String name = input.nextLine();字符串按行输入*/
		System.out.println(name);
		/*if(name>='A'&&name<='Z')
			System.out.println("输入正确");
		else
			System.out.println("输入错误");*/
	}

}
