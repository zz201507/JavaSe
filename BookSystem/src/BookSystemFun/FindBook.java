package BookSystemFun;

import java.util.Scanner;
/*
   图书的查找功能
 */
public class FindBook {

    Scanner input = new Scanner(System.in);

    public void Find() {
        System.out.println("按书名查找输入1，按编号查找输入2");
        int n = input.nextInt();
        input.nextLine();
        while (n < 1 || n > 2) {
            System.out.println("输入有误，重新输入");
            n = input.nextInt();
        }
        if (n == 1) {// 按书名查找
            int i = 0;
            System.out.println("输入要查找的书名");
            String bookname = input.nextLine();
            while (true) {
                if (i >= BookProperty.Name.size()) {
                    System.out.println("没有此图书!");
                    break;
                } else if (bookname.equals(BookProperty.Name.get(i))) {
                    System.out.println("已找到该图书，该图书信息如下");
                    System.out.println("书名:" + BookProperty.Name.get(i));
                    System.out.println("编号:" + BookProperty.Num.get(i));
                    System.out.println("种类:" + BookProperty.Kind.get(i));
                    System.out.println("剩余:" + BookProperty.Surplus.get(i));
                    break;
                } else
                    i++;
            }
            System.out.println("返回主菜单输入任意键");
            input.nextInt();
        }
        if (n == 2) {
            int i = 0;
            System.out.println("输入要查找书籍的编号");
            String booknum = input.nextLine();
            while (true) {
                if (i >= BookProperty.Num.size()) {
                    System.out.println("没有此图书!");
                    break;
                } else if (booknum.equals(BookProperty.Num.get(i))) {
                    System.out.println("已找到该图书，该图书信息如下");
                    System.out.println("书名:" + BookProperty.Name.get(i));
                    System.out.println("编号:" + BookProperty.Num.get(i));
                    System.out.println("种类:" + BookProperty.Kind.get(i));
                    System.out.println("剩余:" + BookProperty.Surplus.get(i));
                    break;
                } else
                    i++;
            }
            System.out.println("返回主菜单输入任意键");
            input.nextInt();
        }
    }
}
