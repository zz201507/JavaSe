import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.*;

public class WindowsDemo {
    static JFrame jfrm = new JFrame("DownDemo");
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                ck();
            }
        });
    }

    public static void ck() {
        jfrm.setSize(500, 200);//窗体大小
        jfrm.setLocation(500, 300);//窗体坐标
        FlowLayout flow = new FlowLayout();
        jfrm.setLayout(flow);//流布局
        JLabel jlab1 = new JLabel("下载链接");//添加标签
        jfrm.add(jlab1);
        JTextField jtf = new JTextField();//设置一个文本框
        Dimension dm = new Dimension(400, 30);//设置文本框大小(除了JFrame)其它所有组件设置大小都是该方法
        jtf.setPreferredSize(dm);
        jfrm.add(jtf);
        JLabel jlab2 = new JLabel("存储路径");//添加标签
        jfrm.add(jlab2);
        JTextField jtf1 = new JTextField();//设置一个文本框
        Dimension dm1 = new Dimension(280, 30);//设置文本框大小(除了JFrame)其它所有组件设置大小都是该方法
        jtf1.setPreferredSize(dm1);
        jfrm.add(jtf1);
        JButton button = new JButton("下载");
        //Dimension dm2 = new Dimension(50,30);
        //button.setPreferredSize(dm2);
        jfrm.add(button);
        ButListener b1 = new ButListener();
        button.addActionListener(b1);
        b1.setJt(jtf, jtf1);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//关闭窗口后终止程序，默认不终止
        jfrm.setVisible(true);//设置可见

    }
    public static void fun1(String name) {
        JLabel jlab3 = new JLabel(name);//添加标签
        jfrm.setVisible(true);//设置可见
        //Dimension dm3 = new Dimension(100,50);
        //jlab3.setSize(dm3);
        jfrm.add(jlab3);
    }
}
