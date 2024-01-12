class Bank extends Thread
{
    static int balance = 5000;
    static int withdraw;

    Bank(int withdraw)
    {
        this.withdraw = withdraw;
    }
    public static synchronized void transaction()
    {
        String name = Thread.currentThread().getName();
        if(withdraw <= balance)
        {
            System.out.println(name+" withrawn money!");
            balance = balance - withdraw;
        }
        else
        {
            System.out.println("Insufficient Balance!");
        }
    }
    public void run()
    {
        transaction();
    }
}

public class Synchronization_pr4_static
{
    public static void main(String[] args)
    {
        Bank b = new Bank(5000);  // b has one lock
        Thread t1 = new Thread(b);
        Thread t2 = new Thread(b);

        t1.setName("Shubham");
        t2.setName("Ajay");

        Bank b2 = new Bank(5000);  // b has one lock
        Thread t3 = new Thread(b2);
        Thread t4 = new Thread(b2);

        t3.setName("Naman");
        t4.setName("Deepak");

        t1.start();
        t2.start();
        t3.start();
        t4.start();


    }
}
