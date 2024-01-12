// final class can't extends in another class

final class F
{
    void message()
    {
        System.out.println("Welcome to the base class");
    }
}

class Z
{
    void message()
    {
        System.out.println("Welcome to the derived class");
    }
}
public class Keyword_Final_class
{
    public static void main(String[] args)
    {
        F ab = new F();
        ab.message();
        Z xy = new Z();
        xy.message();
    }
}
