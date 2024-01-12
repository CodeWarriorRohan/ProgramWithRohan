import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class W_Swing_pr12_Regis_Form extends JFrame
{
    JComboBox cb1;
    JComboBox cb2;
    JComboBox cb3;
    W_Swing_pr12_Regis_Form()
    {
        setSize(800,700);
        setVisible(true);
        setLayout(null);
//        this.setBackground(Color.YELLOW);

        JLabel l1 = new JLabel("Registration Form");
        l1.setBounds(300,20,150,40);
        l1.setFont(new Font("arial",Font.BOLD,15));

        JLabel l2 = new JLabel("Name");
        l2.setBounds(20,100,50,20);

        TextField tf1 = new TextField();
        tf1.setBounds(150,100,150,30);

        JLabel l3 = new JLabel("Contact no.");
        l3.setBounds(20,150,100,20);

        TextField tf2 = new TextField();
        tf2.setBounds(150,150,150,30);

        JLabel l4 = new JLabel("Gender");
        l4.setBounds(20,200,50,20);

        JRadioButton b1 = new JRadioButton("Male");
        b1.setBounds(150,200,80,30);
        JRadioButton b2 = new JRadioButton("Female");
        b2.setBounds(250,200,80,30);

        ButtonGroup gender = new ButtonGroup();
        gender.add(b1);
        gender.add(b2);

        JLabel l5 = new JLabel("DOB");
        l5.setBounds(20,250,50,30);

        String[] day = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
        cb1 = new JComboBox<>(day);
        cb1.setBounds(150,250,60,30);

        String[] month = {"Jan","Fab","March","April","May","June","July","Aug","Sept","Octo","Nov","Dec"};
        cb2 = new JComboBox<>(month);
        cb2.setBounds(230,250,60,30);

        String[] year = {"2000","2001","2002","2003","2004","2005","2006","2007","2008","2009","2010","2011","2012","2013","2014","2015","2016","2017","2018","2019","2020","2021","2022","2023","2024","2025","2026","2027","2028","2029","2030"};
        cb3 = new JComboBox<>(year);
        cb3.setBounds(310,250,60,30);

        JLabel l6 = new JLabel("Address");
        l6.setBounds(20,300,100,30);

        JTextArea tr = new JTextArea();
        tr.setBounds(150,300,180,60);

        JCheckBox jc = new JCheckBox("Accepted all the terms and conditions");
        jc.setBounds(70,400,250,40);

        JButton b = new JButton("Submit");
        b.setBounds(130,450,90,30);

        JLabel l7 = new JLabel("");
        l7.setBounds(100,500,200,30);

        JLabel l8 = new JLabel("Input data");
        l8.setBounds(420,100,90,30);

        JTextArea tr2 = new JTextArea();
        tr2.setBounds(420,130,350,400);

        add(l1);
        add(l2);
        add(l3);
        add(tf1);
        add(tf2);
        add(l4);
        add(b1);
        add(b2);
        add(l5);
        add(cb1);
        add(cb2);
        add(cb3);
        add(l6);
        add(tr);
        add(jc);
        add(b);
        add(l7);
        add(l8);
        add(tr2);

        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(jc.isSelected())
                {
                    l7.setText("Registration Successful !!");

                    String name = tf1.getText();
                    String number = tf2.getText();
                    String gender = l4.getText();
                    if(b1.isSelected())
                    {
                        gender = "Male";
                    }
                    else
                    {
                        gender = "Female";
                    }
                    String dob = cb1.getSelectedItem()+"/"+cb2.getSelectedItem()+"/"+cb3.getSelectedItem();
                    String add = tr.getText();

                    tr2.setText("Name  : "+name+"\n"+"Contact number  : "+number+"\n"+"Gender  : "+gender+"\n"+"DOB  :" +dob+"\n"+"Address  : "+add);
                }

                else
                {
                    l7.setText("Please accept terms and conditions!");
                }
            }
        });
    }

    public static void main(String[] args)
    {
        new W_Swing_pr12_Regis_Form();
    }
}
