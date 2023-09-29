import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class customerf {

    public static void main(String[] args) {
        P5 obj = new P5();

    }

}

class P5 extends JFrame implements ActionListener {

    JButton b1 = new JButton("VIEW BILL");
    JButton b2 = new JButton("VIEW DETAILS");

    JTextArea jt1 = new JTextArea();
    JTextArea jt2 = new JTextArea();

    JLabel l1 = new JLabel("ENTER USERNAME");
    JLabel l2 = new JLabel("ENTER MONTH");

    JTextField t1 = new JTextField(20);
    JTextField t2 = new JTextField(20);

    JButton b3 = new JButton("SEARCH");

    Font f1 = new Font("Times New Roman", Font.BOLD, 15);

    public P5() {
        JFrame f = new JFrame("Customer Main page");
        f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
        f.setLayout(null);
        f.setVisible(true);
        f.setSize(800, 550);

        JLabel l1 = new JLabel("SELECT OPERATION TO PERFORM");
        l1.setBounds(450, 100, 300, 100);
        l1.setFont(f1);
        f.add(l1);
        // buttons to select whether customer wants to view last bill or view all bills
        // with personal details
        // b1 is to view last bill and b2 is to view all details
        b1.setBounds(475, 275, 200, 60);
        b1.addActionListener(this);
        f.add(b1);

        // try to insert background image in label
        ImageIcon image;
        try {
            image = new ImageIcon(getClass().getResource("cust.jpg"));

            JLabel l4 = new JLabel(image);

            l4.setBounds(0, 0, 400, 550);
            l4.setBackground(Color.CYAN);
            f.add(l4);

        } catch (Exception e) {
            System.out.println("Image not found..");
        }

    };

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            JFrame f = new JFrame("VIEW BILL");
            f.setVisible(true);
            f.setSize(800, 550);
            f.setLayout(null);

            l1.setBounds(150, 100, 150, 50);
            t1.setBounds(350, 100, 200, 50);

            l2.setBounds(150, 200, 150, 50);
            t2.setBounds(350, 200, 200, 50);
            // search button b3 to implement request of data
            b3.setBounds(450, 400, 100, 50);

            Font Font1 = new Font("Times New Roman", Font.BOLD, 15);
            f.add(l1);
            f.add(t1);

            f.add(l2);
            f.add(t2);

            f.add(b3);

            b3.addActionListener(this);
        }
        ;
        if (e.getSource() == b3) {
            JFrame f = new JFrame("BILL DETAILS");
            f.setVisible(true);
            f.setSize(800, 550);
            f.setLayout(null);

        }
        ;
    }

}
