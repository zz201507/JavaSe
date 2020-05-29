package studing2;

import javax.swing.*;
import javax.swing.plaf.basic.BasicOptionPaneUI;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Jframe {
    static JFrame jf = new JFrame();

    public static void window(){
        FlowLayout flow = new FlowLayout();
        jf.setLayout(flow);
        jf.setSize(500,300);
        jf.setLocation(500,300);
        JLabel JL = new JLabel("132");
        Dimension a = new Dimension(100,100);
        JL.setPreferredSize(a);
        jf.add(JL);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);
    }
    static void Button(){
        JButton J1 = new JButton("Yes");
        jf.add(J1);
        Listener l1 = new Listener();
        J1.addActionListener(l1);
    }
    public static void main(String[] args) {
        window();
        Button();
    }
}
