import java.util.Scanner;

public class If_else_pr6_Vote2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = sc.nextInt();

        if(age >= 18 && age < 60)
        {
            System.out.println("You are eligible for vote!");
        }
        else if(age > 60 && age <= 85)
        {
            System.out.println("You are not eligible for vote!");
        }
        else
        {
            System.out.println("Not found!");
        }

    }
}
