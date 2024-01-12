class Wel
{
    void message()
    {
        System.out.println("Welcome to the base class");
    }
}

class Come extends Wel
{
    void message1()
    {
        System.out.println("Welcome to the derived class");
    }
}
public class Methods_Overriding_pr2
{
    public static void main(String[] args)
    {
        Come ab = new Come();
//        ab.message();
        ab.message1();
    }
}

