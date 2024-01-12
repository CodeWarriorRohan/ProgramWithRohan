abstract class Programming_lang
{
    public abstract void Developer();
    public abstract void Rank();
}

abstract class Python extends Programming_lang
{
    @Override
    public void Developer()
    {
        System.out.println("Python is developed by Guido van Rossum");
    }
}
class  Java_script  extends Python
{
    @Override
    public void Rank()
    {
        System.out.println("Python is trend on 1st position");
    }
}
public class T_Abstract_method_pr6
{
    public static void main(String[] args)
    {
        Programming_lang pl = new Java_script();
        pl.Developer();
        pl.Rank();
    }
}

