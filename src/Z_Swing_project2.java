import javax.swing.*;
import java.awt.event.*;

public class Z_Swing_project2 extends JFrame implements ActionListener
{
    JFrame f = new JFrame("Students Information Form");
    JTextField tf1;
    JTextField tf2;
    JTextField tf3;
    JTextField tf4;
    JTextField tf5;
    JTextField tf6;
    JTextField tf7;
    JTextField tf8;
    JTextField tf9;
    JTextField tf10;

    JTextField tf11;
    JTextField tf12;
    JTextField tf13;
    JTextField tf14;

    JButton b1 = new JButton("Back");
    JButton b2 = new JButton("Submitted");

    Z_Swing_project2()
    {
        JLabel jl = new JLabel();
        jl.setSize(400,100);

        JScrollBar jb = new JScrollBar();
        jb.setBounds(760,0,20,800);

        JLabel l0 = new JLabel("Students Information Form");
        l0.setBounds(300,10,300,50);
        JLabel l1 = new JLabel("Enrolment number");
        l1.setBounds(50,100,200,30);
        tf1 = new JTextField();
        tf1.setBounds(200,100,200,30);
        JLabel l2 = new JLabel("Roll number");
        l2.setBounds(50,150,200,30);
        tf2 = new JTextField();
        tf2.setBounds(200,150,200,30);
        JLabel l3 = new JLabel("First Name");
        l3.setBounds(50,200,200,30);
        tf3 = new JTextField();
        tf3.setBounds(200,200,200,30);
        JLabel l4 = new JLabel("Middle Name");
        l4.setBounds(50,250,200,30);
        tf4 = new JTextField();
        tf4.setBounds(200,250,200,30);
        JLabel l5 = new JLabel("Last Name");
        l5.setBounds(50,300,200,30);
        tf5 = new JTextField();
        tf5.setBounds(200,300,200,30);
        JLabel l6 = new JLabel("Email Address");
        l6.setBounds(50,350,200,30);
        tf6 = new JTextField();
        tf6.setBounds(200,350,200,30);
        JLabel l7 = new JLabel("Date Of Birth");
        l7.setBounds(50,400,200,30);
        tf7 = new JTextField();
        tf7.setBounds(200,400,200,30);
        JLabel l8 = new JLabel("Contact Number");
        l8.setBounds(50,450,200,30);
        tf8 = new JTextField();
        tf8.setBounds(200,450,200,30);
        JLabel l9 = new JLabel("Gender");
        l9.setBounds(50,500,200,30);
        tf9 = new JTextField();
        tf9.setBounds(200,500,200,30);
        JLabel l10 = new JLabel("Address");
        l10.setBounds(50,550,200,30);
        tf10 = new JTextField();
        tf10.setBounds(200,550,200,30);

        JLabel l11 = new JLabel("Father's Name");
        l11.setBounds(50,600,200,30);
        tf11 = new JTextField();
        tf11.setBounds(200,600,200,30);
        JLabel l12 = new JLabel("Mother's Name");
        l12.setBounds(50,650,200,30);
        tf12 = new JTextField();
        tf12.setBounds(200,650,200,30);
        JLabel l13 = new JLabel("Father's Contact");
        l13.setBounds(50,700,200,30);
        tf13 = new JTextField();
        tf13.setBounds(200,700,200,30);
        JLabel l14 = new JLabel("Address");
        l14.setBounds(50,750,200,30);
        tf14 = new JTextField();
        tf14.setBounds(200,750,200,30);

//        b1.setBounds(20,600,200,30);
//        b2.setBounds(300,600,200,30);

        f.add(tf1);
        f.add(tf2);
        f.add(tf3);
        f.add(tf4);
        f.add(tf5);
        f.add(tf6);
        f.add(tf7);
        f.add(tf8);
        f.add(tf9);
        f.add(tf10);
        f.add(tf11);
        f.add(tf12);
        f.add(tf13);
        f.add(tf14);
        f.add(l0);
        f.add(l1);
        f.add(l2);
        f.add(l3);
        f.add(l4);
        f.add(l5);
        f.add(l6);
        f.add(l7);
        f.add(l8);
        f.add(l9);
        f.add(l10);
        f.add(l11);
        f.add(l12);
        f.add(l13);
        f.add(l14);
        f.add(b1);
        f.add(b2);
        f.add(jb);
        f.add(jl);

        f.setSize(800,800);
        f.setLayout(null);
        f.setVisible(true);

        b1.addActionListener(this);
        b2.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == b1)
        {
            String s = tf1.getText();
            tf1.setText("");
        }
        if(e.getSource() == b2)
        {

        }
    }

    public static void main(String[] args)
    {
        new Z_Swing_project2();
    }

}
