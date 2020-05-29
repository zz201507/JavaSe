package studing;
import java.util.Scanner;
public class my_add {
public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("输入钱的数量!");
        double money=input.nextDouble();
        System.out.println("一共有"+money+"元钱");
        int num=(int)money/10;
        System.out.println("需要"+num+"张十元钱");
        num=((int)money%10)/5;
        System.out.println("需要"+num+"张五元钱");
        num=((int)money%10)-5;
        System.out.println("需要"+num+"张一元钱");
        num=((int)money*10)%10/5;
        System.out.println("需要"+num+"张五毛钱");
        num=((int)money*10)%10-5;
        System.out.println("需要"+num+"张一毛钱");
		}
}
