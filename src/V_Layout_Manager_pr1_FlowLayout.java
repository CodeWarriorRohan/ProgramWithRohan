import java.awt.*;
import java.awt.TextField;
public class V_Layout_Manager_pr1_FlowLayout
{
    Frame f = new Frame();
    TextField tf1;
    TextField tf2;
    TextField tf3;
    TextField tf4;
    TextField tf5;

    V_Layout_Manager_pr1_FlowLayout()
    {
        tf1 = new TextField("This is Example");
        tf2 = new TextField("This is Example 2");
        tf3 = new TextField("This is Example 3");
        tf4 = new TextField("This is Example 4");
        tf5 = new TextField("This is Example 5");

        f.setSize(400,400);
        f.setVisible(true);
        f.setLayout(new FlowLayout());

        f.add(tf1);
        f.add(tf2);
        f.add(tf3);
        f.add(tf4);
        f.add(tf5);
    }
    public static void main(String[] args)
    {
        new V_Layout_Manager_pr1_FlowLayout();
    }

}
