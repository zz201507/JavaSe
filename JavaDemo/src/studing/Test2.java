package studing;
import java.util.Scanner;
public class Test2 {
	String name;
	String num;
	public void yes() {
		Scanner input=new Scanner(System.in);
		System.out.println("��������");
        name=input.nextLine();
		if(name.equals("zz"))
			System.out.println("�ҽ�����");
		else
			System.out.println("�²�����˭");
		/*
		 * 
		 * ********�ָ���********
		 * 
		 */
		System.out.println("��������");
		num=input.nextLine();
		input.close();
		if(num.equals("18"))
			System.out.println("�ҽ���18��");
		else
			System.out.println("�²��Ҷ��");
	}
}
