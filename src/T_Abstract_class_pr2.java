abstract class Animals
{
    public abstract void sound();
}

class Dogs extends Animals
{
    @Override
    public void sound()
    {
        System.out.println("Dogs are Barking!");
    }
}
class Lion extends Animals
{
    @Override
    public void sound()
    {
        System.out.println("Lions are Roaring!");
    }
}

public class T_Abstract_class_pr2
{
    public static void main(String[] args)
    {
        Dogs d = new Dogs();
        Lion l = new Lion();

        d.sound();
        l.sound();
    }
}

