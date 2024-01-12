import javax.swing.*;

public class W_Swing_pr6_Student_Form
{
    public static void main(String[] args)
    {
        JFrame f = new JFrame();
        JLabel l1 = new JLabel("First Name");
        l1.setBounds(20,50,80,20);

        JLabel l2 = new JLabel("Last Name");
        l2.setBounds(20,80,80,20);

        JLabel db = new JLabel("Date of Birth");
        db.setBounds(20,110,80,20);

        JTextField tf1 = new JTextField();
        tf1.setBounds(120,50,100,20);

        JTextField tf2 = new JTextField();
        tf2.setBounds(120,80,100,20);

        JTextField tfdb = new JTextField();
        tfdb.setBounds(120,110,100,20);

        JButton b1 = new JButton("Back");
        b1.setBounds(20,160,100,30);

        JButton b2 = new JButton("Submit");
        b2.setBounds(120,160,100,30);

        f.add(l1);
        f.add(l2);
        f.add(db);
        f.add(tf1);
        f.add(tf2);
        f.add(tfdb);
        f.add(b1);
        f.add(b2);

        f.setSize(300,300);
        f.setLayout(null);
        f.setVisible(true);
    }
}

