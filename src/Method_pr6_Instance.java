import java.util.Scanner;

public class Method_pr6_Instance
{
    public static void main(String[] args)
    {
        System.out.println("Enter value of a");
        System.out.println("Enter value of b");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        Method_pr6_Instance mc = new Method_pr6_Instance();
        System.out.println("sum of given two number is " + mc.add(a,b));
        System.out.println("sub of given two number is " + mc.sub(a,b));
        System.out.println("multi of given two number is " + mc.multi(a,b));
        System.out.println("divi of given two number is " + mc.divi(a,b));
    }
    int c;

    public int add(int a, int b)
    {
        c = a+b;
        return c;
    }

    public int sub(int a, int b)
    {
        c = a-b;
        return c;
    }

    public int multi(int a, int b)
    {
        c = a*b;
        return c;
    }

    public int divi(int a, int b)
    {
        c = a/b;
        return c;
    }
}

