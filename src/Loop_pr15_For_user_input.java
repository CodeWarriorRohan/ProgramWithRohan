import java.util.Scanner;

public class Loop_pr15_For_user_input
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number whose table you want");
        int num = sc.nextInt();
        int table;
        for(int i = 1; i <= 10; i++)
        {
            table = num*i;
            System.out.println(table);
        }
    }
}
