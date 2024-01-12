abstract class Animal
{
    void barks()
    {
        System.out.println("The dogs are barks!");
    }

}
class Dog extends Animal
{

}

public class T_Abstract_class_pr1
{
    public static void main(String[] args)
    {
        Animal Al = new Dog();
        Al.barks();
    }
}

