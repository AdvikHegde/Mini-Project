import javax.swing.*;
import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class firstpage {
    public static void main(String[] args) {
        class1 obj = new class1();
    }
};

class class1 implements ActionListener {
    JLabel l1 = new JLabel("ADMIN OR CUSTOMER");

    JButton b1 = new JButton("ADMIN");
    JButton b2 = new JButton("CUSTOMER");
    // b3 admin sign in b4 admin log in
    // b5 customer sign in b6 customer log in
    JButton b3 = new JButton("SIGN IN");
    JButton b4 = new JButton("LOG IN");

    JButton b5 = new JButton("SIGN IN");
    JButton b6 = new JButton("LOG IN");

    JButton b7 = new JButton("SUBMIT");

    Font Font1 = new Font("Times New Roman", Font.BOLD, 15);

    public class1() {
        JFrame f = new JFrame("CUSTOMER SIGN IN");
        f.setVisible(true);
        f.setSize(300, 300);
        f.setLayout(null);
        // buttons of first frame to choose whether user is admin or listener,b1 is
        // admin,b2 is customer
        b1.setBounds(75, 50, 150, 50);
        b2.setBounds(75, 150, 150, 50);

        f.add(b1);
        f.add(b2);

        Font Font1 = new Font("Times New Roman", Font.BOLD, 15);
        l1.setFont(Font1);
        l1.setBounds(50, 0, 150, 50);

        b1.addActionListener(this);
        b2.addActionListener(this);
        // b3 admin sign in,b4 admin log in
        // b5 customer sign in,b6 customer log in
        b3.addActionListener(this);
        b4.addActionListener(this);

        b5.addActionListener(this);
        b6.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            // b1 is choice of admin
            JFrame f = new JFrame("ADMIN");
            f.setVisible(true);
            f.setSize(300, 300);
            f.setLayout(null);

            JLabel l1 = new JLabel("SIGN IN OR LOG IN");
            l1.setFont(Font1);
            l1.setBounds(50, 0, 200, 50);

            b3.setBounds(75, 50, 100, 50);
            b4.setBounds(75, 150, 100, 50);

            f.add(l1);
            f.add(b3);
            f.add(b4);

        }

        if (e.getSource() == b2) {
            // b2 is choice of customer
            JFrame f = new JFrame("CUSTOMER");
            f.setVisible(true);
            f.setSize(300, 300);
            f.setLayout(null);

            JLabel l1 = new JLabel("SIGN IN OR LOG IN");
            l1.setFont(Font1);
            l1.setBounds(50, 0, 200, 50);

            b5.setBounds(75, 50, 100, 50);
            b6.setBounds(75, 150, 100, 50);

            f.add(l1);
            f.add(b5);
            f.add(b6);

        }

        if (e.getSource() == b3) {
            JFrame f = new JFrame("ADMIN SIGN IN");
            f.setVisible(true);
            f.setSize(800, 550);
            f.setLayout(null);
            // try to insert background image in label
            ImageIcon image;
            try {
                image = new ImageIcon(getClass().getResource("img1.jpg"));

                JLabel l4 = new JLabel(image);

                l4.setBounds(10, 0, 400, 550);
                l4.setBackground(Color.CYAN);
                f.add(l4);

            } catch (Exception e3) {
                System.out.println("Image not found..");
            }

            Font Font1 = new Font("Times New Roman", Font.BOLD, 15);

            JLabel l1 = new JLabel("USERNAME");
            l1.setBounds(450, 100, 200, 50);
            l1.setFont(Font1);
            f.add(l1);

            JTextField t1 = new JTextField(20);
            t1.setBounds(575, 100, 150, 50);
            f.add(t1);

            JLabel l2 = new JLabel("PASSWORD");
            l2.setBounds(450, 200, 200, 50);
            l2.setFont(Font1);
            f.add(l2);

            JTextField t2 = new JTextField(20);
            t2.setBounds(575, 200, 150, 50);
            f.add(t2);

            JLabel l3 = new JLabel("ADMIN CODE");
            l3.setBounds(450, 300, 200, 50);
            l3.setFont(Font1);
            f.add(l3);

            JTextField t3 = new JTextField(20);
            t3.setBounds(575, 300, 150, 50);
            f.add(t3);

            JButton b = new JButton("SIGN IN");
            b.setBounds(625, 400, 100, 50);
            f.add(b);

        }

        if (e.getSource() == b4) {

            JFrame f = new JFrame("ADMIN LOG IN");
            f.setVisible(true);
            f.setSize(800, 550);
            f.setLayout(null);

            JLabel l0 = new JLabel("KINDLY ENTER YOUR DETAILS");
            l0.setBounds(475, 100, 300, 50);
            l0.setFont(Font1);
            f.add(l0);

            JLabel l1 = new JLabel("USERNAME :");
            l1.setBounds(450, 200, 200, 50);
            l1.setFont(Font1);
            f.add(l1);

            JTextField t1 = new JTextField(20);
            t1.setBounds(550, 200, 200, 50);
            f.add(t1);
            // try to insert background image in label
            ImageIcon image;
            try {
                image = new ImageIcon(getClass().getResource("login page.jpg"));

                JLabel l4 = new JLabel(image);

                l4.setBounds(0, 0, 400, 550);
                l4.setBackground(Color.CYAN);
                f.add(l4);

            } catch (Exception e3) {
                System.out.println("Image not found..");
            }

            // LABEL 2
            JLabel l2 = new JLabel("PASSWORD :");
            l2.setBounds(450, 300, 200, 50);
            l2.setFont(Font1);
            f.add(l2);

            JTextField t2 = new JTextField(20);
            t2.setBounds(550, 300, 200, 50);
            f.add(t2);

            b7.setBounds(650, 400, 100, 50);
            f.add(b7);

        }

        if (e.getSource() == b5) {
            JFrame f = new JFrame("CUSTOMER SIGN IN");
            f.setVisible(true);
            f.setSize(800, 550);
            f.setLayout(null);

            Font Font1 = new Font("Times New Roman", Font.BOLD, 15);
            // try to insert background image in label
            ImageIcon image;
            try {
                image = new ImageIcon(getClass().getResource("img1.jpg"));

                JLabel l4 = new JLabel(image);

                l4.setBounds(10, 0, 400, 550);
                l4.setBackground(Color.CYAN);
                f.add(l4);

            } catch (Exception e2) {
                System.out.println("Image not found..");
            }

            JLabel l1 = new JLabel("USERNAME");
            l1.setBounds(450, 50, 200, 50);
            l1.setFont(Font1);
            f.add(l1);

            JTextField t1 = new JTextField(20);
            t1.setBounds(600, 50, 150, 50);
            f.add(t1);

            JLabel l2 = new JLabel("PASSWORD");
            l2.setBounds(450, 150, 200, 50);
            l2.setFont(Font1);
            f.add(l2);

            JTextField t2 = new JTextField(20);
            t2.setBounds(600, 150, 150, 50);
            f.add(t2);

            JLabel l3 = new JLabel("EMAIL");
            l3.setBounds(450, 250, 200, 50);
            l3.setFont(Font1);
            f.add(l3);

            JTextField t3 = new JTextField(20);
            t3.setBounds(600, 250, 150, 50);
            f.add(t3);

            JLabel l4 = new JLabel("PHONE NUMBER");
            l4.setBounds(450, 350, 200, 50);
            l4.setFont(Font1);
            f.add(l4);

            JTextField t4 = new JTextField(20);
            t4.setBounds(600, 350, 150, 50);
            f.add(t4);

            JButton b = new JButton("SIGN IN");
            b.setBounds(650, 450, 100, 50);
            f.add(b);

        }

        if (e.getSource() == b6) {
            JFrame f = new JFrame("CUSTOMER LOG IN");
            f.setVisible(true);
            f.setSize(800, 550);
            f.setLayout(null);

            JLabel l0 = new JLabel("KINDLY ENTER YOUR DETAILS");
            l0.setBounds(475, 100, 300, 50);
            l0.setFont(Font1);
            f.add(l0);

            JLabel l1 = new JLabel("USERNAME :");
            l1.setBounds(450, 200, 200, 50);
            l1.setFont(Font1);
            f.add(l1);

            JTextField t1 = new JTextField(20);
            t1.setBounds(550, 200, 200, 50);
            f.add(t1);
            // try to insert background image in label
            ImageIcon image;
            try {
                image = new ImageIcon(getClass().getResource("login page.jpg"));

                JLabel l4 = new JLabel(image);

                l4.setBounds(0, 0, 400, 550);
                l4.setBackground(Color.CYAN);
                f.add(l4);

            } catch (Exception e3) {
                System.out.println("Image not found..");
            }

            // LABEL 2
            JLabel l2 = new JLabel("PASSWORD :");
            l2.setBounds(450, 300, 200, 50);
            l2.setFont(Font1);
            f.add(l2);

            JTextField t2 = new JTextField(20);
            t2.setBounds(550, 300, 200, 50);
            f.add(t2);

            b7.setBounds(650, 400, 100, 50);
            f.add(b7);

        }

    }

}
