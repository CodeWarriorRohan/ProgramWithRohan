import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class V_AWT_pr12_List extends Frame
{
    public static void main(String[] args)
    {
        new V_AWT_pr12_List();
    }

    V_AWT_pr12_List()
    {
        setSize(500,500);
        setVisible(true);
        setLayout(new FlowLayout());

        List l = new List(7,true);

        l.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Action on list");

                // Double click on the items of list
            }
        });
        l.add("Java");
        l.add("Python");
        l.add("Kotlin");
        l.add("CSS");
        l.add("HTML");
        l.add("JS");
        l.add("C++");
        Button b = new Button("Show");

        add(l);
        add(b);

        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            //  For getting single item and index
                //String s = l.getSelectedItem();
                //int i = l.getSelectedIndex();

                //System.out.println(i+ " --> "+s);

            //  For getting more than one items and indexes

                String[] items = l.getItems();
                int[] indexes = l.getSelectedIndexes();

                for (int x : indexes)
                {
                    System.out.println(x);
                }

                for (String y : items)
                {
                    System.out.println(y);
                }
            }
        });
    }
}
