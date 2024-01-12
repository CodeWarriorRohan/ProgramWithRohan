import java.util.Scanner;

public class If_else_pr1_Odd_Even_num
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a:");
        int a = sc.nextInt();

        if(a % 2 == 0)
        {
            System.out.println("The number is even");
        }
        else
        {
            System.out.println("The number is odd");
        }

    }
}
