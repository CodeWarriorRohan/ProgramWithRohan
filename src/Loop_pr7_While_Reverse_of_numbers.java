import java.util.Scanner;

public class Loop_pr7_While_Reverse_of_numbers
{
    public static void main(String[] args)
    {
        int rev = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter digit to be reverse");
        int n = sc.nextInt();

        while(n>0)
        {
            rev = (rev * 10)+ n%10;
            n = n/10;
        }
        System.out.println("Reverse of given digit is " + rev);
    }
}

