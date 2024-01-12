class  View
{
    void show()
    {
        System.out.println("Super method --> Hello viewer");
    }
}

class Learn extends View
{
    void show()
    {
        super.show();
        System.out.println("Normal method --> Hello learner");
    }
}

public class Keyword_Super_pr4_method
{
    public static void main(String[] args)
    {
        Learn l = new Learn();
        l.show();
    }
}

