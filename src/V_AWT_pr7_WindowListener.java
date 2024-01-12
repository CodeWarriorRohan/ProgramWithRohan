import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class V_AWT_pr7_WindowListener extends Frame
{
    V_AWT_pr7_WindowListener()
    {
        setSize(500,500);
        setVisible(true);
        setLocation(200,100);
    }
    public static void main(String[] args)
    {
        V_AWT_pr7_WindowListener ch = new V_AWT_pr7_WindowListener();
        ch.addWindowListener(new MyWindowListener());

    }
}

class MyWindowListener implements WindowListener
{
    @Override
    public void windowActivated(WindowEvent e) {}
    public void windowDeactivated(WindowEvent e) {}
    public void windowOpened(WindowEvent e) {}
    public void windowIconified(WindowEvent e) {}
    public void windowDeiconified(WindowEvent e) {}
    public void windowClosed(WindowEvent e) {}
    public void windowClosing(WindowEvent e) {
        System.out.println("Window is closing");
        e.getWindow().dispose();
    }
}
