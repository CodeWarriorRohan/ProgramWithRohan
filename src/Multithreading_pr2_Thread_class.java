import java.util.Scanner;

class thread extends Thread
{
    public void run()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number a");
        int a = sc.nextInt();
        System.out.println("Enter number b");
        int b = sc.nextInt();
        int c = a+b;
        System.out.println("sum of a and b is: "+c);
    }
}

public class Multithreading_pr2_Thread_class
{
    public static void main(String[] args)
    {
        thread t = new thread();
        t.start();
    }
}
