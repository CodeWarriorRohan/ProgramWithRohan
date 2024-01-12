import java.awt.*;
import java.awt.Menu.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class V_AWT_pr14_MenuBar extends Frame
{
    MenuBar mb = new MenuBar();
    Menu file = new Menu("file");
    Menu edit = new Menu("edit");
    Menu help = new Menu("help");
    Menu view = new Menu("view");
    Menu search = new Menu("search");
    MenuItem Open, Close,Save,SaveAs,OpenRecent,Exit;

    V_AWT_pr14_MenuBar() {
//        mb = new MenuBar();
        mb.add(file);
        mb.add(edit);
        mb.add(search);
        mb.add(view);
        mb.add(help);

        Open = new MenuItem("Open");
        OpenRecent = new MenuItem("OpenRecent");
        Close = new MenuItem("Close");
        Save = new MenuItem("Save");
        SaveAs = new MenuItem("SaveAs");
        Exit = new MenuItem("Exit" , new MenuShortcut(KeyEvent.VK_X));

        file.add(Open);
        file.add(OpenRecent);
        file.add(Save);
        file.add(SaveAs);
        file.add(Close);
        file.add(Exit);

        setSize(500, 500);
        setVisible(true);
        setLayout(null);

        setMenuBar(mb);

        ActionListener al = new MyMenu();
        Open.addActionListener(al);
        OpenRecent.addActionListener(al);
        Save.addActionListener(al);
        SaveAs.addActionListener(al);
        Close.addActionListener(al);
        Exit.addActionListener(al);

    }

    public static void main(String[] args)
    {
       V_AWT_pr14_MenuBar br = new V_AWT_pr14_MenuBar();
    }

}

class MyMenu implements ActionListener
{
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(e.getSource());
        MenuItem i = (MenuItem)(e.getSource());

        if(i.getLabel().equals("Open"))
        {
            System.out.println("You Clicked Open");

        }
        else if (i.getLabel().equals("OpenRecent"))
        {
            System.out.println("You Clicked OpenRecent");
        }
        else if (i.getLabel().equals("Sava"))
        {
            System.out.println("You Clicked Save");
        }
        else if (i.getLabel().equals("SaveAs"))
        {
            System.out.println("You Clicked SaveAs");
        }
        else if (i.getLabel().equals("Close"))
        {
            System.out.println("You Clicked Close");
        }
        else if (i.getLabel().equals("Exit"))
        {
            System.out.println("You Clicked Exit");
            System.exit(0);
        }

    }
}
