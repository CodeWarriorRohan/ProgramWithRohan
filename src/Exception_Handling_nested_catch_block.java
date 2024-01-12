public class Exception_Handling_nested_catch_block
{
    public static void main(String[] args)
    {
        try
        {
            System.out.println(10/0);
        }
        catch (ArithmeticException a)
        {
            System.out.println(a);

            try
            {
                String str = null;
                System.out.println(str.toUpperCase());
            }
            catch (NullPointerException n)
            {
                System.out.println(n);
                System.out.println("null value can't be converted!");
            }
        }
        System.out.println("main method ended");
    }
}
