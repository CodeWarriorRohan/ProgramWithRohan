class R
{
    String colour = "White";
}

class B extends R
{
    String colour = "Black";
    void colour()
    {
        System.out.println("Normal variable --> "+colour);
        System.out.println("Super variable --> "+super.colour);
    }
}

public class Keyword_Super_pr1_variable
{
    public static void main(String[] args)
    {
        B bs = new B();
        bs.colour();
    }
}
