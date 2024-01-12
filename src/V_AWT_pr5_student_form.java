import java.awt.*;

public class V_AWT_pr5_student_form
{
    public static void main(String[] args)
    {
        Frame f = new Frame();
        Label l1 = new Label("First Name");
        l1.setBounds(20,50,80,20);

        Label l2 = new Label("Last Name");
        l2.setBounds(20,80,80,20);

        Label db = new Label("Date of Birth");
        db.setBounds(20,110,80,20);

        TextField tf1 = new TextField();
        tf1.setBounds(120,50,100,20);

        TextField tf2 = new TextField();
        tf2.setBounds(120,80,100,20);

        TextField tfdb = new TextField();
        tfdb.setBounds(120,110,100,20);

        Button b1 = new Button("Submit");
        b1.setBounds(20,160,100,30);

        Button b2 = new Button("Edit");
        b2.setBounds(120,160,100,30);

        f.add(l1);
        f.add(l2);
        f.add(db);
        f.add(tf1);
        f.add(tf2);
        f.add(tfdb);
        f.add(b1);
        f.add(b2);

        f.setSize(300,300);
        f.setLayout(null);
        f.setVisible(true);
    }
}
