public class Statement_Break
{
    public static void main(String[] args)
    {
        for(int i = 0; i <= 10; i++)
        {
            System.out.println(i);
            System.out.println("Java is great!");

            if(i == 5)
            {
                System.out.println("Ending the loop!");
                break;
            }
        }
        System.out.println("Loop ends here!");

    }

}

