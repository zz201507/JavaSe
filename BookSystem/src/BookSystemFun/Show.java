package BookSystemFun;
/*
     ��ʾ��ǰ�����鼮
 */

import java.util.Scanner;

public class Show {
    BookProperty bookProperty = new BookProperty();
    Scanner input = new Scanner(System.in);
    public void bookshow(){
        if(bookProperty.Name.size()==0)
            System.out.println("û���κ�ͼ��");
        else {
            for (int i = 0; i < bookProperty.Name.size(); i++) {
                System.out.println("����:" + bookProperty.Name.get(i));
                System.out.println("���:" + bookProperty.Num.get(i));
                System.out.println("����:" + bookProperty.Kind.get(i));
                System.out.println("ͼ��ʣ��:" + bookProperty.Surplus.get(i));
                System.out.println();
                System.out.println();
            }
        }
        System.out.println("�������˵����������");
        input.nextInt();
    }
}
