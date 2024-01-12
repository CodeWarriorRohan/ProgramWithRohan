public class Exception_Handling_pr2
{
    public static void main(String[] args)
    {
//        String str = "Rohan";
        String str = "348";
        try {
            int a = Integer.parseInt(str);  // parsInt is pre defined method in java
            System.out.println(a);

            System.out.println("String NumberFormatException");
        }
        catch (NumberFormatException n)
        {
            System.out.println(n);
            System.out.println("String "+str+" can't be converted into Integer");
        }
//        System.out.println("String "+str+" can't be converted into Integer");

    }
}
