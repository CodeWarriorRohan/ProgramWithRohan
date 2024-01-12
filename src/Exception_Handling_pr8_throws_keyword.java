public class Exception_Handling_pr8_throws_keyword
{
    public static void main(String[] args) throws InterruptedException
    {
        for (int i = 1; i <= 10; i++)
        {
            System.out.println(i);
            Thread.sleep(1000);   // It is a Thread class method (sleep) which will print the output after a second one by one
        }


        //  Second type


        for(int i = 1; i <= 10; i++)
        {
            try
            {
                System.out.println(i);
                Thread.sleep(1000);   // It is a Thread class method (sleep) which will print the output after a second one by one
            }
            catch (InterruptedException e)
            {
                System.out.println(e);
            }
        }
    }
}
