class Threading5 extends Thread
{
    public void run()
    {
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getPriority());

    }

}

public class MultiThreading_pr12_set_and_get_priority
{
    public static void main(String[] args)
    {
        Threading5 t5 = new Threading5();
        Threading5 t6 = new Threading5();
        Threading5 t7 = new Threading5();

        t5.setName("t5 thread");
        t6.setName("t6 thread");
        t7.setName("t7 thread");

        t5.setPriority(2);
        t6.setPriority(4);
        t7.setPriority(9);

        t5.start();
        t6.start();
        t7.start();
    }
}
