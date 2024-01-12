import java.util.Scanner;

public class Loop_pr4_While_sum_of_n_no
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter terms of natural numbers:");
        int num = sc.nextInt();
        int i = 1, sum = 0;
        while(i<=num)
        {
            sum = sum+i;
            ++i;
        }
        System.out.println(sum);
    }
}

