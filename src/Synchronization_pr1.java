class Bus implements Runnable
{
    int available = 1, passenger;
    Bus(int passenger)
    {
        this.passenger = passenger; // passenger = 1

    }
    public synchronized void run()
    {
        String name = Thread.currentThread().getName();
        if (available >= passenger)
        {
            System.out.println(name+ " reserved seat!");
            available = available - passenger;

        }
        else
        {
            System.out.println("Sorry "+name+" seat is not available!");
        }

    }
}

public class Synchronization_pr1
{
    public static void main(String[] args)
    {
        Bus b = new Bus(1);

        Thread t1 = new Thread(b);
        Thread t2 = new Thread(b);
        Thread t3 = new Thread(b);

        t1.setName("Ram");
        t2.setName("Shyam");
        t3.setName("Shubham");

        t1.start();
        t2.start();
        t3.start();
    }


}
