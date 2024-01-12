import java.awt.*;
public class V_Layout_Manager_pr5_BorderLayout extends Frame
{
    Panel NORTH;
    Panel SOUTH;
    Panel EAST;
    Panel WEST;
    Panel CENTER;
    V_Layout_Manager_pr5_BorderLayout()
    {
        Frame f = new Frame("Layout Manager");
        f.setLayout(new BorderLayout(30,20));
        NORTH = new Panel();
        SOUTH = new Panel();
        EAST = new Panel();
        WEST = new Panel();
        CENTER = new Panel();
        NORTH.setBackground(Color.CYAN);
        SOUTH.setBackground(Color.RED);
        EAST.setBackground(Color.BLUE);
        WEST.setBackground(Color.PINK);
        CENTER.setBackground(Color.BLACK);
        f.add(NORTH,BorderLayout.NORTH);
        f.add(SOUTH,BorderLayout.SOUTH);
        f.add(EAST,BorderLayout.EAST);
        f.add(WEST,BorderLayout.WEST);
        f.add(CENTER,BorderLayout.CENTER);
        f.setSize(500,500);
        f.setVisible(true);
        f.setLayout(null);
    }
    public static void main(String[] args)
    {
        V_Layout_Manager_pr5_BorderLayout l = new V_Layout_Manager_pr5_BorderLayout();
    }
}
