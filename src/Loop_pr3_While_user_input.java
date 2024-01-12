import java.util.Scanner;

public class Loop_pr3_While_user_input
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number whose table you want");
        int num = sc.nextInt();
        int i = 1, table;
        while(i <= 10)
        {
            table = i*num;
            System.out.println(table);
            i++;
        }

    }
}

