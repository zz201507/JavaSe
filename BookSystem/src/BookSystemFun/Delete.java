package BookSystemFun;

import java.util.Scanner;
/*
   ɾ���鼮
 */

public class Delete {
    Scanner input = new Scanner(System.in);

    public void bookdelete() {
        System.out.println("������ɾ��������1�������ɾ��������2");
        Integer a = input.nextInt();
        input.nextLine();
        while(a<1||a>2){
            System.out.println("����������������");
            a = input.nextInt();
        }

        if (a.equals(1)) {
            int i = 0;
            System.out.println("����Ҫɾ��������");
            String name = input.nextLine();
          //  System.out.println(property.Name.size());
            while (true) {
                if (i >= BookProperty.Name.size()) {
                    System.out.println("û�д�ͼ��!");
                    break;
                }
                else if (name.equals(BookProperty.Name.get(i))) {
                    BookProperty.Name.remove(i);
                    BookProperty.Num.remove(i);
                    BookProperty.Kind.remove(i);
                    BookProperty.Surplus.remove(i);
                    System.out.println("ɾ���ɹ�������������������˵�");
                    input.nextLine();
                    break;
                } else
                    i++;
            }

        }
        if(a.equals(2)){
            int i = 0;
            System.out.println("����Ҫɾ���鼮�ı��");
            String num = input.nextLine();
            while(true){
                if(i>=BookProperty.Name.size()){
                    System.out.println("û�и��鼮");
                    break;
                }
                else if(num.equals(BookProperty.Num.get(i))){
                    BookProperty.Name.remove(i);
                    BookProperty.Num.remove(i);
                    BookProperty.Kind.remove(i);
                    BookProperty.Surplus.remove(i);
                }
                else
                    i++;
            }
        }
    }
}
