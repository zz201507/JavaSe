package BookSystemFun;
/*
     显示当前所有书籍
 */

import java.util.Scanner;

public class Show {
    BookProperty bookProperty = new BookProperty();
    Scanner input = new Scanner(System.in);
    public void bookshow(){
        if(bookProperty.Name.size()==0)
            System.out.println("没有任何图书");
        else {
            for (int i = 0; i < bookProperty.Name.size(); i++) {
                System.out.println("书名:" + bookProperty.Name.get(i));
                System.out.println("编号:" + bookProperty.Num.get(i));
                System.out.println("种类:" + bookProperty.Kind.get(i));
                System.out.println("图书剩余:" + bookProperty.Surplus.get(i));
                System.out.println();
                System.out.println();
            }
        }
        System.out.println("输入主菜单输入任意键");
        input.nextInt();
    }
}
