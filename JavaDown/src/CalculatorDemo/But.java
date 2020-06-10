package CalculatorDemo;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class But implements ActionListener {
    CalculatorWindow Cal = new CalculatorWindow();
    private JTextField str1;
    private JTextField str2;
    private JTextField str3;

    public void setJt(JTextField jtf1, JTextField jtf2, JTextField jtf3) {
        str1 = jtf1;
        str2 = jtf2;
        str3 = jtf3;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String x = str1.getText();
        String y = str2.getText();
        String z = str3.getText();
        Double a = Double.parseDouble(x);
        System.out.println(a);
        Double b = Double.parseDouble(y);
        Double c = Double.parseDouble(z);
        if ((a + b <= c) || (b + c <= a) || a + c <= b) {
            JLabel jlab4 = new JLabel("这不是一个三角形");
            Cal.jfrm.add(jlab4);
        } else {
            Double A = (b * b + c * c - a * a) / (2 * b * c);
            Double B = (a * a + c * c - b * b) / (2 * a * c);
            Double C = (a * a + b * b - c * c) / (2 * a * b);
            JLabel jla1 = new JLabel("cosA = "+A.toString());
            Cal.jfrm.add(jla1);
            JLabel jla2 = new JLabel("cosB = "+B.toString());
            Cal.jfrm.add(jla2);
            JLabel jla3 = new JLabel("cosC = "+C.toString());
            Cal.jfrm.add(jla3);
        }
    }
}
