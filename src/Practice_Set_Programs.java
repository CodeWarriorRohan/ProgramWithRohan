import javax.imageio.stream.ImageInputStream;
import java.awt.*;

//import java.util.ArrayList;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import java.awt.event.ActionListener;
//
//public class Practice_Set_Programs extends Frame implements ActionListener
//{
//    Frame f = new Frame("Addition");
//    TextField tf1;
//    TextField tf2;
//    TextField tf3;
//    Button b;
//
//    Practice_Set_Programs()
//    {
//        f.setSize(500,500);
//        f.setVisible(true);
//        f.setLayout(null);
//        tf1 = new TextField();
//        tf1.setBounds(200,50,80,40);
//        tf2 = new TextField();
//        tf2.setBounds(200,140,80,40);
//        tf3 = new TextField();
//        tf3.setBounds(200,230,80,40);
//        b = new Button("Add");
//        b.setBounds(200,310,80,40);
//
//        f.add(tf1);
//        f.add(tf2);
//        f.add(tf3);
//        f.add(b);
//        b.addActionListener(this);
//    }
//    public void actionPerformed(ActionEvent e)
//    {
//        int a = Integer.parseInt(tf1.getText());
//        int b = Integer.parseInt(tf2.getText());
//
//        int c = a+b;
//        tf3.setText(String.valueOf(c));
//
//    }
//
//    public static void main(String[] args)
//    {
//        Practice_Set_Programs pr = new Practice_Set_Programs();
//    }




//}
//{
//
//    public static void main(String[] args)
//    {
//        ArrayList<String> str = new ArrayList<>();
//        str.add("Rohan");
//        str.add("Deepak");
//        str.add("Tilak");
//        str.add("Rajat");
//        str.add("Prince");
//        System.out.println(str);
//
//    }
//    public static void main(String[] args) {
//        try
//        {
//            int a = 12;
//            int b = 0;
//            int c = a/b;
//            System.out.println(c);
//        }
//        catch (ArithmeticException e)
//        {
//            System.out.println(e);
//            System.out.println("can't divide by zero!");
//        }
//        System.out.println("Arithmetic Exception occurs!");
//    }
//}

//import java.util.Scanner;

//class Adder
//{
//    void show()
//    {
//        System.out.println("It is a parent class!");
//    }
//}
//class Minus extends Adder
//{
//    void display()
//    {
//        System.out.println("It is child class!");
//    }
//}

//import java.util.Scanner;
//
//class Additioner
//{
//    void sum()
//    {
//        int a = 12;
//        int b = 4;
//        int sum = a+b;
//        System.out.println("sum is "+sum);
//    }
//}
//class Subtraction extends Additioner
//{
//    void sub()
//    {
//        int a = 12;
//        int b = 4;
//        int sub = a-b;
//        System.out.println("sub is "+sub);
//    }
//
//}
//class Division extends Subtraction
//{
//    void divi()
//    {
//        int a = 12;
//        int b = 4;
//        int divi = a/b;
//        System.out.println("divi is "+divi);
//    }
//}
//class Multiplication extends Division
//{
//    void multi()
//    {
//        int a = 12;
//        int b = 4;
//        int multi = a*b;
//        System.out.println("multi is "+multi);
//    }
//}


//interface Abc
//{
//    void Cash();
//}
//class Xyz implements Abc
//{
//    public void Cash()
//    {
//        System.out.println("I do business only in cash!");
//    }
//}

//interface Interface_1
//{
//    void add();
//}
//class Example implements Interface_1
//{
//    public void add()
//    {
//        int a = 12;
//        int b = 8;
//        int c = a+b;
//        System.out.println(c);
//    }
//
//}
//public class Practice_Set_Programs
//{
//    public static void main(String[] args)
//    {
//        Interface_1 ir = new Example();
//        ir.add();
//
////        Abc ab = new Xyz();
////        ab.Cash();
//    }
//}
//    public static void main(String[] args)
//    {
//        Multiplication mp = new Multiplication();
//        mp.sum();
//        mp.sub();
//        mp.divi();
//        mp.multi();
//        Minus ms = new Minus();
//        ms.show();
//        ms.display();
//    }


//    1.
//    public static void main(String[] args)
//    {
//        Method_1();
//        Method_2();
//    }
//
//    static void Method_1()
//    {
//        System.out.println("This is method 1");
//    }
//    static void Method_2()
//    {
//        System.out.println("This is method 2");
//    }

//     2.
//     public static void main(String[] args)
//     {
//         System.out.println("Please enter something");
//         Scanner sc = new Scanner(System.in);
//         String s1 = sc.nextLine();
//         Sentence(s1);
//     }
//
//     static void Sentence(String s1)
//     {
//         System.out.println(s1);
//     }
//     public static void main(String[] args)
//     {
//         System.out.println("Enter num");
////         System.out.println("Enter num2");
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();
////         int b = sc.nextInt();
//         OddEven(num);
//     }
//
//     static void OddEven(int num)
//     {
//         if (num % 2 == 0)
//         {
//             System.out.println(num +" is a even num");
//         }
//         else
//         {
//             System.out.println(num +" is a odd num");
//         }
//     }

//

//    3.

//    public static void main(String[] args)
//    {
////        System.out.println("Enter text");
//        Practice_Set_Programs ab = new Practice_Set_Programs();
//        ab.Sentence();
//    }
//
//    public void Sentence()
//    {
//        System.out.println("Welcome my friend");
//    }

//    4.

//    public static void main(String[] args) {
//
//        System.out.println("Enter num whose factorial you want");
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        Practice_Set_Programs pr = new Practice_Set_Programs();
//        pr.Factorial(num);
//
//    }
//
//    public void Factorial(int num)
//    {
//        int fact = 1;
//        for(int i = num; i >= 1; i--)
//        {
//            fact = fact*i;
//        }
//        System.out.println(fact);
//    }

//    Practice_Set_Programs(int a, int b)
//    {
//        System.out.println("Constructor is created!");
//        int sum = a+b;
//        System.out.println("sum of a and b is "+sum);
//    }
//
//    public static void main(String[] args)
//    {
//        System.out.println("Enter value of a ");
//        System.out.println("Enter value of b ");
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        Practice_Set_Programs pr = new Practice_Set_Programs(a,b);
//
//    }

//    Practice_Set_Programs(int a, int b)
//    {
//        int sum = a+b;
//        System.out.println("sum of a and b is "+sum);
//    }
//
//    public static void main(String[] args)
//    {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a");
//        int a = sc.nextInt();
//        System.out.println("Enter b");
//        int b = sc.nextInt();
//        Practice_Set_Programs pr = new Practice_Set_Programs(a,b);
//    }
//}


//public class Practice_Set_Programs extends Frame implements ActionListener
//{
//    Frame f = new Frame("Addition");
//    TextField tf1;
//    TextField tf2;
//    TextField tf3;
//
//    Button b;
//
//    Practice_Set_Programs()
//    {
//        Label l1 = new Label("First number");
//        l1.setBounds(100,50,80,30);
//        tf1 = new TextField();
//        tf1.setBounds(200,50,80,30);
//        Label l2 = new Label("Second number");
//        l2.setBounds(100,140,80,30);
//        tf2 = new TextField();
//        tf2.setBounds(200,140,80,30);
//        Label l3 = new Label("Addition is");
//        l3.setBounds(100,230,80,30);
//        tf3 = new TextField();
//        tf3.setBounds(200,230,80,30);
//
//        b = new Button("Add");
//        b.setBounds(200,320,80,30);
//
//        f.add(tf1);
//        f.add(tf2);
//        f.add(tf3);
//        f.add(l1);
//        f.add(l2);
//        f.add(l3);
//        f.add(b);
//
//        f.setSize(500,500);
//        f.setLayout(null);
//        f.setVisible(true);
//
//        b.addActionListener(this);
//    }
//
//    public void actionPerformed(ActionEvent e)
//    {
//        int a = Integer.parseInt(tf1.getText());
//        int b = Integer.parseInt(tf2.getText());
//        int c = a+b;
//        tf3.setText(String.valueOf(c));
//    }
//
//    public static void main(String[] args) {
//        Practice_Set_Programs p = new Practice_Set_Programs();
//    }
//}

public class Practice_Set_Programs extends Frame implements ActionListener
{
    Frame f = new Frame();
    TextField tf1;
    TextField tf2;
    TextField tf3;
    TextField tf4;

    Button b1 = new Button("add");
    Button b2 = new Button("large");

    Practice_Set_Programs()
    {
        Label l1 = new Label("First number");
        l1.setBounds(100,80,80,30);
        tf1 = new TextField();
        tf1.setBounds(200,80,80,30);
        Label l2 = new Label("Second number");
        l2.setBounds(100,130,80,30);
        tf2 = new TextField();
        tf2.setBounds(200,130,80,30);
        Label l3 = new Label("Large num is");
        l3.setBounds(100,180,80,30);
        tf3 = new TextField();
        tf3.setBounds(200,180,80,30);
        Label l4 = new Label("Addition is");
        l4.setBounds(100,180,80,30);
        tf4 = new TextField();
        tf4.setBounds(200,180,80,30);

        b1.setBounds(200,230,80,30);
        b2.setBounds(200,300,80,30);

        f.add(tf1);
        f.add(tf2);
        f.add(tf3);
        f.add(tf4);
        f.add(l1);
        f.add(l2);
        f.add(l3);
        f.add(l4);
        f.add(b1);
        f.add(b2);

        f.setSize(500,500);
        f.setVisible(true);
        f.setLayout(null);

        b1.addActionListener(this);
        b2.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == b1)
        {
            int a = Integer.parseInt(tf1.getText());
            int b = Integer.parseInt(tf2.getText());

            int c = a+b;
            tf3.setText(String.valueOf(c));
        }
        else
        {
            String s1 = tf1.getText();
            String s2 = tf2.getText();

            int a = Integer.parseInt(s1);
            int b = Integer.parseInt(s2);

            if(a >b)
            {
                String s3 = String.valueOf(a);
                tf3.setText(s3);
            }
            else
            {
                String s4 = String.valueOf(b);
                tf4.setText(s4);
            }
        }
    }

    public static void main(String[] args) {
        new Practice_Set_Programs();
    }
}





















