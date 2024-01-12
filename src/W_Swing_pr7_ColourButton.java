import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class W_Swing_pr7_ColourButton extends JFrame
{

    public static Container c;
    JButton rb = new JButton("RED");
    JButton gb = new JButton("GREEN");
    JButton yb = new JButton("YELLOW");
    W_Swing_pr7_ColourButton()
    {
        JFrame f = new JFrame("Colour Changer");
        f.setSize(500, 500);
        f.setVisible(true);
        f.setLayout(null);

        c = f.getContentPane();

        rb.setBounds(100, 100, 80, 30);
        gb.setBounds(200, 100, 80, 30);
        yb.setBounds(300, 100, 90, 30);

        c.add(rb);
        c.add(gb);
        c.add(yb);

        rb.addActionListener(new RedColour());
        gb.addActionListener(new GreenColour());
        yb.addActionListener(new YellowColour());

    }

    public static void main(String[] args) {
        new W_Swing_pr7_ColourButton();
    }
}

class RedColour implements ActionListener
{
    @Override
    public void actionPerformed(ActionEvent e) {
        W_Swing_pr7_ColourButton.c.setBackground(Color.RED);
    }
}

class GreenColour implements ActionListener
{
    @Override
    public void actionPerformed(ActionEvent e) {
        W_Swing_pr7_ColourButton.c.setBackground(Color.GREEN);
    }
}

class YellowColour implements ActionListener
{
    @Override
    public void actionPerformed(ActionEvent e) {
        W_Swing_pr7_ColourButton.c.setBackground(Color.YELLOW);
    }
}
