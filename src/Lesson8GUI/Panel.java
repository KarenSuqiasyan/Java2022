package Lesson8GUI;

import javax.swing.*;

public class Panel {


    public Panel getPanel () {
        JFrame a = new JFrame("example");
        JPanel p = new JPanel();
        p.setBounds(40, 70, 200, 200);
       // JButton b = new JButton("click me");
//        b.setBounds(60, 50, 80, 40);
//        p.add(b);
        a.add(p);
        a.setSize(400, 400);
        a.setLayout(null);
        a.setVisible(true);
        return new Panel();
    }
}
