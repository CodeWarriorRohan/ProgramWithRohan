import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class V_AWT_pr13_TextArea
{
    public static void main(String[] args)
    {
        new MyTextArea();
    }
}

class MyTextArea extends Frame
{
    TextArea ta;
    MyTextArea()
    {
        setSize(500,500);
        setVisible(true);
        setLocation(200,100);

        setLayout(new FlowLayout());
//        setLayout(new BorderLayout());

        ta = new TextArea();
        Button b1 = new Button("Show");

        add(ta);
        add(b1);
//        add(b,BorderLayout.SOUTH);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                  ta.append("Hello Friend.....\n");
                String s = ta.getText();
                System.out.println(s);
            }
        });

    }

}
