package studing;

import java.util.Scanner;

public class Goods {
	public static void main(String[] args) {
		System.out.println("输入您的购买金额!");
		Scanner input=new Scanner(System.in);
		System.out.println("商品1的价格为:");
		double money1=input.nextDouble();
		System.out.println("商品2的价格为:");
		double money2=input.nextDouble();
		System.out.println("商品3的价格为：");
		double money3=input.nextDouble();
		double jiage=money1+money2+money3;
		double end_jiage;
		if((money1>5000&&money2>5000&money3>5000)||(money1+money2+money3>35000))
			end_jiage=0.7*jiage;
		else
			end_jiage=0.9*jiage;
		System.out.println("您需要支付的金额为:"+end_jiage);
		
	}

}
