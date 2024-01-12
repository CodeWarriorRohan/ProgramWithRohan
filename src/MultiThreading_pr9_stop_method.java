class Thread3 extends Thread
{
    public void run()
    {
        String name = Thread.currentThread().getName();
        for (int i=1;i<=3;i++)
        {
            System.out.println(name);
            Thread.yield();
        }
    }
}

class Thread4 extends Thread
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

class Thread5 extends Thread
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

public class MultiThreading_pr9_stop_method
{
    public static void main(String[] args)
    {
        Thread3 t3 = new Thread3();        // Thread3 t3 = new Thread3();
        Thread4 t4 = new Thread4();        // Thread3 t4 = new Thread3();
        Thread5 t5 = new Thread5();        // Thread3 t5 = new Thread3();
        t3.start();
        t4.start();
        t5.start();
        t4.stop();
    }
}
