import java.awt.*;

class MyFrame extends Frame
{
    Frame f = new Frame();
    MyFrame()
    {

        TextField tf1 = new TextField("This is Text field1");
        TextField tf2 = new TextField("This is Text field2");
        TextField tf3 = new TextField("This is Text field3");
        TextField tf4 = new TextField("This is Text field4");

        FlowLayout fl = new FlowLayout(FlowLayout.LEFT,20,20);
        setLayout(fl);

        add(tf1);
        add(tf2);
        add(tf3);
        add(tf4);

        setVisible(true);
        setSize(500,400);
        setLocation(100,50);

    }
}

public class V_Layout_Manager_pr2_FlpwLayout
{

    public static void main(String[] args)
    {
        new MyFrame();
    }
}
