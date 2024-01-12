import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class V_AWT_pr17_ContainerClass_Dialog extends Frame
{
    Button b = new Button("Login");
    Label l1;
    Label l2;
    TextField tf1;
    TextField tf2;

    V_AWT_pr17_ContainerClass_Dialog()
    {
        setSize(400,400);
        setVisible(true);
        setLayout(null);

        l1 = new Label("Email Id");
        l1.setBounds(50,50,90,30);
        l2 = new Label("Password");
        l2.setBounds(50,100,90,30);
        tf1 = new TextField();
        tf1.setBounds(120,50,120,30);
        tf2 = new TextField();
        tf2.setBounds(120,100,120,30);
        b.setBounds(90,150,70,30);

        add(tf1);
        add(tf2);
        add(l1);
        add(l2);
        add(b);

        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Dialog d = new Dialog(V_AWT_pr17_ContainerClass_Dialog.this);
                d.setSize(300,300);
                d.setVisible(true);
                d.setLayout(new FlowLayout());
                Label l3 = new Label("Login Successful");
                Label email = new Label("Your Email Id is "+tf1.getText());
                Label pass = new Label("Your password is "+tf2.getText());

                d.add(email);
                d.add(pass);
                d.add(l3);

            }
        });

    }

    public static void main(String[] args)
    {
        new V_AWT_pr17_ContainerClass_Dialog();
    }
}
