import java.util.Objects;

class Threading3
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

public class MultiThreading_pr7_suspend_and_resume_methods
{
    public static void main(String[] args)
    {
        Threading2 t1 = new Threading2();
        Threading2 t2 = new Threading2();
        Threading2 t3 = new Threading2();
        t1.setName("Thread1");
        t2.setName("Thread2");
        t3.setName("Thread3");
        t1.start();
        t2.start();
        t3.start();
        t1.suspend();  // pause
        t2.suspend();  // pause
        t1.resume();   // restart
        t2.resume();   // restart
    }
}
