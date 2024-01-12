class Test
{
    void show(int a, int b)
    {
        System.out.println(a + b);
    }

    void show(int c, String name)
    {
        System.out.println(name);
        System.out.println(c);
    }
}

public class Methods_Overloading_pr1
{
    public static void main(String[] args)
    {
        Test t = new Test();
        t.show(10, 8);
        t.show(7, "Rohan");
    }
}

