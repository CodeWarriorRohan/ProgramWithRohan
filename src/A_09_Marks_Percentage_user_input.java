import java.util.Scanner;

public class A_09_Marks_Percentage_user_input
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your marks of Physics:");
        int Physics = sc.nextInt();
        System.out.println("Enter your marks of Chemistry:");
        int Chemistry = sc.nextInt();
        System.out.println("Enter your marks of maths:");
        int Maths = sc.nextInt();
        System.out.println("Enter your marks of Hindi:");
        int Hindi = sc.nextInt();
        System.out.println("Enter your marks of English:");
        int English = sc.nextInt();

        float percentage = ((Physics+Chemistry+Maths+Hindi+English)/500.0f)*100;
        System.out.println(percentage);

    }
}
