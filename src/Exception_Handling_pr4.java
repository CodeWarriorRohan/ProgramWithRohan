public class Exception_Handling_pr4
{
    public static void main(String[] args)
    {
        try
        {
            System.out.println("Learn Coding");

            int a = 10, b = 0, c;
            c = a / b;
            System.out.println(c);
            System.out.println("Like share");
        }
        catch (ArithmeticException e)
        {
            System.out.println(e+" --> can't divide by zero!");
        }
        finally
        {
            System.out.println("please subscribe");
        }
        System.out.println("main method ended");
    }
}
