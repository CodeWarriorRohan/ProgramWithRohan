import java.util.Scanner;

public class If_else_pr2_Multiple_of_3
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int num = sc.nextInt();

        if(num % 3 == 0)
        {
            System.out.println("The number is multiple of 3");
        }
        else
        {
            System.out.println("The number is not multiple of 3");
        }

    }
}
