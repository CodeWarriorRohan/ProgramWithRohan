class A
{
    int i;   // instance variable
    void setvalue(int i)
    {
        this.i = i;
    }
    void show()
    {
        System.out.println("value of instance i: " + i);
    }
}

public class Keyword_This
{
    public static void main(String[] args)
    {
        A ab = new A();
        ab.setvalue(10);
        ab.show();
    }
}

