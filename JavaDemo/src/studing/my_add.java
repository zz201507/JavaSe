package studing;
import java.util.Scanner;
public class my_add {
public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("����Ǯ������!");
        double money=input.nextDouble();
        System.out.println("һ����"+money+"ԪǮ");
        int num=(int)money/10;
        System.out.println("��Ҫ"+num+"��ʮԪǮ");
        num=((int)money%10)/5;
        System.out.println("��Ҫ"+num+"����ԪǮ");
        num=((int)money%10)-5;
        System.out.println("��Ҫ"+num+"��һԪǮ");
        num=((int)money*10)%10/5;
        System.out.println("��Ҫ"+num+"����ëǮ");
        num=((int)money*10)%10-5;
        System.out.println("��Ҫ"+num+"��һëǮ");
		}
}
