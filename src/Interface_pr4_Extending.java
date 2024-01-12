interface Gill
{
    void add();
}
interface Wine extends Gill
{
    void sub();
}
public class Interface_pr4_Extending implements Wine
{
    @Override
    public void add () {
        int a = 10, b = 20, c;
        c = a + b;
        System.out.println("Addition is " + c);
    }
    @Override
    public void sub () {
        int a = 30, b = 20, c;
        c = a - b;
        System.out.println("Subtraction is " + c);
    }
    public static void main(String[] args)
    {
        Interface_pr4_Extending ab = new Interface_pr4_Extending();
        ab.add();
        ab.sub();
    }
}
