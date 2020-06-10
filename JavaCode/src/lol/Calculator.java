package lol;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("分别输入三角形的A边，B边，C边,每输入一条边按一下回车");
        Scanner in = new Scanner(System.in);
        String x = in.nextLine();
        String y = in.nextLine();
        String z = in.nextLine();
        Double a = Double.parseDouble(x);
        Double b = Double.parseDouble(y);
        Double c = Double.parseDouble(z);
        if ((a+b<=c)||(b+c<=a)||a+c<=b) {
            System.out.println("这不是一个三角形");
        } else{
            Double A = (b*b+c*c-a*a)/(2*b*c);
            Double B = (a*a+c*c-b*b)/(2*a*c);
            Double C = (a*a+b*b-c*c)/(2*a*b);
            System.out.println("cosA = "+A.toString());
            System.out.println("cosB = "+B.toString());
            System.out.println("cosC = "+C.toString());
            double n = Math.acos(A);
            System.out.println("A边对应的角 = "+Math.toDegrees(n)+"度");
            double k = Math.acos(B);
            System.out.println("B边对应的角 = "+Math.toDegrees(k)+"度");
            double l = Math.acos(C);
            System.out.println("C边对应的角 = "+Math.toDegrees(l)+"度");
            System.err.println("计算存在误差，因为计算机的储存数据方式是二进制,不过不用担心，这个误差最大不会超过百分之1");
            System.err.println("不放心数据可以根据上面的余弦值查表得到角度");
        }

    }
}
