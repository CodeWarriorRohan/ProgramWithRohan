import javax.swing.*;

public class W_Swing_pr3_Extends extends JFrame
{
    W_Swing_pr3_Extends()
    {
        JButton b = new JButton("Hello");
        b.setBounds(100,100,80,40);

        add(b);
        setLayout(null);
        setSize(500,500);
        setVisible(true);

    }
    public static void main(String[] args)
    {
        new W_Swing_pr3_Extends();

    }
}
