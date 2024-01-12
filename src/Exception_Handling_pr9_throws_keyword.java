public class Exception_Handling_pr9_throws_keyword
{
//  throws forword the Exception to the divi method's caller which is main method !
    void divi(int a, int b) throws ArithmeticException
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
    public static void main(String[] args) throws ArithmeticException
    {
//      throws forword the Exception to the main method's caller which is jvm !
        Exception_Handling_pr9_throws_keyword ep = new Exception_Handling_pr9_throws_keyword();
        ep.divi(10,0);
    }
}
