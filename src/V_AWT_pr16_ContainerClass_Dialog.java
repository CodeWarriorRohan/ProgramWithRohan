import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class V_AWT_pr16_ContainerClass_Dialog extends Frame
{
    public static void main(String[] args)
    {
        new V_AWT_pr16_ContainerClass_Dialog();
    }

    V_AWT_pr16_ContainerClass_Dialog()
    {
        setSize(500,500);
        setVisible(true);
        setLayout(new FlowLayout());

        Button b = new Button("Open Dialog");

        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Dialog d = new Dialog(V_AWT_pr16_ContainerClass_Dialog.this);
                d.setVisible(true);
                d.setSize(300,300);
            }
        });

        add(b);
    }
}
