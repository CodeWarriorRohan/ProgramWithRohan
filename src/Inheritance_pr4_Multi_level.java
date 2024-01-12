class M
{
    void show()
    {
        System.out.println("It is a super class");
    }
}

class D extends M
{
    void diplay()
    {
        System.out.println("It is a derived class");
    }
}
class C extends D
{
    void presentation()
    {
        System.out.println("It is D derived class");
    }
}
public class Inheritance_pr4_Multi_level
{
    public static void main(String[] args)
    {
        C cr = new C();
        cr.show();
        cr.diplay();
        cr.presentation();
    }
}
