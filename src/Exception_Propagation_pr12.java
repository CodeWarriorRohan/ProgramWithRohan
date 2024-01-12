public class Exception_Propagation_pr12
{
    public static void main(String[] args)
    {
        try {
            m1();
        }
        catch (ArithmeticException a)
        {
            System.out.println("Exception Handled by main method!");
        }
    }
    public static void m1()
    {
       m2();

    }

    public static void m2()
    {
        System.out.println(10/0);
    }

}
