import java.awt.*;
import java.awt.Menu.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class V_AWT_pr15_Nested_MenuBar extends Frame
{
    MenuBar mb = new MenuBar();
    Menu menu1 = new Menu("menu1");
    Menu menu2 = new Menu("menu2");
    Menu menu3 = new Menu("menu3");
    Menu menu4 = new Menu("menu4");
    Menu menu5 = new Menu("menu5");
    MenuItem item1, item2, item3, item4, item5, item6, item7, item8, item9, item10;

    V_AWT_pr15_Nested_MenuBar() {

        mb.add(menu1);
        mb.add(menu2);
        mb.add(menu3);
        mb.add(menu4);
        mb.add(menu5);

        item1 = new MenuItem("item1");
        item2 = new MenuItem("item2");
        item3 = new MenuItem("item3");
        item4 = new MenuItem("item4");
        item5 = new MenuItem("item5");
        item6 = new MenuItem("item6");
        item7 = new MenuItem("item7");
        item8 = new MenuItem("item8");
        item9 = new MenuItem("item9");
        item10 = new MenuItem("item10");

        menu1.add(item1);
        menu1.add(item2);
        menu1.add(item3);
        menu2.add(item4);
        menu2.add(item5);
        menu2.add(item6);

        menu1.add(menu2);

        menu3.add(item7);
        menu3.add(item8);
        menu3.add(item9);

        menu5.add(item10);
        menu5.add(menu3);


        setSize(500, 500);
        setVisible(true);
        setLayout(null);

        setMenuBar(mb);
    }
    public static void main(String[] args)
    {
        V_AWT_pr15_Nested_MenuBar br = new V_AWT_pr15_Nested_MenuBar();
    }
}
