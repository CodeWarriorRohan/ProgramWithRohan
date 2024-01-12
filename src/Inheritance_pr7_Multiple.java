interface I
{
    void show(); // public + abstract
}

interface I2
{
    void show(); // public + abstract
}

public class Inheritance_pr7_Multiple implements I, I2
{
    public void show()
    {
        System.out.println("Multiple inheritance in java access by using Interface");
    }

    public static void main(String[] args) {
        Inheritance_pr7_Multiple ml = new Inheritance_pr7_Multiple();
        ml.show();
    }
}
