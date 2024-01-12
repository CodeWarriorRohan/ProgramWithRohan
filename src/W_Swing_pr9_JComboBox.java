import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class W_Swing_pr9_JComboBox extends JFrame
{
    JFrame jf;
    JComboBox cb1;
    W_Swing_pr9_JComboBox()
    {
        jf = new JFrame();

        setSize(500,500);
        setVisible(true);
        setLocationRelativeTo(null);
        setLayout(null);

        String[] values = {"Hindi","English","Maths","Science"};
        cb1 = new JComboBox<>(values);
        cb1.setBounds(100,100,100,30);
        cb1.setEditable(true);
//        cb1.setFont(new Font("arial",Font.BOLD,20));

        JButton jb = new JButton("Ok");
        jb.setBounds(100,250,100,30);

        JLabel jl1 = new JLabel("Selected Subject is");
        jl1.setBounds(100,350,200,30);
        JLabel jl2 = new JLabel("");
        jl2.setBounds(350,350,200,30);

        add(cb1);
        add(jl1);
        add(jl2);
        add(jb);

        jb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String subject = (String)cb1.getSelectedItem();
                jl2.setText(subject);
            }
        });

    }


    public static void main(String[] args)
    {
        new W_Swing_pr9_JComboBox();
    }

}
