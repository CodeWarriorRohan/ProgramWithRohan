import java.util.Scanner;

public class Switch_case_pr4
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your subject");
        String subject = sc.nextLine();

        switch (subject)
        {
            case "maths":
                System.out.println("You have pass in maths");
                break;

            case "physics":
                System.out.println("Ypu have pass in physics");
                break;

            case "chemistry":
                System.out.println("You have pass in chemistry");
                break;
        }
    }
}

