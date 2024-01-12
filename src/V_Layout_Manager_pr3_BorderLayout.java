import java.awt.*;
public class V_Layout_Manager_pr3_BorderLayout extends Frame {
    V_Layout_Manager_pr3_BorderLayout()
    {
        Frame f = new Frame("Layout manager");
        Button b1 = new Button("North");
        Button b2 = new Button("East");
        Button b3 = new Button("West");
        Button b4 = new Button("South");
        Button b5 = new Button("Center");

        f.add(b1,BorderLayout.NORTH);
        f.add(b2,BorderLayout.EAST);
        f.add(b3,BorderLayout.WEST);
        f.add(b4,BorderLayout.SOUTH);
        f.add(b5,BorderLayout.CENTER);

        f.setSize(400,400);
        f.setVisible(true);

    }

    public static void main(String[] args) {
        V_Layout_Manager_pr3_BorderLayout l = new V_Layout_Manager_pr3_BorderLayout();
    }
}
