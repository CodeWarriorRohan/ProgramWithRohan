import java.util.Scanner;

public class Loop_pr11_do_while_user_input
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number whose table you want");
        int num = sc.nextInt();
        int i = 1,table;
        do
        {
            table = num*i;
            System.out.println(table);
            i++;
        }
        while(i<=10);

    }
}

