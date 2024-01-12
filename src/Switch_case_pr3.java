import java.util.Scanner;

public class Switch_case_pr3
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = sc.nextInt();

        switch(age)
        {
            case 7:
                System.out.println("You are Child!");
                break;

            case 14:
                System.out.println("You are Teenager!");
                break;

            case 21:
                System.out.println("You are young man!");
                break;

            case 60:
                System.out.println("You are old man");
                break;

        }
    }
}

