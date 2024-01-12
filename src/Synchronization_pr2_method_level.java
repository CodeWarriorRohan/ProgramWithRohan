class Table
{
    public synchronized void printTable(int n)
    {
        for (int i = 1; i <= 10; i++)
        {
            System.out.println(n*i);
        }
    }

}
class Table1 extends Thread
{
    Table t;
    Table1(Table t)
    {
        this.t = t;
    }
    public void run()
    {
        t.printTable(5);
    }
}
class Table2 extends Thread
{
    Table t;
    Table2(Table t)
    {
        this.t = t;
    }
    public void run()
    {
        t.printTable(7);
    }
}
public class Synchronization_pr2_method_level
{
    public static void main(String[] args)
    {
        Table obj = new Table(); // obj = 1 lock

        Table1 t1 = new Table1(obj);
        Table2 t2 = new Table2(obj);

        t1.start();
        t2.start();
    }
}


