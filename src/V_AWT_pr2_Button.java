import java.awt.*;
public class V_AWT_pr2_Button
{
    public static void main(String[] args)
    {
        Frame f = new Frame();
        Label l = new Label();
        Button b = new Button("Click here!");
        b.setBounds(30,100,80,30);
        f.add(b);
        f.add(l);
        f.setSize(500,500);
        f.setLayout(null);
        f.setVisible(true);
        f.setLocation(450,100);
        f.setBackground(Color.MAGENTA);
        System.out.println(f);

//        W_AWT_pr2_Button awt = new W_AWT_pr2_Button();
    }
}

