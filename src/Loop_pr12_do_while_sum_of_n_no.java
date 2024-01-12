import java.util.Scanner;

public class Loop_pr12_do_while_sum_of_n_no
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter term of natural numbers:");
        int num = sc.nextInt();
        int i = 1, sum = 0;
        do
        {
            sum = sum+i;
            ++i;
        }
        while(i<=num);
        System.out.println(sum);

    }
}

