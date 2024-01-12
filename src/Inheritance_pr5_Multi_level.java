class Addition
{
    void sum()
    {
        int a = 8, b = 2;
        int sum = a + b;
        System.out.println("sum of a and b is: " + sum);
    }
}

class subtraction extends Addition
{
    void sub()
    {
        int a = 8, b = 2;
        int sub = a - b;
        System.out.println("sub of a and b is: " + sub);
    }
}

class multiplication extends subtraction
{
    void multi()
    {
        int a = 8, b = 2;
        int multi = a * b;
        System.out.println("multi of a and b is: " + multi);
    }
}

class division extends multiplication
{
    void divi()
    {
        int a = 8, b = 2;
        int divi = a / b;
        System.out.println("divi of a and b is: " + divi);
    }
}

public class Inheritance_pr5_Multi_level
{
    public static void main(String[] args)
    {
//        System.out.println("Enter value of a");
//        System.out.println("Enter value of b");
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();

        division ds = new division();
        ds.sum();
        ds.sub();
        ds.multi();
        ds.divi();
    }
}

