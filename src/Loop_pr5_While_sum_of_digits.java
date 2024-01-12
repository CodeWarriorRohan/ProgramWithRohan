import java.util.Scanner;

public class Loop_pr5_While_sum_of_digits
{
    public static void main(String[] args)
    {
        int sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Digit");
        int n = sc.nextInt();

        while(n>0)
        {
            sum = sum + (n%10);
            n = n/10;
        }
        System.out.println("sum of digits is: " + sum);
    }
}

