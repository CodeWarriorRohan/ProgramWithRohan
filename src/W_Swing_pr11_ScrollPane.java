import javax.swing.*;
import java.awt.*;
import java.awt.BorderLayout;

public class W_Swing_pr11_ScrollPane extends JFrame
{

    W_Swing_pr11_ScrollPane()
    {
        setSize(700,700);
        setVisible(true);
        this.setLayout(new FlowLayout());

        JPanel jp = new JPanel();
        jp.setLayout(new GridLayout(15,1));
        jp.setPreferredSize(new Dimension(600,800));
        jp.add(new TextField("Enter name"));
        jp.add(new TextField("Enter Email"));
        jp.add(new TextField("Enter password"));
        jp.add(new TextField("Enter Mobile number"));
        jp.add(new TextField("Enter Date of Birth"));
        jp.add(new TextField("Enter Gender"));
        jp.add(new TextField("Enter Roll number"));
        jp.add(new TextField("Enter Enrollment number"));
        jp.add(new TextField("Enter Address"));
        jp.add(new TextField("Enter Father name"));
        jp.add(new TextField("Enter Mother name"));
        jp.add(new TextField("Enter 10th roll number"));
        jp.add(new TextField("Enter 12th roll number"));
        jp.add(new TextField("Enter 10th Board"));
        jp.add(new TextField("Enter 12th Board"));


//        jp.add(new Button("Submit"));
//        jp.add(new Button("Edit"));
//        jp.add(new Button("Delete"));

        JScrollPane jsp = new JScrollPane(jp);

        add(jp, BorderLayout.CENTER);
        jp.setBackground(Color.RED);

        jsp.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        jsp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

        this.getContentPane().add(jp);
        this.setVisible(true);

    }

    public static void main(String[] args)
    {
        new W_Swing_pr11_ScrollPane();
    }

}
