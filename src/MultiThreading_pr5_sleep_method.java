class Threading1 extends Thread
{
    public void run() {
        try {
            int i = 1, n = 2, table;
            while (i <= 10) {
                table = n * i;
                System.out.println(n * i);
                i++;
                Thread.sleep(1000);
            }
        }
        catch (InterruptedException e)
        {
            System.out.println(e);
        }
    }
}
public class MultiThreading_pr5_sleep_method
{
    public static void main(String[] args)
    {
         Threading1 t1 = new Threading1();
         t1.start();
    }
}
