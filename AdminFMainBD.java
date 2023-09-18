import javax.swing.*;
import javax.swing.JFrame;
import java.awt.*;

public class AdminFMainBD {
    public static void main(String[] args) {
        AdminFMainBD1 obj = new AdminFMainBD1();
    }

}

class AdminFMainBD1 extends JFrame {
    public AdminFMainBD1() {
        JFrame f = new JFrame("CUSTOMER BILL DETAILS");
        f.setVisible(true);
        f.setSize(800, 550);
        f.setLayout(null);

        Font Font1 = new Font("Times New Roman", Font.BOLD, 15);

        JLabel l1 = new JLabel("CUSTOMER USERNAME");
        l1.setBounds(150, 100, 200, 50);
        l1.setFont(Font1);
        f.add(l1);

        JTextField t1 = new JTextField(20);
        t1.setBounds(450, 100, 200, 50);
        f.add(t1);

        JButton b1 = new JButton("SEARCH");
        b1.setBounds(500, 400, 150, 50);
        b1.setFont(Font1);
        f.add(b1);

    };

};