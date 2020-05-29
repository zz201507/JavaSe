import javax.swing.*;

public class Test1{
    public static void fun1(){
        JFrame jf1 = new JFrame();
        Runnable r1 = ()->{
            jf1.setSize(500,300);
            jf1.setLocation(500,300);
            jf1.setVisible(true);
        };
        new Thread(r1).start();
    }

    public static void main(String[] args) {
        fun1();
    }
}
