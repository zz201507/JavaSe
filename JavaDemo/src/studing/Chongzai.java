package studing;
import java.util.Scanner;
public class Chongzai {
	public static void main(String[] args) {
		System.out.println("输入比较值！");
		Scanner input=new Scanner(System.in);
		double a=input.nextDouble();
		double b=input.nextDouble();
		double c=max(a,b);
		System.out.println("最大值为:"+c);
	}
	public static int max(int a,int b) {
		return a>b?a:b;
	}
	public static double max(double a,double b) {
		return a>b?a:b;
	}

}
