package BookSystemFun;

import java.util.Scanner;
/*
 ���ͼ����Ϣ�ķ���
 */

public class AddBookInformation extends BookProperty {
    Scanner input = new Scanner(System.in);
    public void add() {
        int a;
        while(true) {
            System.out.println("���ͼ�������");
            String name = input.nextLine();
            Name.add(name);

            System.out.println("���ͼ��ı��");
            String num = input.nextLine();
            Num.add(num);

            System.out.println("���ͼ������");
            String kind = input.nextLine();
            Kind.add(kind);

            System.out.println("��ӵ�ǰͼ��ʣ����");
            Integer surplus = input.nextInt();
            Surplus.add(surplus);

            System.out.println("�����������1��ֹͣ�������0");
            a = input.nextInt();
            while(a<0||a>1) {
                System.out.println("����������������");
                a = input.nextInt();
            }
            input.nextLine();
            if(a==1) a++;
            else break;
        }
    }
}
