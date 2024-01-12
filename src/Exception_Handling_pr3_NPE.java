//NullPointerException

public class Exception_Handling_pr3_NPE
{
    public static void main(String[] args)
    {
        String str = null;
//        String str = "shobhit";

        try
        {
            System.out.println(str.toUpperCase());
        }
        catch (NullPointerException n)
        {
            System.out.println(n);
            System.out.println("null can't be casted");
        }
    }
}
