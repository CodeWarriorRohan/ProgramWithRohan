import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class V_AWT_pr22_KeyListener extends Frame
{
    public static void main(String[] args)
    {
        new MyKeyEvent();
    }
}

class MyKeyEvent extends Frame
{
    TextField tf1;
    MyKeyEvent()
    {
        setSize(500,500);
        setVisible(true);
        setLayout(new FlowLayout());

        tf1 = new TextField(20);
        add(tf1);
        tf1.addKeyListener(new KeyListener() {
            @Override
            public void keyPressed(KeyEvent e) {
            //  to get pressed key
//                System.out.println("Key Pressed -> "+e.getKeyChar());
            //  to get pressed keycode
//                System.out.println("Key Pressed -> "+e.getKeyCode());

                System.out.println(e.getKeyCode() == KeyEvent.VK_R);

            }

            @Override
            public void keyTyped(KeyEvent e) {
            //  to get typed key
//                System.out.println("Key Typed -> "+e.getKeyChar());
            //  to get typed keycode
                System.out.println("Key typed -> "+e.getKeyCode());

            }

            @Override
            public void keyReleased(KeyEvent e) {
            //  to get released key
//                System.out.println("Key Released -> "+e.getKeyChar());
            //  to get released keycode
                System.out.println("Key released -> "+e.getKeyCode());

            }
        });
    }
}

