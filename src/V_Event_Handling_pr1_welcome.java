import java.awt.*;
import java.awt.event.*;

public class V_Event_Handling_pr1_welcome extends Frame implements ActionListener
{
    TextField tf;
    Button b ;

    V_Event_Handling_pr1_welcome()
    {
        tf = new TextField();
        tf.setBounds(100,100,60,30);
        b = new Button("Click!");
        b.setBounds(100,180,60,30);
        b.addActionListener(this);
        add(tf);
        add(b);
        setLayout(null);
        setSize(500,500);
        setVisible(true);
    }
//    Frame f = new Frame();


    @Override
    public void actionPerformed(ActionEvent e)
    {
        tf.setText("Welcome");
    }

    public static void main(String[] args)
    {
        new V_Event_Handling_pr1_welcome();
    }
}
