public class A_04_Operators
{
    public static void main(String[] args)
    {
        int a = 48, b = 2, c = 8;

//    1.Arithmetic operator

        System.out.println("1.Sum, Sub, Multi and Division of two numbers:");
        int sum = a+b;
        System.out.println("Sum of a and b is: " + sum);
        int sub = a-b;
        System.out.println("Sub of a and b is: " + sub);
        int multi = a*b;
        System.out.println("Multi of a and b is: " + multi);
        int divi = a/b;
        System.out.println("Divi of a and b is: " + divi);
        System.out.println("\n");

//    2.Logical operators

        System.out.println("2.Print true or false:");
        System.out.println(a>b && a>c);
        System.out.println(b<a & a<b);

//    3.Shift operators

        System.out.println("3.Right shift and Left shift:");
        System.out.println(a << b);
        System.out.println(c << b);
        System.out.println(a >> b);
        System.out.println(c >> b);

//    4.Unary operators

        System.out.println("4.Increment and Decrement:");
        System.out.println(a);
        System.out.println(++a);
        System.out.println(b);
        System.out.println(--b);

//    5.Ternary operators

        System.out.println("5.Print multiple conditions:");
        int lum = (a>b)?(a>c?a:c):(b>c?b:c);
        System.out.println(lum);
    }
}
