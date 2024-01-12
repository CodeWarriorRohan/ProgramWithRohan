// Sum of even and product of odd digits

import java.util.Scanner;

public class Loop_pr6_While_sum_and_product_of_digits
{
    public static void main(String[] args)
    {
        int sum = 0, pro = 1, digit;
        System.out.println("Enter any Digit");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while(n>0)
        {
            digit = n%10;
            if(digit%2==0)
            {
                sum = sum + digit;
            }
            else
            {
                pro = pro * digit;
            }
            n = n /10;
        }
        System.out.println("sum of even digits is: " + sum);
        System.out.println("product of odd digits is: " + pro);

    }
}

