import java.awt.*;
import java.awt.event.*;
public class V_Event_Handling_pr3_large_num extends Frame implements ActionListener
{

    Frame f = new Frame("Check largest number");
    TextField t1;
    TextField t2;
    TextField t3;

//    TextField t4;

    Button b = new Button("Click");
//    Button b1 = new Button("add");

    V_Event_Handling_pr3_large_num()
    {
        t1 = new TextField();
        t2 = new TextField();
        t3 = new TextField();

        Label l1 = new Label("First number");
        l1.setBounds(50,50,85,30);
        t1.setBounds(150, 50, 85, 30);
        Label l2 = new Label("Second number");
        l2.setBounds(50,100,90,30);
        t2.setBounds(150, 100, 85, 30);
        Label l3 = new Label("Large num is");
        l3.setBounds(50,150,85,30);
        t3.setBounds(150, 150, 85, 30);
        b.setBounds(400, 400, 85, 30);

        f.add(b);
        f.add(t1);
        f.add(t2);
        f.add(t3);
        f.add(l1);
        f.add(l2);
        f.add(l3);
        f.setSize(500, 500);
        f.setLayout(null);
        f.setVisible(true);
        b.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e)
    {
        String s1 = t1.getText();
        String s2 = t2.getText();

        int a = Integer.parseInt(s1);

        int b = Integer.parseInt(s2);

        if (a > b)
        {
            String s3 = String.valueOf(a);
            t3.setText(s3);
        }
        else
        {

            String s = String.valueOf(b);
            t3.setText(s);
        }
    }
    public static void main(String  args[])
    {
        V_Event_Handling_pr3_large_num ab = new V_Event_Handling_pr3_large_num();
    }
}

