class Thread6 extends Thread
{
    public void run()
    {
        System.out.println("isAlive method program!");
    }
}

public class MultiThreading_pr10_isAlive_method
{
    public static void main(String[] args)
    {
        Thread6 t6 = new Thread6();
        Thread6 t7 = new Thread6();

        t6.start();
        System.out.println(t6.isAlive());
        t7.start();
        System.out.println(t7.isAlive());

    }
}
