class Multithread extends Thread
{
    public void run()
    {
        for (int i = 1; i <= 5; i++)
        {
            System.out.println("Ankush");
        }
    }
}

public class Multithreading_pr1_Thread_class
{
    public static void main(String[] args)
    {
        Multithread m = new Multithread();
        m.start();

        for (int i = 1; i <= 5; i++)
        {
            System.out.println("Rohan");
        }
    }
}
