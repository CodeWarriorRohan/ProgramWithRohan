class Super1
{
    int ins_var = 1;
    static void method()
    {
        System.out.println("It is a parent class method");
    }
}
public class Keyword_Super_pr3_method extends Super1
{
    static void method()
    {
        System.out.println("It is a child class method");
    }
    void show()
    {
        super.method();
        System.out.println("It is a ins_var = " + super.ins_var);
    }

    public static void main(String[] args)
    {
        Keyword_Super_pr3_method ab = new Keyword_Super_pr3_method();
        ab.show();
        method();

    }
}
