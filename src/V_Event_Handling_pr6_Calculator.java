import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class V_Event_Handling_pr6_Calculator extends Frame implements ActionListener
{
    Frame f = new Frame("Calculator");
    TextField tf1;
    TextField tf2;
    TextField tf3;

    Button b1 = new Button("Add");
    Button b2 = new Button("Sub");
    Button b3 = new Button("Multi");
    Button b4 = new Button("Divi");

    V_Event_Handling_pr6_Calculator()
    {
        Label l1 = new Label("First number");
        l1.setBounds(100,120,90,40);
        tf1 = new TextField();
        tf1.setBounds(200,120,90,40);
        tf2 = new TextField();
        Label l2 = new Label("Second number");
        l2.setBounds(100,170,90,40);
        tf2.setBounds(200,170,90,40);
        tf3 = new TextField();
        Label l3 = new Label("Result");
        l3.setBounds(100,220,90,40);
        tf3.setBounds(200,220,90,40);

        b1.setBounds(30,300,90,40);
        b2.setBounds(140,300,90,40);
        b3.setBounds(250,300,90,40);
        b4.setBounds(360,300,90,40);

        f.setSize(500,500);
        f.setVisible(true);
        f.setLayout(null);

        f.add(tf1);
        f.add(tf2);
        f.add(tf3);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(l1);
        f.add(l2);
        f.add(l3);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e)
    {
        String s1 = tf1.getText();
        String s2 = tf2.getText();

        int a = Integer.parseInt(s1);

        int b = Integer.parseInt(s2);
        if(e.getSource() == b1)
        {
            int c = a + b;

            String s3 = String.valueOf(c);
            tf3.setText(s3);
        }

        if(e.getSource() == b2)
        {
            int c = a - b;

            String s3 = String.valueOf(c);
            tf3.setText(s3);
        }

        if(e.getSource() == b3)
        {
            int c = a * b;

            String s3 = String.valueOf(c);
            tf3.setText(s3);
        }

        if(e.getSource() == b4)
        {
            int c = a / b;

            String s3 = String.valueOf(c);
            tf3.setText(s3);
        }
    }

    public static void main(String[] args)
    {
        V_Event_Handling_pr6_Calculator ev = new V_Event_Handling_pr6_Calculator();

    }
}
