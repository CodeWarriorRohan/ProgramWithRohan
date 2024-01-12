import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class V_AWT_pr6_WindowListener extends Frame implements WindowListener
{
    V_AWT_pr6_WindowListener()
    {
        addWindowListener(this);

        setSize(500,500);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args)
    {
        new V_AWT_pr6_WindowListener();
    }

    public void windowActivated(WindowEvent e)
    {
        System.out.println("activated");
    }

    public void windowDeactivated(WindowEvent e)
    {
        System.out.println("deactivated");
    }

    public void windowIconified(WindowEvent e)
    {
        System.out.println("iconified");
    }

    public void windowDeiconified(WindowEvent e)
    {
        System.out.println("deiconified");
    }

    public void windowOpened(WindowEvent e)
    {
        System.out.println("opened");
    }

    public void windowClosed(WindowEvent e)
    {
        System.out.println("closed");
    }

    public void windowClosing(WindowEvent e) {
        System.out.println("Window is closing");
        e.getWindow().dispose();
    }

}
