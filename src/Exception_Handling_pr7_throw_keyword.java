public class Exception_Handling_pr7_throw_keyword
{
    void divi(int a, int b)
    {
        if(b == 0)
        {
            throw new ArithmeticException();
        }
        else
        {
            int c = a/b;
            System.out.println(c);
        }
    }

    public static void main(String[] args)
    {
        Exception_Handling_pr7_throw_keyword e = new Exception_Handling_pr7_throw_keyword();
//        e.sum();
        e.divi(20,0);

//        System.out.println("Main method ends");
    }



}
