package studing;
import java.util.Scanner;
public class Chongzai {
	public static void main(String[] args) {
		System.out.println("����Ƚ�ֵ��");
		Scanner input=new Scanner(System.in);
		double a=input.nextDouble();
		double b=input.nextDouble();
		double c=max(a,b);
		System.out.println("���ֵΪ:"+c);
	}
	public static int max(int a,int b) {
		return a>b?a:b;
	}
	public static double max(double a,double b) {
		return a>b?a:b;
	}

}
