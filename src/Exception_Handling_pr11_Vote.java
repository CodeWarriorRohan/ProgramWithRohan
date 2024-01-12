class InvalidAgeException extends Exception
{
    InvalidAgeException(String msg)
    {
        System.out.println(msg);
    }
}

public class Exception_Handling_pr11_Vote
{
    public static void main(String[] args)
    {
        try
        {
            voting(24);
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }

    public static void voting(int age) throws InvalidAgeException
    {
        if(age<18)
        {
            throw new InvalidAgeException("Not eligible for voting!");
        }
        else
        {
            System.out.println("Eligible for voting!");
        }
    }
}
