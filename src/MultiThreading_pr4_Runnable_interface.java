import java.util.Scanner;

class Voting implements Runnable
{
    public void run()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = sc.nextInt();

        if(age >= 18)
        {
            System.out.println("You are eligible for vote!");
        }
        else
        {
            System.out.println("You are eligible for vote!");
        }
    }
}

public class MultiThreading_pr4_Runnable_interface
{
    public static void main(String[] args)
    {
        Voting v = new Voting();
        Thread t = new Thread(v);
        t.start();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any year");
        int year = sc.nextInt();

        if(year % 4 == 0)
        {
            System.out.println(year + " is a leap year!");
        }
        else
        {
            System.out.println(year + " is not a leap year!");
        }
    }

}
