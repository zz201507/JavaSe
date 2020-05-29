package BookSystemFun;

import java.util.Scanner;
/*
   删除书籍
 */

public class Delete {
    Scanner input = new Scanner(System.in);

    public void bookdelete() {
        System.out.println("按书名删除请输入1，按编号删除请输入2");
        Integer a = input.nextInt();
        input.nextLine();
        while(a<1||a>2){
            System.out.println("输入有误，重新输入");
            a = input.nextInt();
        }

        if (a.equals(1)) {
            int i = 0;
            System.out.println("输入要删除的书名");
            String name = input.nextLine();
          //  System.out.println(property.Name.size());
            while (true) {
                if (i >= BookProperty.Name.size()) {
                    System.out.println("没有此图书!");
                    break;
                }
                else if (name.equals(BookProperty.Name.get(i))) {
                    BookProperty.Name.remove(i);
                    BookProperty.Num.remove(i);
                    BookProperty.Kind.remove(i);
                    BookProperty.Surplus.remove(i);
                    System.out.println("删除成功，输入任意键返回主菜单");
                    input.nextLine();
                    break;
                } else
                    i++;
            }

        }
        if(a.equals(2)){
            int i = 0;
            System.out.println("输入要删除书籍的编号");
            String num = input.nextLine();
            while(true){
                if(i>=BookProperty.Name.size()){
                    System.out.println("没有该书籍");
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
