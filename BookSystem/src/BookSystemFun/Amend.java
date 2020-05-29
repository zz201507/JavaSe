package BookSystemFun;

import java.awt.print.Book;
import java.util.Scanner;

/*
     修改书籍信息
 */
public class Amend {
    Scanner input = new Scanner(System.in);

    public void bookamend() {
        System.out.println("按书名修改输入1，按编号修改输入2");
        Integer a = input.nextInt();
        input.nextLine();
        while (a<1||a>2){
            System.out.println("输入有误，重新输入");
            a = input.nextInt();
        }
        if (a==1) {
            int i = 0;
            System.out.println("输入要修改的书名");
            String name = input.nextLine();
            while (true) {
                if (i >= BookProperty.Name.size()) {
                    System.out.println("没有该书籍");
                    break;
                }
                else if (name.equals(BookProperty.Name.get(i))) {
                    System.out.println("输入修改后的书名");
                    String name1 = input.nextLine();
                    BookProperty.Name.set(i, name1);

                    System.out.println("修改书籍编号输入0,不修改编号输入任意数字");
                    String num = input.nextLine();
                    if (num.equals("0")) {
                        System.out.println("输入修改后的编号");
                        String num1 = input.nextLine();
                        BookProperty.Num.set(i, num1);
                    }

                    System.out.println("修改书籍种类输入0,不修改编号输入任意数字");
                    String kind = input.nextLine();
                    if (kind.equals("0")) {
                        System.out.println("输入修改后的种类");
                        String kind1 = input.nextLine();
                        BookProperty.Kind.set(i, kind1);
                    }

                    System.out.println("修改书籍剩余量输入0，不修改输入任意数字");
                    Integer surplus = input.nextInt();
                    if (surplus.equals(0)) {
                        System.out.println("输入修改后的剩余量");
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
            System.out.println("输入要修改书籍的编号");
            String booknum = input.nextLine();
            while (true) {
                if (i>=BookProperty.Num.size()) {
                    System.out.println("没有该书籍");
                    break;
                } else if (booknum.equals(BookProperty.Num.get(i))) {
                    System.out.println("输入要修改的书名");
                    String name1 = input.nextLine();
                    BookProperty.Name.set(i, name1);

                    System.out.println("修改书籍编号输入0,不修改编号输入任意数字");
                    String num1 = input.nextLine();
                    if (num1.equals("0")) {
                        System.out.println("输入要修改的编号");
                        String num2 = input.nextLine();
                        BookProperty.Num.set(i, num2);
                    }

                    System.out.println("修改书籍种类输入0,不修改编号输入任意数字");
                    String kind = input.nextLine();
                    if (kind.equals("0")) {
                        System.out.println("输入要修改的种类");
                        String kind1 = input.nextLine();
                        BookProperty.Kind.set(i, kind1);
                    }

                    System.out.println("修改书籍剩余量输入0，不修改输入任意数字");
                    Integer surplus = input.nextInt();
                    if (surplus.equals(0)) {
                        System.out.println("输入要修改的剩余量");
                        Integer surplus1 = input.nextInt();
                        BookProperty.Surplus.set(i, surplus1);
                    }
                }
            }
        }
    }
}
