import java.util.Scanner;

public class Method_pr5_Instance
{
    public static void main(String[] args)
    {
        System.out.println("Enter a number");
        Method_pr5_Instance ab = new Method_pr5_Instance();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        ab.Find_even_odd(num);

    }

    public void Find_even_odd(int num)
    {
        if(num%2==0)
        {
            System.out.println(num +" is a even number");
        }
        else
        {
            System.out.println(num +" is a odd number");
        }
    }
}

