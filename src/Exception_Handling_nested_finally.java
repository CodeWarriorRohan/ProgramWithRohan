public class Exception_Handling_nested_finally
{
    public static void main(String[] args)
    {
        try
        {
            String str = "rohan";
            System.out.println(str.toUpperCase());
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        finally
        {
            try
            {
                System.out.println(10/0);
            }
            catch (ArithmeticException a)
            {
                System.out.println(a);
            }
            finally
            {
                System.out.println("Finally block executes exception occurs or not!");
            }
        }
        System.out.println("main method ended!");
    }
}
