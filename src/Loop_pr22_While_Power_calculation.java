import java.util.Scanner;

public class Loop_pr22_While_Power_calculation
{
    public static void main(String[] args)
    {
        int x, y, pro = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter base value");
        x = sc.nextInt();
        System.out.println("Enter power value");
        y = sc.nextInt();

        while(y>0)
        {
            pro = pro * x;
            y--;
        }
        System.out.println("x ^ y is = " + pro);
    }
}

