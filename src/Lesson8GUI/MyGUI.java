package Lesson8GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class MyGUI extends JFrame {
    Local local = new Local();
    ArrayList<Data> dataArrayList = new ArrayList<>();
    int intSum;
    int intPercent;
    int intYear;
    private JLabel sum = new JLabel("Sum");
    private JButton button = new JButton("calculate");

    private JButton storyBtn = new JButton("Story");

    private JButton clearBtn = new JButton("clear");

    private JTextField inputLoanSum = new JTextField("", 5);
    private JTextField inputLoanPercent = new JTextField("", 5);
    private JTextField inputLoanYear = new JTextField("", 5);
    private JLabel loanSum = new JLabel("input Loan Sum");
    private JLabel LoanPercent = new JLabel("input Loan Percent");
    private JLabel LoanYear = new JLabel("input Loan Year");
    private JLabel datark = new JLabel();

    public MyGUI() {

        super("Loan Calucalator");
        setSize(640, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Container container = this.getContentPane();
        setLayout(new GridLayout(4, 3));

        add(loanSum);
        add(LoanPercent);
        add(LoanYear);
        add(inputLoanSum);
        add(inputLoanPercent);
        add(inputLoanYear);
        button.addActionListener(new ButtonEventListener());
        add(button);
        clearBtn.addActionListener(new ClearButtonEventListener());
        add(clearBtn);
        storyBtn.addActionListener(new StoryButtonEventListener());
        add(storyBtn);
        add(datark);
        add(sum);

    }

    public int loanCalculateMethod() {
        String sum = inputLoanSum.getText();
        String percent = inputLoanPercent.getText();
        String year = inputLoanYear.getText();

        intSum = Integer.parseInt(sum);
        intPercent = Integer.parseInt(percent);
        intYear = Integer.parseInt(year);

        return (int) ((intSum * 0.57 * intYear / 100 * intPercent) + intSum);
    }

    class ButtonEventListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            // SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
            int sumMessage = loanCalculateMethod();
            String newMessage = String.valueOf(sumMessage);
            String str = "Sum is ";
            sum.setText(str + newMessage);
            Data data = new Data();
            data.setLoanSum(inputLoanSum.getText());
            data.setPercent(inputLoanPercent.getText());
            data.setYear(inputLoanYear.getText());
            data.setSum(sum.getText());
            dataArrayList.add(data);
//            JOptionPane.showMessageDialog(null, newMessage + str, "Output", JOptionPane.INFORMATION_MESSAGE);
            local.fileWriteMethod(data);
            //getPanel().add(newMessage,getPanel());
        }
    }

    class ClearButtonEventListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            inputLoanPercent.setText("");
            inputLoanSum.setText("");
            inputLoanYear.setText("");
        }
    }

    class StoryButtonEventListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            StoryLayout storyLayout = new StoryLayout();
            for (int i = 0; i < local.infoList().size(); i++) {
                storyLayout.row[0] = local.infoList().get(i);
                storyLayout.row[1] = local.infoList().get(i);
                storyLayout.row[2] = local.infoList().get(i);
                storyLayout.row[3] = local.infoList().get(i);
                storyLayout.model.addRow(storyLayout.row);
            }
        }
    }
}

