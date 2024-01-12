import javax.swing.*;
import java.awt.*;

public class W_Swing_pr8_JRadioButton extends JFrame
{
    JRadioButton jrb1;
    JRadioButton jrb2;
    JRadioButton jrb3;
    JRadioButton jrb4;
    JRadioButton jrb5;
    JRadioButton jrb6;
    W_Swing_pr8_JRadioButton()
    {
        setSize(600,500);
        setVisible(true);
        setLayout(null);

        JLabel l1 = new JLabel("Select Gender");
        l1.setBounds(30,50,90,30);
        jrb1 = new JRadioButton("Male");
        jrb1.setBounds(130,50,90,30);
        jrb2 = new JRadioButton("Female");
        jrb2.setBounds(230,50,90,30);

        JLabel l2 = new JLabel("Select Caste");
        l2.setBounds(30,100,90,30);
        jrb3 = new JRadioButton("General");
        jrb3.setBounds(130,100,90,30);
        jrb4 = new JRadioButton("SC");
        jrb4.setBounds(230,100,90,30);
        jrb5 = new JRadioButton("ST");
        jrb5.setBounds(330,100,90,30);
        jrb6 = new JRadioButton("OBC");
        jrb6.setBounds(430,100,90,30);


        add(jrb1);
        add(jrb2);
        add(l1);
        add(jrb3);
        add(jrb4);
        add(jrb5);
        add(jrb6);
        add(l2);

        ButtonGroup gender = new ButtonGroup();
        gender.add(jrb1);
        gender.add(jrb2);

        ButtonGroup caste = new ButtonGroup();
        caste.add(jrb3);
        caste.add(jrb4);
        caste.add(jrb5);
        caste.add(jrb6);
    }

    public static void main(String[] args) {
        new W_Swing_pr8_JRadioButton();
    }

}
