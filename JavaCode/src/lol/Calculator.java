package lol;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("�ֱ����������ε�A�ߣ�B�ߣ�C��,ÿ����һ���߰�һ�»س�");
        Scanner in = new Scanner(System.in);
        String x = in.nextLine();
        String y = in.nextLine();
        String z = in.nextLine();
        Double a = Double.parseDouble(x);
        Double b = Double.parseDouble(y);
        Double c = Double.parseDouble(z);
        if ((a+b<=c)||(b+c<=a)||a+c<=b) {
            System.out.println("�ⲻ��һ��������");
        } else{
            Double A = (b*b+c*c-a*a)/(2*b*c);
            Double B = (a*a+c*c-b*b)/(2*a*c);
            Double C = (a*a+b*b-c*c)/(2*a*b);
            System.out.println("cosA = "+A.toString());
            System.out.println("cosB = "+B.toString());
            System.out.println("cosC = "+C.toString());
            double n = Math.acos(A);
            System.out.println("A�߶�Ӧ�Ľ� = "+Math.toDegrees(n)+"��");
            double k = Math.acos(B);
            System.out.println("B�߶�Ӧ�Ľ� = "+Math.toDegrees(k)+"��");
            double l = Math.acos(C);
            System.out.println("C�߶�Ӧ�Ľ� = "+Math.toDegrees(l)+"��");
            System.err.println("�����������Ϊ������Ĵ������ݷ�ʽ�Ƕ�����,�������õ��ģ���������󲻻ᳬ���ٷ�֮1");
            System.err.println("���������ݿ��Ը������������ֵ���õ��Ƕ�");
        }

    }
}
