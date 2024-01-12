import java.util.Scanner;

public class A_10_Sum_of_Natural_nums
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();

        int sum = n*(n+1)/2;
        System.out.println(sum);

    }
}
