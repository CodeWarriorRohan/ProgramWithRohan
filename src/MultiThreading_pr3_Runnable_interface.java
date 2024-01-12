class Threading implements Runnable
{
    public void run()
    {
        for (int i = 1; i <= 5; i++)
        {
            System.out.println("It is Runnable interface thread!");
        }
    }
}

public class MultiThreading_pr3_Runnable_interface
{
    public static void main(String[] args)
    {
        Threading t = new Threading();
        Thread m = new Thread(t);
        m.start();

        for (int i = 1; i <= 5; i++)
        {
            System.out.println("It is main thread!");
        }

    }
}
