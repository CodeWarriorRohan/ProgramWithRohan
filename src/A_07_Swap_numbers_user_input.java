import java.util.Scanner;

public class A_07_Swap_numbers_user_input
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter value of a");
        int a = sc.nextInt();
        System.out.println("Enter value of b");
        int b = sc.nextInt();
        int temp;
        temp = a;
        a = b;
        System.out.println("After swapping:");
        System.out.println("The value of a is:");
        System.out.println(a);
        b = temp;
        System.out.println("The value of b is:");
        System.out.println(b);


    }
}
