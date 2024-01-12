import java.awt.*;
import java.awt.event.*;
public class V_AWT_pr9_CheckBox extends Frame
{
//    Frame f = new Frame();
    Checkbox c1, c2, c3, c4;
    Label msg;
    Button ok;

    public static void main(String[] args)
    {
        V_AWT_pr9_CheckBox ch =  new V_AWT_pr9_CheckBox();
        ch.addWindowListener(new MyWindowListener());

//      // MyWindowListener --> use from other program
    }

    private void init()
    {
        c1 = new Checkbox("Java");
        c2 = new Checkbox("CSS");
        c3 = new Checkbox("HTML");
        c4 = new Checkbox("Kotlin");

        msg = new Label("Select any language");
        ok = new Button("Ok");

        ok.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Ok button clicked");

                System.out.println(c1.getLabel()+ " --> "+ c1.getState());
                System.out.println(c2.getLabel()+ " --> "+ c2.getState());
                System.out.println(c3.getLabel()+ " --> "+ c3.getState());
                System.out.println(c4.getLabel()+ " --> "+ c4.getState());

            }
        });
    }
//    public void actionPerformed(ActionEvent e)
//    {
//        System.out.println("Ok button clicked");
//    }
    V_AWT_pr9_CheckBox()
    {
        setSize(500,500);
        setVisible(true);
        setLocation(200,100);

        init();
        setLayout(new GridLayout(6,1,10,10));



        add(msg);
        add(c1);
        add(c2);
        add(c3);
        add(c4);
        add(ok);
    }

}
