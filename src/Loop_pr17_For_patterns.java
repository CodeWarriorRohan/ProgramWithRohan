// Different Types of patterns

public class Loop_pr17_For_patterns
{
    public static void main(String[] args)
    {
        int i,j,n=5;

        for(i=5;i>=1;i--)
        {
            for(j=i;j<=5;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("\n");


        for(i=1;i<=n;i++)
        {
            for(j=i;j<=5;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("\n");

        for(i=1;i<=5;++i)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(+i );
            }
            System.out.println();
        }
        System.out.println("\n");

        for(i=n;i>=1;i--)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(+i );
            }
            System.out.println();
        }
        System.out.println("\n");


        for(i=1;i<=5;++i)
        {
            for(j=i;j<=5;j++)
            {
                System.out.print(" ");
            }
            for(j=1;j<i;j++)
            {
                System.out.print("*");
            }
            for(j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }


    }

}

