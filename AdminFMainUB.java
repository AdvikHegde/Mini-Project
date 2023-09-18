import javax.swing.*;
import javax.swing.JFrame;
import java.awt.*;

public class AdminFMainUB {

    public static void main(String[] args) {
        AdminFMainUB1 obj = new AdminFMainUB1();
    }
};

class AdminFMainUB1 extends JFrame {
    public AdminFMainUB1() {
        JFrame f = new JFrame("UPDATE BILL DETAILS");
        f.setVisible(true);
        f.setSize(800, 800);
        f.setLayout(null);

        Font Font1 = new Font("Times New Roman", Font.BOLD, 15);

        JLabel l1 = new JLabel("CUSTOMER USERNAME");
        l1.setBounds(150, 50, 200, 50);
        l1.setFont(Font1);
        f.add(l1);

        JTextField t1 = new JTextField(20);
        t1.setBounds(450, 50, 200, 50);
        f.add(t1);

        // String f1[] = { "JANUARY", "FEBRUARY", "MARCH", "APRIL", "MAY", "JUNE",
        // "JULY", "AUGUST", "SEPTEMBER",
        // "OCTOBER", "NOVEMBER", "DECEMBER" };
        // JComboBox cb = new JComboBox(f1);
        // cb.setBounds(150, 200, 100, 50);
        // f.add(cb);

        JRadioButton month1 = new JRadioButton("JANUARY");
        month1.setBounds(50, 150, 150, 20);
        JRadioButton month2 = new JRadioButton("FEBRUARY");
        month2.setBounds(250, 150, 150, 20);
        JRadioButton month3 = new JRadioButton("MARCH");
        month3.setBounds(450, 150, 150, 20);
        JRadioButton month4 = new JRadioButton("APRIL");
        month4.setBounds(650, 150, 150, 20);

        JRadioButton month5 = new JRadioButton("MAY");
        month5.setBounds(50, 250, 150, 20);
        JRadioButton month6 = new JRadioButton("JUNE");
        month6.setBounds(250, 250, 150, 20);
        JRadioButton month7 = new JRadioButton("JULY");
        month7.setBounds(450, 250, 150, 20);
        JRadioButton month8 = new JRadioButton("AUGUST");
        month8.setBounds(650, 250, 150, 20);

        JRadioButton month9 = new JRadioButton("SEPTEMBER");
        month9.setBounds(50, 350, 150, 20);
        JRadioButton month10 = new JRadioButton("OCTOBER");
        month10.setBounds(250, 350, 150, 20);
        JRadioButton month11 = new JRadioButton("NOVEMBER");
        month11.setBounds(450, 350, 150, 20);
        JRadioButton month12 = new JRadioButton("DECEMBER");
        month12.setBounds(650, 350, 150, 20);

        month1.setFont(Font1);
        month2.setFont(Font1);
        month3.setFont(Font1);
        month4.setFont(Font1);
        month5.setFont(Font1);
        month6.setFont(Font1);
        month7.setFont(Font1);
        month8.setFont(Font1);
        month9.setFont(Font1);
        month10.setFont(Font1);
        month11.setFont(Font1);
        month12.setFont(Font1);

        f.add(month1);
        f.add(month2);
        f.add(month3);
        f.add(month4);
        f.add(month5);
        f.add(month6);
        f.add(month7);
        f.add(month8);
        f.add(month9);
        f.add(month10);
        f.add(month11);
        f.add(month12);

        JRadioButton status1 = new JRadioButton("PAID");
        status1.setBounds(150, 600, 100, 20);
        JRadioButton status2 = new JRadioButton("UNPAID");
        status2.setBounds(450, 600, 100, 20);
        // Setting default state to be unpaid
        status2.setSelected(true);
        status1.setFont(Font1);
        status2.setFont(Font1);
        f.add(status1);
        f.add(status2);
        // Allowing admin to only select paid or unpaid at a time
        ButtonGroup gen = new ButtonGroup();
        gen.add(status1);
        gen.add(status2);

        JButton b1 = new JButton("UPDATE");
        b1.setBounds(500, 700, 150, 50);
        b1.setFont(Font1);
        f.add(b1);

    }
};
