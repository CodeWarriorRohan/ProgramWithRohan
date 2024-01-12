import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class V_AWT_pr21_KeyListener
{
    public static void main(String[] args)
    {
        new MyKeyListener();
    }

}


class MyKeyListener extends Frame
{
    TextField tf1;
    MyKeyListener()
    {
        setSize(500,500);
        setVisible(true);
        setLayout(new FlowLayout());

        tf1 = new TextField(20);
        add(tf1);
        tf1.addKeyListener(new KeyListener() {
            @Override
            public void keyPressed(KeyEvent e) {
                System.out.println("Key Pressed");
            }

            @Override
            public void keyTyped(KeyEvent e) {
                System.out.println("Key Typed");
            }

            @Override
            public void keyReleased(KeyEvent e) {
                System.out.println("Key Released");
            }
        });
    }
}
