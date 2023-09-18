import javax.swing.JFrame;
import javax.swing.*;

public class customerf {

    public static void main(String[] args) {
        P5 obj = new P5();

    }

}

class P5 extends JFrame {
    public P5() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setVisible(true);
        this.setSize(800, 800);

        JLabel l1 = new JLabel("SELECT OPERATION TO PERFORM");
        l1.setBounds(200, 100, 300, 100);
        add(l1);

        JButton b1 = new JButton("VIEW BILL");
        b1.setBounds(200, 200, 150, 100);
        add(b1);

        JButton b2 = new JButton("VIEW ALL BILL DETAILS");
        b2.setBounds(200, 400, 150, 100);
        add(b2);

    }

}
