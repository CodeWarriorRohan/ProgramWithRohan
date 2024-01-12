class K
{
    void show()
    {
        System.out.println("It is a parent class");
    }
}
class P extends K
{
    void display()
    {
        System.out.println("It is a child class");
    }
}

public class Inheritance_pr1_Single_level
{
    public static void main(String[] args)
    {
        P ab = new P();
        ab.show();
        ab.display();
    }

}

