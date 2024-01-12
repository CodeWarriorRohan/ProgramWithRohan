
interface Calculate
{
    int a=12,b=4;
    void sum();
    void sub();
    void multi();
    void divi();
}

public class Interface_pr6_Calculator implements Calculate
{
    public void sum()
    {
        int c = a+b;
        System.out.println("sum of a and b is = "+ c);
    }
    public void sub()
    {
        int c = a-b;
        System.out.println("sub of a and b is = "+ c);
    }
    public void multi()
    {
        int c = a*b;
        System.out.println("multi of a and b is = "+ c);
    }
    public void divi()
    {
        int c = a/b;
        System.out.println("divi of a and b is = "+ c);
    }
    public static void main(String[] args)
    {
        Interface_pr6_Calculator ac = new Interface_pr6_Calculator();
        ac.sum();
        ac.sub();
        ac.multi();
        ac.divi();
    }
}

