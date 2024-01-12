class Threading4 extends Thread
{
    public void run()
    {
        try
        {
            for (int i = 1; i <= 5; i++)
            {
                System.out.println("Thread is running!");
                Thread.sleep(1000);
            }
        }
        catch (InterruptedException e)
        {
            System.out.println("Thread is terminated!");
        }
    }
}
public class MultiThreading_pr11_interrupted_method
{
    public static void main(String[] args)
    {
        Threading4 t4 = new Threading4();
        t4.start();
        t4.interrupted();
    }
}
