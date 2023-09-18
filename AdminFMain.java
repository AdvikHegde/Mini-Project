import javax.swing.*;
import javax.swing.JFrame;
import java.awt.*;

public class AdminFMain {

    public static void main(String[] args) {
        AdminFMain1 obj = new AdminFMain1();
    }
};

class AdminFMain1 extends JFrame {
    public AdminFMain1() {
        JFrame f = new JFrame("ADMIN OPERATIONS");
        f.setVisible(true);
        f.setSize(800, 550);
        f.setLayout(null);

        Font Font1 = new Font("Times New Roman", Font.BOLD, 15);

        // LABELS
        JLabel l1 = new JLabel("SELECT OPERATION TO PERFORM");
        l1.setBounds(250, 0, 400, 60);
        l1.setFont(Font1);
        f.add(l1);

        JButton b1 = new JButton("ADD CUSTOMER");
        b1.setBounds(100, 150, 200, 50);
        f.add(b1);

        JButton b2 = new JButton("VIEW CUSTOMER BILL DETAILS");
        b2.setBounds(475, 150, 250, 50);
        f.add(b2);

        JButton b3 = new JButton("CALCULATE BILL");
        b3.setBounds(100, 300, 200, 50);
        f.add(b3);

        JButton b4 = new JButton("UPDATE BILL STATUS");
        b4.setBounds(475, 300, 250, 50);
        f.add(b4);

    }

};
