import javax.swing.*;

public class W_Swing_pr2_Constructor
{
    JFrame f;
    W_Swing_pr2_Constructor()
    {
        f = new JFrame("Swing using Constructor");
        JButton b = new JButton("Click");
        b.setBounds(100,80,80,30);

        f.add(b);
        f.setLayout(null);
        f.setSize(400,400);
        f.setVisible(true);
//        f.setDefaultCloseOperation();
    }

    public static void main(String[] args) {
        W_Swing_pr2_Constructor sw = new W_Swing_pr2_Constructor();
    }
}
