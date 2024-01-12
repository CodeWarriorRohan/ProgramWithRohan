import java.awt.*;
import java.awt.event.*;

public class V_AWT_pr20_ScrollPane extends Frame
{
    Panel p;
    ScrollPane sp;

    public static void main(String[] args)
    {
        new V_AWT_pr20_ScrollPane();
    }

    V_AWT_pr20_ScrollPane()
    {
        setSize(300,400);
        setVisible(true);
        setLayout(new BorderLayout());

        p = new Panel();
        p.setPreferredSize(new Dimension(300,800));
        sp = new ScrollPane();
        sp.add(p);

        p.add(new Button("Save"));
        p.add(new Button("Close"));
        p.add(new Button("Update"));

        p.add(new TextField("Enter Name",20));
        p.add(new TextField("Father Name",20));
        p.add(new TextField("Age",20));
        p.add(new TextField("Contact",20));
        p.add(new TextField("Subject1",20));
        p.add(new TextField("Subject2",20));
        p.add(new TextField("Subject3",20));
        p.add(new TextField("Subject4",20));
        p.add(new TextField("Subject5",20));
        p.add(new TextField("Subject6",20));


        p.setBackground(Color.cyan);
        add(sp);

    }
}