import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class V_AWT_pr11_Choice
{
    public static void main(String[] args)
    {
        new MyFrameChoice();
    }
}

class MyFrameChoice extends Frame
{
    Choice ch;
    MyFrameChoice()
    {
        setSize(500,500);
        setVisible(true);
        setLayout(new GridLayout(2,1));

        ch = new Choice();
        ch.add("Maths");
        ch.add("English");
        ch.add("Hindi");
        ch.add("Science");

        Button b = new Button("Show");

        add(ch);
        add(b);

        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s = ch.getSelectedItem();
                System.out.println("Selected subject is :"+s);
            }
        });

    }
}
