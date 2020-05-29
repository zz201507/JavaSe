package BookSystemFun;

import java.util.Scanner;
/*
 添加图书信息的方法
 */

public class AddBookInformation extends BookProperty {
    Scanner input = new Scanner(System.in);
    public void add() {
        int a;
        while(true) {
            System.out.println("添加图书的书名");
            String name = input.nextLine();
            Name.add(name);

            System.out.println("添加图书的编号");
            String num = input.nextLine();
            Num.add(num);

            System.out.println("添加图书种类");
            String kind = input.nextLine();
            Kind.add(kind);

            System.out.println("添加当前图书剩余量");
            Integer surplus = input.nextInt();
            Surplus.add(surplus);

            System.out.println("继续添加输入1，停止添加输入0");
            a = input.nextInt();
            while(a<0||a>1) {
                System.out.println("输入有误，重新输入");
                a = input.nextInt();
            }
            input.nextLine();
            if(a==1) a++;
            else break;
        }
    }
}
