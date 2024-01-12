import java.util.Scanner;

public class Method_pr7_prime_num
{
    int n;
    void get_data()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any to be check prime or not");
        n = sc.nextInt();
    }

    void put_data()
    {
        int i, count = 0;

        for(i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                count = count+1;

            }
        }
        if(count==2)
        {
            System.out.println(n +" is a prime number");
        }
        else
        {
            System.out.println(n +" is not a prime number");
        }
    }

    public static void main(String[] args)
    {
        Method_pr7_prime_num gd = new Method_pr7_prime_num();
        gd.get_data();
        gd.put_data();
    }


}

