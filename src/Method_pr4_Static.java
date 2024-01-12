import java.util.Scanner;

public class Method_pr4_Static
{
    public static void main(String[] args)
    {
        System.out.println("Enter number whose Factorial you want");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println("Factorial of given number is:");
        Factorial(num);
    }

    public static void Factorial(int n)
    {
        int Fact = 1;
        for(int i = n; i >= 1; i--)
        {
            Fact = Fact*i;
        }
        System.out.println(Fact);
    }
}

