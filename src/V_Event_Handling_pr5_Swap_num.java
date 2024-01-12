import java.awt.*;
import java.awt.event.*;
//import java.awt.event.ActionListener;

public class V_Event_Handling_pr5_Swap_num extends Frame implements ActionListener
{
    Frame f = new Frame("Swap two numbers");
    TextField tf1;
    TextField tf2;

    Button b = new Button("Swap");

    V_Event_Handling_pr5_Swap_num()
    {
        tf1 = new TextField();
        tf1.setBounds(150,120,70,30);
        tf2 = new TextField();
        tf2.setBounds(150,160,70,30);

        b.setBounds(150,200,70,30);

        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);

        f.add(tf1);
        f.add(tf2);
        f.add(b);

        b.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e)
    {
        String s1 = tf1.getText();
        String s2 = tf2.getText();

        tf2.setText(s1);
        tf1.setText(s2);

//        int a = Integer.parseInt(s1);
//
//        int b = Integer.parseInt(s2);
//
//        int temp = a;
//        a = b;
//        b = a;

    }

    public static void main(String[] args)
    {
        V_Event_Handling_pr5_Swap_num ab = new V_Event_Handling_pr5_Swap_num();

    }

}
