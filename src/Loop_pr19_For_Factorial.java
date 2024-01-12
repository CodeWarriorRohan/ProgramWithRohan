import java.util.Scanner;

public class Loop_pr19_For_Factorial
{
    public static void main(String[] args)
    {
        int Fact = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number whose factorial you want");
        int n = sc.nextInt();

        for(int i = n; i>= 1; i--)
        {
//            Fact = Fact * n;
//            n = n-1;
            Fact = Fact * i;
        }
        System.out.println(Fact);
    }
}

