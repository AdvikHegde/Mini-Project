import javax.swing.*;
import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdminFMain {

    public static void main(String[] args) {
        AdminFMain1 obj = new AdminFMain1();
    }
};

class AdminFMain1 extends JFrame implements ActionListener {
    JButton b1 = new JButton("ADD CUSTOMER");
    JButton b2 = new JButton("VIEW CUSTOMER BILL DETAILS");
    JButton b3 = new JButton("CALCULATE BILL");
    JButton b4 = new JButton("UPDATE BILL STATUS");

    public AdminFMain1() {
        JFrame f = new JFrame("ADMIN OPERATIONS");
        f.setVisible(true);
        f.setSize(800, 550);
        f.setLayout(null);

        Font Font1 = new Font("Times New Roman", Font.BOLD, 15);

        // LABELS
        JLabel l1 = new JLabel("SELECT OPERATION TO PERFORM");
        l1.setBounds(450, 0, 400, 60);
        l1.setFont(Font1);
        f.add(l1);
        // b1 for admin to add customer
        b1.addActionListener(this);
        b1.setBounds(450, 125, 250, 50);
        f.add(b1);
        // b2 for admin to view all customer details with payment status
        b2.addActionListener(this);
        b2.setBounds(450, 225, 250, 50);
        f.add(b2);
        // b3 to calculate a specific bill for a month
        b3.addActionListener(this);
        b3.setBounds(450, 325, 250, 50);
        f.add(b3);
        // b4 to updatebill status when customer pays bills
        b4.addActionListener(this);
        b4.setBounds(450, 425, 250, 50);
        f.add(b4);

        ImageIcon image;
        try {
            image = new ImageIcon(getClass().getResource("C:\\Users\\Ashika\\Desktop"), getName());

            JLabel l4 = new JLabel(image);

            l4.setBounds(0, 0, 400, 550);
            l4.setBackground(Color.CYAN);
            add(l4);

        } catch (Exception e) {
            System.out.println("Image not found..");
        }

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            JFrame f = new JFrame("ADD CUSTOMER");
            f.setVisible(true);
            f.setSize(800, 550);
            f.setLayout(null);

            Font Font1 = new Font("Times New Roman", Font.BOLD, 15);

            JLabel l1 = new JLabel("CUSTOMER USERNAME");
            l1.setBounds(150, 50, 200, 50);
            l1.setFont(Font1);
            f.add(l1);

            JTextField t1 = new JTextField(20);
            t1.setBounds(450, 50, 200, 50);
            f.add(t1);

            JLabel l2 = new JLabel("CUSTOMER PASSWORD");
            l2.setBounds(150, 150, 200, 50);
            l2.setFont(Font1);
            f.add(l2);

            JTextField t2 = new JTextField(20);
            t2.setBounds(450, 150, 200, 50);
            f.add(t2);

            JLabel l3 = new JLabel("PHONE NUMBER");
            l3.setBounds(150, 250, 200, 50);
            l3.setFont(Font1);
            f.add(l3);

            JTextField t3 = new JTextField(20);
            t3.setBounds(450, 250, 200, 50);
            f.add(t3);

            JLabel l4 = new JLabel("EMAIL");
            l4.setBounds(150, 350, 200, 50);
            l4.setFont(Font1);
            f.add(l4);

            JTextField t4 = new JTextField(20);
            t4.setBounds(450, 350, 200, 50);
            f.add(t4);

            JButton b1 = new JButton("ADD");
            b1.setBounds(500, 450, 150, 50);
            b1.setFont(Font1);
            f.add(b1);

        }
        if (e.getSource() == b2) {
            JFrame f = new JFrame("CUSTOMER BILL DETAILS");
            f.setVisible(true);
            f.setSize(800, 550);
            f.setLayout(null);

            Font Font1 = new Font("Times New Roman", Font.BOLD, 15);

            JLabel l1 = new JLabel("CUSTOMER USERNAME");
            l1.setBounds(150, 200, 200, 50);
            l1.setFont(Font1);
            f.add(l1);

            JTextField t1 = new JTextField(20);
            t1.setBounds(450, 200, 200, 50);
            f.add(t1);

            JButton b1 = new JButton("SEARCH");
            b1.setBounds(500, 400, 150, 50);
            b1.setFont(Font1);
            f.add(b1);
        }
        if (e.getSource() == b3) {
            JFrame f = new JFrame("CUSTOMER BILL DETAILS");
            f.setVisible(true);
            f.setSize(800, 550);
            f.setLayout(null);

            Font Font1 = new Font("Times New Roman", Font.BOLD, 15);

            JLabel l1 = new JLabel("UNITS CONSUMED");
            l1.setBounds(150, 50, 200, 50);
            l1.setFont(Font1);
            f.add(l1);

            JTextField t1 = new JTextField(20);
            t1.setBounds(450, 50, 200, 50);
            f.add(t1);

            JLabel l2 = new JLabel("SLAB APPLICABLE");
            l2.setBounds(150, 150, 200, 50);
            l2.setFont(Font1);
            f.add(l2);

            JTextField t2 = new JTextField(20);
            t2.setBounds(450, 150, 200, 50);
            f.add(t2);

            JLabel l3 = new JLabel("COST PER UNIT");
            l3.setBounds(150, 250, 200, 50);
            l3.setFont(Font1);
            f.add(l3);

            JTextField t3 = new JTextField(20);
            t3.setBounds(450, 250, 200, 50);
            f.add(t3);

            JLabel l4 = new JLabel("TOTAL AMOUNT");
            l4.setBounds(150, 350, 200, 50);
            l4.setFont(Font1);
            f.add(l4);

            JTextField t4 = new JTextField(20);
            t4.setBounds(450, 350, 200, 50);
            f.add(t4);

            JButton b1 = new JButton("GENERATE BILL");
            b1.setBounds(450, 450, 200, 50);
            b1.setFont(Font1);
            f.add(b1);

        }
        if (e.getSource() == b4) {
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
        ;
    }

};
