package MainFun;

import java.util.Scanner;

public class Memu{
    Scanner input = new Scanner(System.in);
    public int memu(){
        System.out.println("����鼮----------1");
        System.out.println("�����鼮----------2");
        System.out.println("�޸��鼮----------3");
        System.out.println("ɾ���鼮----------4");
        System.out.println("��ʾ�����鼮-------5");
        System.out.println("�˳�ϵͳ----------6");
        System.out.println("����ѡ��");
        int b = input.nextInt();
        return b;
    }
}
