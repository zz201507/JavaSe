package MainFun;

import java.util.Scanner;

public class Memu{
    Scanner input = new Scanner(System.in);
    public int memu(){
        System.out.println("添加书籍----------1");
        System.out.println("查找书籍----------2");
        System.out.println("修改书籍----------3");
        System.out.println("删除书籍----------4");
        System.out.println("显示所有书籍-------5");
        System.out.println("退出系统----------6");
        System.out.println("输入选项");
        int b = input.nextInt();
        return b;
    }
}
