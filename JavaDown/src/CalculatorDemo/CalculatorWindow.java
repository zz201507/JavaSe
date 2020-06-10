package CalculatorDemo;

import windows.ButListener;

import javax.swing.*;
import java.awt.*;

public class CalculatorWindow {
    static JFrame jfrm = new JFrame("CalculatorDemo");
    public static void main(String[] args) {
        jfrm.setSize(500, 200);
        jfrm.setLocation(500, 300);
        FlowLayout flow = new FlowLayout();
        jfrm.setLayout(flow);

        JLabel jlab = new JLabel("请依次输入三条边的值");
        jfrm.add(jlab);


        JLabel jlab1 = new JLabel("A");
        jfrm.add(jlab1);
        JTextField jtf = new JTextField();
        Dimension dm = new Dimension(100, 30);
        jtf.setPreferredSize(dm);
        jfrm.add(jtf);

        JLabel jlab2 = new JLabel("B");
        jfrm.add(jlab2);
        JTextField jtf1 = new JTextField();
        Dimension dm1 = new Dimension(100, 30);
        jtf1.setPreferredSize(dm1);
        jfrm.add(jtf1);

        JLabel jlab3 = new JLabel("C");
        jfrm.add(jlab3);
        JTextField jtf2 = new JTextField();
        Dimension dm2 = new Dimension(100, 30);
        jtf2.setPreferredSize(dm2);
        jfrm.add(jtf2);

        JButton button = new JButton("计算");
        //Dimension dm2 = new Dimension(50,30);
        //button.setPreferredSize(dm2);
        jfrm.add(button);
        But b1 = new But();
        button.addActionListener(b1);
        b1.setJt(jtf, jtf1,jtf2);

        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jfrm.setVisible(true);

    }
}
