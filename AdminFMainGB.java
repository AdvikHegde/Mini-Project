import javax.swing.*;
import javax.swing.JFrame;
import java.awt.*;

public class AdminFMainGB {
    public static void main(String[] args) {
        AdminFMainGB1 obj = new AdminFMainGB1();
    }
};

class AdminFMainGB1 extends JFrame {
    public AdminFMainGB1() {
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

    };

};