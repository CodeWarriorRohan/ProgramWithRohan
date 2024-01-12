class msg
{
    public void show(String name)
    {
        ;;;;;;;;;;  // assuming there are 100 lines of code
        synchronized (this)
        {

            for (int i = 1; i <= 3; i++) {
                System.out.println("How are you " + name);
            }
        }
        ;;;;;;;;;;  // assuming there are 100 lines of code
    }
}

class thread10 extends Thread
{
    msg m;
    String name;
    thread10(msg m, String name)
    {
        this.m = m;
        this.name = name;
    }
    public void run()
    {
        m.show(name);
    }
}
public class Synchronization_pr3_block_level
{
    public static void main(String[] args)
    {
        msg m = new msg();  // m has a lock
        thread10 t1 = new thread10(m,"Akhilesh");
        thread10 t2 = new thread10(m,"Tarun");

        t1.start();
        t2.start();
    }
}
