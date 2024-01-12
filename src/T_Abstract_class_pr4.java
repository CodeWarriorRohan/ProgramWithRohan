abstract class vehicles
{
    public abstract void start();
}

class Car extends vehicles
{
    @Override
    public void start()
    {
        System.out.println("Car starts with key!");
    }
}

class Bike extends vehicles
{
    @Override
    public void start()
    {
        System.out.println("Bike starts with key and kick!");
    }
}
public class T_Abstract_class_pr4
{
    public static void main(String[] args)
    {
        Car c = new Car();
        Bike b = new Bike();

        c.start();
        b.start();
    }
}

