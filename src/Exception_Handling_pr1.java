public class Exception_Handling_pr1
{
    public static void main(String[] args)
    {
        int a = 10, b = 0, c;
        try
        {
            c = a / b;
            System.out.println(c);
        }
        catch (ArithmeticException e)
        {
            System.out.println(e);
            System.out.println("Can't devide by zero!");
        }
        System.out.println("Arithmetic Exception occurs!");
    }
}