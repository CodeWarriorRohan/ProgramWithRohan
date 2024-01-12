
class S
{
    void show()
    {
        System.out.println("Hello Dear");
    }
}

class Q extends S
{
    void show2()
    {
        System.out.println("How are you!");
    }
}

public class Inheritance_pr2_Single_level
{
    public static void main(String[] args)
    {
        Q ab = new Q();
        ab.show();
        ab.show2();
    }

}
