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
        jfrm.setSize(500, 200);//�����С
        jfrm.setLocation(500, 300);//��������
        FlowLayout flow = new FlowLayout();
        jfrm.setLayout(flow);//������
        JLabel jlab1 = new JLabel("��������");//��ӱ�ǩ
        jfrm.add(jlab1);
        JTextField jtf = new JTextField();//����һ���ı���
        Dimension dm = new Dimension(400, 30);//�����ı����С(����JFrame)��������������ô�С���Ǹ÷���
        jtf.setPreferredSize(dm);
        jfrm.add(jtf);
        JLabel jlab2 = new JLabel("�洢·��");//��ӱ�ǩ
        jfrm.add(jlab2);
        JTextField jtf1 = new JTextField();//����һ���ı���
        Dimension dm1 = new Dimension(280, 30);//�����ı����С(����JFrame)��������������ô�С���Ǹ÷���
        jtf1.setPreferredSize(dm1);
        jfrm.add(jtf1);
        JButton button = new JButton("����");
        //Dimension dm2 = new Dimension(50,30);
        //button.setPreferredSize(dm2);
        jfrm.add(button);
        ButListener b1 = new ButListener();
        button.addActionListener(b1);
        b1.setJt(jtf, jtf1);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//�رմ��ں���ֹ����Ĭ�ϲ���ֹ
        jfrm.setVisible(true);//���ÿɼ�

    }
    public static void fun1(String name) {
        JLabel jlab3 = new JLabel(name);//��ӱ�ǩ
        jfrm.setVisible(true);//���ÿɼ�
        //Dimension dm3 = new Dimension(100,50);
        //jlab3.setSize(dm3);
        jfrm.add(jlab3);
    }
}
