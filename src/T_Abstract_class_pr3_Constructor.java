abstract class Jaanwer
{
    Jaanwer()
    {
        System.out.println("All animals .... !");
    }
    public abstract void quality();
}

class Cat extends Jaanwer
{
    Cat()
    {
        super();
    }
    @Override
    public void quality()
    {
        System.out.println("Cat is so cute!");
    }
}

class Monkey extends Jaanwer
{
    Monkey()
    {
        super();
    }
    @Override
    public void quality()
    {
        System.out.println("Monkeis are jumping!");
    }
}

public class T_Abstract_class_pr3_Constructor
{
    public static void main(String[] args)
    {
        Cat c = new Cat();
        c.quality();
        Monkey m = new Monkey();
        m.quality();

    }

}

