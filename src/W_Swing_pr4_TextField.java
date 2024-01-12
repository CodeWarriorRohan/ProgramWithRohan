import javax.swing.*;

public class W_Swing_pr4_TextField
{
    JFrame f = new JFrame("My TextField");

    JTextField tf1;
    JTextField tf2;
    JTextField tf3;

    JButton b1;
    JButton b2;

    W_Swing_pr4_TextField()
    {
        tf1 = new JTextField();
        tf1.setBounds(170,100,80,30);

        tf2 = new JTextField();
        tf2.setBounds(170,140,80,30);

        tf3 = new JTextField();
        tf3.setBounds(170,180,80,30);

        b1 = new JButton("Submitted");
        b1.setBounds(120,220,80,30);

        b2 = new JButton("Edit");
        b2.setBounds(210,220,80,30);

        f.add(tf1);
        f.add(tf2);
        f.add(tf3);
        f.add(b1);
        f.add(b2);

        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);

        f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new W_Swing_pr4_TextField();
    }

}
