import java.awt.*;
import java.awt.event.*;
public class V_Event_Handling_pr4_add_and_large_num extends Frame implements ActionListener
{
    Frame f = new Frame("Addition and Check Largest numbers");
    TextField tf1;
    TextField tf2;
    TextField tf3;
    TextField tf4;
    Button b1 = new Button("Add");
    Button b2 = new Button("Largest number");

    V_Event_Handling_pr4_add_and_large_num()
    {
        Label l1 = new Label("First number");
        l1.setBounds(50,150,90,40);
        tf1 = new TextField();
        tf1.setBounds(200,150,90,40);
        Label l2 = new Label("Second number");
        l2.setBounds(50,200,90,40);
        tf2 = new TextField();
        tf2.setBounds(200,200,90,40);
        Label l3 = new Label("The Sum is");
        l3.setBounds(50,250,100,40);
        tf3 = new TextField();
        tf3.setBounds(200,250,90,40);
        Label l4 = new Label("Large num is");
        l4.setBounds(50,300,100,40);
        tf4 = new TextField();
        tf4.setBounds(200,300,90,40);

        b1.setBounds(400,400,90,40);
        b2.setBounds(400,450,90,40);

        f.add(b1);
        f.add(b2);
        f.add(tf1);
        f.add(tf2);
        f.add(tf3);
        f.add(tf4);
        f.add(l1);
        f.add(l2);
        f.add(l3);
        f.add(l4);

        f.setLayout(null);
        f.setVisible(true);
        f.setSize(600,600);

        b1.addActionListener(this);
        b2.addActionListener(this);
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
        else
        {
            if (a > b)
            {
                String s4 = String.valueOf(a);
                tf4.setText(s4);
            }
            else
            {
                String s = String.valueOf(b);
                tf4.setText(s);
            }
        }
    }

    public static void main(String[] args)
    {
        V_Event_Handling_pr4_add_and_large_num eh = new V_Event_Handling_pr4_add_and_large_num();
    }
}
