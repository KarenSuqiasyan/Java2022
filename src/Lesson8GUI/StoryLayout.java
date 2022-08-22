package Lesson8GUI;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.ArrayList;

public class StoryLayout extends JFrame {

    JTable table;
    Local local = new Local();
    Object [] row = new Object[4];

    ArrayList<String> data = local.infoList();
    DefaultTableModel model = new DefaultTableModel();


    StoryLayout() {
        setLayout(new FlowLayout());
        String[] columnNames = {"LoanSum", "Percent", "Year", "Sum"};
        table = new JTable();
        table.setSize(500,500);

        JFrame frame = new JFrame("Window");
      //  frame.getContentPane().setBackground(new Color(0,0,0));
      //  frame.getContentPane().setForeground(Color.WHITE);
        frame.setBounds(100,100,500,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       // frame.getContentPane().setLayout(null);
       // frame.setLocationRelativeTo(null);

        model.setColumnIdentifiers(columnNames);
        table.setModel(model);

        table.setBackground(Color.white);
        table.setForeground(Color.black);
        table.setSelectionBackground(Color.GREEN);
        table.setGridColor(Color.GREEN);
        table.setSelectionForeground(Color.white);
        table.setRowHeight(30);
        table.setAutoCreateRowSorter(true);

        JScrollPane pane = new JScrollPane(table);
        pane.setBounds(100,100,100,100);
        frame.getContentPane().add(pane);
        frame.setVisible(true);
    }
}