import javax.swing.*;
import java.awt.*;
import java.awt.BorderLayout;

public class W_Swing_pr10_JScrollPane extends JFrame
{
    W_Swing_pr10_JScrollPane()
    {
        this.setSize(500,500);

        this.setLayout(new FlowLayout());

        JTextArea ta = new JTextArea(20,40);
        JScrollPane jp = new JScrollPane(ta);

        jp.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        jp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

        this.getContentPane().add(jp);
        this.setVisible(true);
    }

    public static void main(String[] args)
    {
        new W_Swing_pr10_JScrollPane();
    }
}
