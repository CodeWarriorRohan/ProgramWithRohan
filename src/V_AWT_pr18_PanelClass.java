import java.awt.*;

public class V_AWT_pr18_PanelClass extends Frame
{
    Panel p1, p2, p3, p4, p5;
    V_AWT_pr18_PanelClass()
    {
        setSize(700,700);
        setVisible(true);
        setLayout(new GridLayout(3,1));

        p1 = new Panel();
        p2 = new Panel();
        p3 = new Panel();
        p4 = new Panel();
        p5 = new Panel();

        p1.add(new Button("Save"));
        p1.add(new Button("Edit"));
        p1.add(new Button("Delete"));
        p2.add(new Button("Create"));
        p2.add(new Button("Update"));
        p2.add(new Button("Rename"));
        p3.add(new Button("Open"));
        p3.add(new Button("Close"));
        p3.add(new Button("File"));

        add(p1, BorderLayout.EAST);
        add(p2, BorderLayout.WEST);
        add(p3, BorderLayout.NORTH);
//        add(p4, BorderLayout.SOUTH);
//        add(p5, BorderLayout.CENTER);

        p1.setBackground(Color.CYAN);
//        p1.setPreferredSize(new Dimension(200,200));
        p2.setBackground(Color.PINK);
//        p2.setPreferredSize(new Dimension(200,200));
        p3.setBackground(Color.MAGENTA);
//        p3.setPreferredSize(new Dimension(200,200));
//        p4.setBackground(Color.BLUE);
//        p4.setPreferredSize(new Dimension(200,200));
//        p5.setBackground(Color.PINK);
//        p5.setPreferredSize(new Dimension(200,200));
    }

    public static void main(String[] args)
    {
        new V_AWT_pr18_PanelClass();
    }

}
