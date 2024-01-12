// In final method can't use same methods

class Base
{
    final void message()
    {
        System.out.println("Welcome to the base class");
    }
}

class Derived extends Base
{
    void message1()
    {
        System.out.println("Welcome to the derived class");
    }
}

public class Keyword_Final_method
{
    public static void main(String[] args)
    {
        Derived ab = new Derived();
        ab.message();
        ab.message1();
    }
}
