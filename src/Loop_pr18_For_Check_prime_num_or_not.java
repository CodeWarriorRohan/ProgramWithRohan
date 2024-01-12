import java.util.Scanner;
public class Loop_pr18_For_Check_prime_num_or_not
{
    public static void main(String[] args)
    {
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to check prime or not");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++)
        {
            if(n%i==0)
            {
                count = count + 1;
                i = i + 1;
            }
        }
        if (count == 2)
        {
            System.out.println("Number is prime");
        }
        else
        {
            System.out.println("Number is not prime");
        }
    }
}

