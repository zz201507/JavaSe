package studing2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Listener implements ActionListener {
    Jframe jfm = new Jframe();
    @Override
    public void actionPerformed(ActionEvent e) {
        JLabel JL = new JLabel("132");
        Dimension a = new Dimension(100,100);
        JL.setPreferredSize(a);
        jfm.jf.add(JL);
    }
}
