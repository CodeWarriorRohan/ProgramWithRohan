import java.awt.*;

public class V_Layout_Manager_pr6_GridLayout extends Frame
{
    Frame f = new Frame("Grid Layout");
//    TextField tf1;
//    TextField tf2;
//    TextField tf3;
//    TextField tf4;

    V_Layout_Manager_pr6_GridLayout()
    {
        f.setSize(500,500);
        f.setVisible(true);
//        f.setLayout(new GridLayout());
        f.setLayout(new GridLayout(4,2));
//        f.setLayout(new GridLayout(4,2,10,10));

        f.add(new Button("Add"));
        f.add(new Button("Sub"));
        f.add(new Button("Multi"));
        f.add(new Button("Divi"));
        f.add(new Button("Fact"));
        f.add(new Button("Pi"));
        f.add(new Button("Equal"));
        f.add(new Button("Back"));
    }
    public static void main(String[] args)
    {
        new V_Layout_Manager_pr6_GridLayout();
    }
}
