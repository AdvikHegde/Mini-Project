import javax.swing.*;
import javax.swing.JFrame;
import java.awt.*;

public class swingDemo {
    public static void main(String[] args) {
        class1 obj = new class1();
    }
};

class class1 extends JFrame {
    public class1() {
        JFrame f = new JFrame("USER FORM");
        f.setVisible(true);
        f.setSize(800, 550);
        f.setLayout(null);
        // grid layout allows to select layout ourself
        Font Font1 = new Font("Times New Roman", Font.BOLD, 15);
        // ADDING REQUIRED LABELS
        // LABEL 1

        JLabel l0 = new JLabel("ADMIN OR CUSTOMER ?");
        l0.setBounds(300, 0, 200, 150);
        l0.setFont(Font1);
        f.add(l0);

        JRadioButton admin = new JRadioButton("Admin");
        admin.setBounds(200, 125, 80, 20);
        JRadioButton cust = new JRadioButton("Customer");
        cust.setBounds(300, 125, 100, 20);
        // Setting default state to be customer
        cust.setSelected(true);
        admin.setFont(Font1);
        cust.setFont(Font1);
        f.add(admin);
        f.add(cust);
        // Allowing user to only select admin or customer at a time
        ButtonGroup gen = new ButtonGroup();
        gen.add(admin);
        gen.add(cust);

        JLabel l1 = new JLabel("Username :");
        l1.setBounds(200, 200, 200, 20);
        l1.setFont(Font1);
        f.add(l1);

        JTextField t1 = new JTextField(20);
        t1.setBounds(300, 200, 200, 20);
        f.add(t1);

        // LABEL 2
        JLabel l2 = new JLabel("Password :");
        l2.setBounds(200, 300, 200, 20);
        l2.setFont(Font1);
        f.add(l2);

        JTextField t2 = new JTextField(20);
        t2.setBounds(300, 300, 200, 20);
        f.add(t2);

        JButton b = new JButton("SUBMIT");
        b.setBounds(400, 400, 100, 50);
        f.add(b);

        String f1[] = { "Sign In", "Log In" };
        JComboBox cb = new JComboBox(f1);
        cb.setBounds(200, 400, 100, 50);
        f.add(cb);

    };

}
