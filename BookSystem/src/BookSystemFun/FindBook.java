package BookSystemFun;

import java.util.Scanner;
/*
   ͼ��Ĳ��ҹ���
 */
public class FindBook {

    Scanner input = new Scanner(System.in);

    public void Find() {
        System.out.println("��������������1������Ų�������2");
        int n = input.nextInt();
        input.nextLine();
        while (n < 1 || n > 2) {
            System.out.println("����������������");
            n = input.nextInt();
        }
        if (n == 1) {// ����������
            int i = 0;
            System.out.println("����Ҫ���ҵ�����");
            String bookname = input.nextLine();
            while (true) {
                if (i >= BookProperty.Name.size()) {
                    System.out.println("û�д�ͼ��!");
                    break;
                } else if (bookname.equals(BookProperty.Name.get(i))) {
                    System.out.println("���ҵ���ͼ�飬��ͼ����Ϣ����");
                    System.out.println("����:" + BookProperty.Name.get(i));
                    System.out.println("���:" + BookProperty.Num.get(i));
                    System.out.println("����:" + BookProperty.Kind.get(i));
                    System.out.println("ʣ��:" + BookProperty.Surplus.get(i));
                    break;
                } else
                    i++;
            }
            System.out.println("�������˵����������");
            input.nextInt();
        }
        if (n == 2) {
            int i = 0;
            System.out.println("����Ҫ�����鼮�ı��");
            String booknum = input.nextLine();
            while (true) {
                if (i >= BookProperty.Num.size()) {
                    System.out.println("û�д�ͼ��!");
                    break;
                } else if (booknum.equals(BookProperty.Num.get(i))) {
                    System.out.println("���ҵ���ͼ�飬��ͼ����Ϣ����");
                    System.out.println("����:" + BookProperty.Name.get(i));
                    System.out.println("���:" + BookProperty.Num.get(i));
                    System.out.println("����:" + BookProperty.Kind.get(i));
                    System.out.println("ʣ��:" + BookProperty.Surplus.get(i));
                    break;
                } else
                    i++;
            }
            System.out.println("�������˵����������");
            input.nextInt();
        }
    }
}
