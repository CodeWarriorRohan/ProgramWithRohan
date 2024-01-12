//  Some Armstrong numbers are --> 153, 370, 371, 407, 1634, 8280, 9474, 54748.

import java.util.Scanner;

public class Loop_pr21_While_Armstrong_number
{
    public static void main(String[] args)
    {
        int n, z, count=0, i,digit, sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to check that is Armstrong or not");
        n = sc.nextInt();
        z = n;

        while(z > 0)
        {
            count = count + 1;
            z = z/10;
        }

        z = n;

        while(z > 0)
        {
            digit = z % 10;
            int pro = 1;
            for(i = 1; i <= count; i++)
            {
                pro = pro * digit;

            }
            sum = sum + pro;
            z = z / 10;
        }
        if(sum == n)
        {
            System.out.println(sum + " is a Armstrong number");
        }
        else
        {
            System.out.println(sum + " is Not a Armstrong number");
        }
    }
}

