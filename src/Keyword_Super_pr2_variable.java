class keyword1
{
    int a = 10;
}
class keyword2 extends keyword1
{
    int a = 20;
    void show()
    {
        System.out.println("Normal variable --> "+a);
        System.out.println("Super variable --> "+super.a);
    }
}
public class Keyword_Super_pr2_variable
{
    public static void main(String[] args)
    {
        keyword2 k = new keyword2();
        k.show();
    }
}

