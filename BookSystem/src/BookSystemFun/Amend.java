package BookSystemFun;

import java.awt.print.Book;
import java.util.Scanner;

/*
     �޸��鼮��Ϣ
 */
public class Amend {
    Scanner input = new Scanner(System.in);

    public void bookamend() {
        System.out.println("�������޸�����1��������޸�����2");
        Integer a = input.nextInt();
        input.nextLine();
        while (a<1||a>2){
            System.out.println("����������������");
            a = input.nextInt();
        }
        if (a==1) {
            int i = 0;
            System.out.println("����Ҫ�޸ĵ�����");
            String name = input.nextLine();
            while (true) {
                if (i >= BookProperty.Name.size()) {
                    System.out.println("û�и��鼮");
                    break;
                }
                else if (name.equals(BookProperty.Name.get(i))) {
                    System.out.println("�����޸ĺ������");
                    String name1 = input.nextLine();
                    BookProperty.Name.set(i, name1);

                    System.out.println("�޸��鼮�������0,���޸ı��������������");
                    String num = input.nextLine();
                    if (num.equals("0")) {
                        System.out.println("�����޸ĺ�ı��");
                        String num1 = input.nextLine();
                        BookProperty.Num.set(i, num1);
                    }

                    System.out.println("�޸��鼮��������0,���޸ı��������������");
                    String kind = input.nextLine();
                    if (kind.equals("0")) {
                        System.out.println("�����޸ĺ������");
                        String kind1 = input.nextLine();
                        BookProperty.Kind.set(i, kind1);
                    }

                    System.out.println("�޸��鼮ʣ��������0�����޸�������������");
                    Integer surplus = input.nextInt();
                    if (surplus.equals(0)) {
                        System.out.println("�����޸ĺ��ʣ����");
                        Integer surplus1 = input.nextInt();
                        BookProperty.Surplus.set(i, surplus1);
                    }

                }else
                    i++;
                break;
            }
        }
        if (a.equals(2)) {
            int i = 0;
            System.out.println("����Ҫ�޸��鼮�ı��");
            String booknum = input.nextLine();
            while (true) {
                if (i>=BookProperty.Num.size()) {
                    System.out.println("û�и��鼮");
                    break;
                } else if (booknum.equals(BookProperty.Num.get(i))) {
                    System.out.println("����Ҫ�޸ĵ�����");
                    String name1 = input.nextLine();
                    BookProperty.Name.set(i, name1);

                    System.out.println("�޸��鼮�������0,���޸ı��������������");
                    String num1 = input.nextLine();
                    if (num1.equals("0")) {
                        System.out.println("����Ҫ�޸ĵı��");
                        String num2 = input.nextLine();
                        BookProperty.Num.set(i, num2);
                    }

                    System.out.println("�޸��鼮��������0,���޸ı��������������");
                    String kind = input.nextLine();
                    if (kind.equals("0")) {
                        System.out.println("����Ҫ�޸ĵ�����");
                        String kind1 = input.nextLine();
                        BookProperty.Kind.set(i, kind1);
                    }

                    System.out.println("�޸��鼮ʣ��������0�����޸�������������");
                    Integer surplus = input.nextInt();
                    if (surplus.equals(0)) {
                        System.out.println("����Ҫ�޸ĵ�ʣ����");
                        Integer surplus1 = input.nextInt();
                        BookProperty.Surplus.set(i, surplus1);
                    }
                }
            }
        }
    }
}
