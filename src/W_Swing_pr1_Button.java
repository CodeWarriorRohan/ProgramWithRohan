import javax.swing.*;
public class W_Swing_pr1_Button
{
    public static void main(String[] args)
    {
        JFrame f = new JFrame("Swing program");
        JButton b = new JButton("Click");
        b.setBounds(100,80,80,30);

        f.add(b);
        f.setLayout(null);
        f.setSize(400,400);
        f.setVisible(true);
        f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
    }
}
