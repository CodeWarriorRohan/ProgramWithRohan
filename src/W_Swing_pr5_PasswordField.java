import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class W_Swing_pr5_PasswordField extends JFrame implements ActionListener
{
    JTextField tf = new JTextField();
    JPasswordField jp = new JPasswordField();
    public static void main(String[] args)
    {
        new W_Swing_pr5_PasswordField();
    }
    W_Swing_pr5_PasswordField()
    {
        setSize(400,400);
        setVisible(true);
        setLayout(null);

        JLabel l1 = new JLabel("Email Id");
        l1.setBounds(50,50,90,30);
        tf.setBounds(150,50,150,30);
        JLabel l2 = new JLabel("Password");
        l2.setBounds(50,100,90,30);
        jp.setBounds(150,100,150,30);
        jp.setEchoChar('*');
        jp.setFont(new Font("Arial",Font.BOLD,20));
        JButton b = new JButton("Login");
        b.setBounds(140,200,80,30);

        add(l1);
        add(tf);
        add(l2);
        add(jp);
        add(b);

        b.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e)
    {
        System.out.println("Email Id :"+tf.getText());
        System.out.println("Password :"+jp.getText());
    }

}
