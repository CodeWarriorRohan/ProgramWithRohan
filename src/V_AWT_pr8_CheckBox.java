import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;


public class V_AWT_pr8_CheckBox extends Frame
{
//    Frame f  = new Frame("Check Box Example");

    V_AWT_pr8_CheckBox()
    {
        Checkbox c1 = new Checkbox("C++");
        c1.setBounds(100,100,50,50);
        Checkbox c2 = new Checkbox("Python");
        c2.setBounds(100,150,50,50);
        Checkbox c3 = new Checkbox("Java");
        c3.setBounds(100,200,50,50);
        Checkbox c4 = new Checkbox("CSS");
        c4.setBounds(100,250,50,50);

        add(c1);
        add(c2);
        add(c3);
        add(c4);

        setSize(500,500);
        setVisible(true);
        setLayout(null);
//        setLayout(new GridLayout(2,2));
    }

    public static void main(String[] args)
    {
        V_AWT_pr8_CheckBox ch = new V_AWT_pr8_CheckBox();
        ch.addWindowListener(new Window());
    }
}
class Window implements WindowListener
{
    public void windowOpened(WindowEvent e) {}
    public void windowClosed(WindowEvent e) {}
    public void windowIconified(WindowEvent e) {}
    public void windowDeiconified(WindowEvent e) {}
    public void windowActivated(WindowEvent e) {}
    public void windowDeactivated(WindowEvent e) {}
    public void windowClosing(WindowEvent e) {
        System.out.println("Window is closing");
        e.getWindow().dispose();
    }
}

