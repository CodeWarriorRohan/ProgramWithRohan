import java.awt.*;
import java.awt.event.*;
public class V_Event_Handling_pr2_add extends Frame implements ActionListener
{
    Frame f = new Frame("Addition of two numbers");
    TextField tf1;
    TextField tf2;
    TextField tf3;
    Button b;
    V_Event_Handling_pr2_add()
    {
        Label l1 = new Label("First number");
        l1.setBounds(20,50,85,30);
        tf1 = new TextField();
        tf1.setBounds(120, 50, 85, 30);
        Label l2 = new Label("Second number");
        l2.setBounds(20,100,90,30);
        tf2 = new TextField();
        tf2.setBounds(120, 100, 85, 30);
        Label l3 = new Label("The Sum is");
        l3.setBounds(20,150,85,30);
        tf3 = new TextField();
        tf3.setBounds(120, 150, 85, 30);
        b = new Button("Add");
        b.setBounds(120,200,85,30);
        f.add(b);
        f.add(tf1);
        f.add(tf2);
        f.add(tf3);
        f.add(l1);
        f.add(l2);
        f.add(l3);

        f.setLayout(null);
        f.setSize(500,500);
        f.setVisible(true);


        b.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e)
    {
        int a = Integer.parseInt(tf1.getText());
        int b = Integer.parseInt(tf2.getText());

        int c = a + b;
        tf3.setText(String.valueOf(c));
    }

    public static void main(String []args)
    {
        new V_Event_Handling_pr2_add();
    }
}