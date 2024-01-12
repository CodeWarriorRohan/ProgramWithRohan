abstract class Programming
{
    public abstract void Developer();
}

class HTML extends Programming
{
    @Override
    public void Developer()
    {
        System.out.println("HTML developed by Tin Berners Lee");
    }
}

class  Java extends Programming
{
    @Override
    public void Developer()
    {
        System.out.println("Java developed by James Gosling");
    }
}

public class T_Abstract_method_pr5
{
    public static void main(String[] args)
    {
        HTML h = new HTML();
        h.Developer();
        Java j = new Java();
        j.Developer();
    }
}

