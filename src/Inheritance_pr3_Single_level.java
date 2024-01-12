import java.util.Scanner;
class Add
{
    int a, b;
    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        a = sc.nextInt();
        System.out.println("Enter second number");
        b = sc.nextInt();
    }
    void add()
    {
        System.out.println("Addition = "+ (a+b));
    }
}

public class Inheritance_pr3_Single_level extends Add
{
    public static void main(String[] args)
    {
        Add ab = new Add();
        ab.input();
        ab.add();
    }
}
