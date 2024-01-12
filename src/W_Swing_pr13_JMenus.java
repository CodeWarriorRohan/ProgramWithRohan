//import javax.swing.*;
//import java.awt.*;
//import java.awt.Menu.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.awt.event.KeyEvent;
//
//public class W_Swing_pr13_JMenu extends JFrame
//{
//    JMenuBar mb = new JMenuBar();
//    JMenu file = new JMenu("file");
//    JMenu edit = new JMenu("edit");
//    JMenu help = new JMenu("help");
//    JMenu view = new JMenu("view");
//    JMenu search = new JMenu("search");
//    JMenuItem Open, Close,Save,SaveAs,OpenRecent,Exit;
//
//    W_Swing_pr13_JMenu() {
////        mb = new MenuBar();
//        mb.add(file);
//        mb.add(edit);
//        mb.add(search);
//        mb.add(view);
//        mb.add(help);
//
//        Open = new JMenuItem("Open");
//        OpenRecent = new JMenuItem("OpenRecent");
//        Close = new JMenuItem("Close");
//        Save = new JMenuItem("Save");
//        SaveAs = new JMenuItem("SaveAs");
//        Exit = new JMenuItem("Exit");
////                , new MenuShortcut(KeyEvent.VK_X));
//
//        file.add(Open);
//        file.add(OpenRecent);
//        file.add(Save);
//        file.add(SaveAs);
//        file.add(Close);
//        file.add(Exit);
//
//        setSize(500, 500);
//        setVisible(true);
//        setLayout(null);
//
//        setJMenuBar(mb);
//
//        ActionListener al = new MyMenu();
//        Open.addActionListener(al);
//        OpenRecent.addActionListener(al);
//        Save.addActionListener(al);
//        SaveAs.addActionListener(al);
//        Close.addActionListener(al);
//        Exit.addActionListener(al);
//
//    }
//
//    public static void main(String[] args)
//    {
//        new W_Swing_pr13_JMenu();
//    }
//
//}
//
//class MyMenu implements ActionListener
//{
//    @Override
//    public void actionPerformed(ActionEvent e) {
//        System.out.println(e.getSource());
//        MenuItem i = (MenuItem)(e.getSource());
//
//        if(i.getLabel().equals("Open"))
//        {
//            System.out.println("You Clicked Open");
//
//        }
//        else if (i.getLabel().equals("OpenRecent"))
//        {
//            System.out.println("You Clicked OpenRecent");
//        }
//        else if (i.getLabel().equals("Sava"))
//        {
//            System.out.println("You Clicked Save");
//        }
//        else if (i.getLabel().equals("SaveAs"))
//        {
//            System.out.println("You Clicked SaveAs");
//        }
//        else if (i.getLabel().equals("Close"))
//        {
//            System.out.println("You Clicked Close");
//        }
//        else if (i.getLabel().equals("Exit"))
//        {
//            System.out.println("You Clicked Exit");
//            System.exit(0);
//        }
//
//    }
//}
//
