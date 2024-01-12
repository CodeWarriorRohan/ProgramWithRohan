import java.awt.*;

public class V_AWT_pr4_TextField
{
    public static void main(String[] args)
    {
        Frame f = new Frame("My frame");
        Label l = new Label("Enter Name");
        l.setBounds(20,90,130,30);

        TextField tf = new TextField();
        tf.setBounds(20,120,130,30);

        Button b = new Button("Submitted");
        b.setBounds(120,220,130,30);

        f.add(l);
        f.add(tf);
        f.add(b);

        f.setSize(300,300);
        f.setLayout(null);
        f.setVisible(true);

    }
}
