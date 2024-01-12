import java.awt.*;
public class V_AWT_pr3_Constructor
{
    public V_AWT_pr3_Constructor()
    {
        Frame f = new Frame("Hello friends");
        Label l = new Label();
        TextField tf = new TextField();
//        tf.setBackground(Color.PINK);
        tf.setBounds(20,120,130,30);


//        l.setBackground(Color.WHITE);
        l.setBounds(20,90,130,30);

        Button b = new Button("Hello!");
//        b.setBackground(Color.RED);
//        b.setForeground(Color.PINK);
        b.setBounds(20,40,80,30);

        f.add(tf);
        f.add(b);
        f.add(l);
        f.setSize(500,400);
        f.setVisible(true);
        f.setLayout(null);
//        f.setBackground(Color.BLUE);
    }

    public static void main(String[] args)
    {
        V_AWT_pr3_Constructor awt = new V_AWT_pr3_Constructor();

    }

}
