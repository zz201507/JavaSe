package studing;

import java.util.Scanner;

public class Goods {
	public static void main(String[] args) {
		System.out.println("�������Ĺ�����!");
		Scanner input=new Scanner(System.in);
		System.out.println("��Ʒ1�ļ۸�Ϊ:");
		double money1=input.nextDouble();
		System.out.println("��Ʒ2�ļ۸�Ϊ:");
		double money2=input.nextDouble();
		System.out.println("��Ʒ3�ļ۸�Ϊ��");
		double money3=input.nextDouble();
		double jiage=money1+money2+money3;
		double end_jiage;
		if((money1>5000&&money2>5000&money3>5000)||(money1+money2+money3>35000))
			end_jiage=0.7*jiage;
		else
			end_jiage=0.9*jiage;
		System.out.println("����Ҫ֧���Ľ��Ϊ:"+end_jiage);
		
	}

}
