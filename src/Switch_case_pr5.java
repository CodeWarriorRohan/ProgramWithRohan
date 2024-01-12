import java.util.Scanner;

public class Switch_case_pr5
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 for Addition");
        System.out.println("Enter 2 for Subtraction");
        System.out.println("Enter 3 for Division");
        System.out.println("Enter 4 for Multiplication");

        System.out.println("Enter your choice!");
        int ch = sc.nextInt();

        System.out.println("Enter value of a");
        int a = sc.nextInt();

        System.out.println("Enter value of b");
        int b = sc.nextInt();

        switch (ch)
        {
            case 1:
                int Addition = a+b;
                System.out.println("Addition is: " + Addition);
                break;

            case 2:
                int Subtraction = a-b;
                System.out.println("Subtraction is: " + Subtraction);
                break;

            case 3:
                int Multiplication = a*b;
                System.out.println("Multiplication is: " + Multiplication);
                break;

            case 4:
                int Division = a/b;
                System.out.println("Division is: " + Division);
                break;
        }
    }
}

