class Parent
{
    void show1()
    {
        System.out.println("It is parent class");
    }
}
class Child extends Parent
{
    void show()
    {
        System.out.println("It is a child class");
    }
}
public class Type_Casting
{
    public static void main(String[] args)
    {
        Parent p = new Child();   // upcasting
        p.show1();
//        p.show();

        Child c = (Child) p;      // downcasting
        c.show1();
        c.show();

    }
}

