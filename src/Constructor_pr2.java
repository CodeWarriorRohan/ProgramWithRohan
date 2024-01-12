import java.util.Scanner;

public class Constructor_pr2
{
    Constructor_pr2(int a, int b)
    {
        int sum = a + b;
        System.out.println("sum of a+b is " + sum);
        int sub = a - b;
        System.out.println("sub of a-b is " + sub);
        int multi = a * b;
        System.out.println("multi of a*b is " + multi);
        int divi = a / b;
        System.out.println("divi of a/b is " + divi);
    }

    public static void main(String[] args)
    {
        System.out.println("Enter value of a");
        System.out.println("Enter value of b");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        Constructor_pr2 ob = new Constructor_pr2(a, b);
    }
}
