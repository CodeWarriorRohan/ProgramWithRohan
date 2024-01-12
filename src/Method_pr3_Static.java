import java.util.Scanner;

public class Method_pr3_Static
{
    public static void main(String[] args)
    {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        Find_odd_even(num);
    }

    public static void Find_odd_even(int num)
    {
        if(num%2==0)
        {
            System.out.println(num +" is a even number");
        }
        else
        {
            System.out.println(num +" is a odd number");
        }
    }
}

