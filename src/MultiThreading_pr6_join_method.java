class Threading2 extends Thread
{
    public void run()
    {
        String name = Thread.currentThread().getName();
        for (int i=1;i<=3;i++)
        {
            System.out.println(name);
        }
    }
}

public class MultiThreading_pr6_join_method
{
    public static void main(String[] args)
    {
        Threading2 t1 = new Threading2();
        Threading2 t2 = new Threading2();
        Threading2 t3 = new Threading2();

        t1.setName("Thread1");
        t2.setName("Thread2");
        t3.setName("Thread3");


        t3.start();
        try
        {
            t3.join();  // This method executes thread also before main thread
        }
        catch (InterruptedException e)
        {
            System.out.println(e);
        }
        t1.start();
        t2.start();

        String name = Thread.currentThread().getName();
        for (int i=1;i<=3;i++)
        {
            System.out.println(name);
        }

    }
}
