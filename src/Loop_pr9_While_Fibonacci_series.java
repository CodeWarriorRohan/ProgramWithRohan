import java.util.Scanner;

public class Loop_pr9_While_Fibonacci_series
{
    public static void main(String[] args)
    {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter number under which you want fibonacci series");
//        int n = sc.nextInt();
//        int a=0, b=1, c=0;
//
//        while(c <= n)
//        {
//            System.out.print(" "+c);
//            a = b;
//            b = c;
//            c = a+b;
//        }


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of terms of fibonacci series");
        int n = sc.nextInt();
        int a=0, b=1, c=0, term=1;

        while(term <= n)
        {
            System.out.print(" "+c);
            a = b;
            b = c;
            c = a+b;
            term = term+1;
        }

    }
}

