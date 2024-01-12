public class Exception_Handling_pr6_nested_try_block
{
    public static void main(String[] args)
    {
        try
        {
            try
            {
                int a[] = {32,45,12,29,22};
                System.out.println(a[6]);
            }
            catch (ArrayIndexOutOfBoundsException a)
            {
                System.out.println(a);
            }

            System.out.println(10/0);
        }
        catch (ArithmeticException e)
        {
            System.out.println(e);
        }
        System.out.println("main method ended!");
    }
}
