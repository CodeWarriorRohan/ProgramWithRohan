import java.util.Scanner;
public class Loop_pr8_While_palindrome_number {
    public static void main(String[] args)
    {
        int rev = 0, z;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to be check palindrome or not");
        int n = sc.nextInt();
        z = n;

        while(n>0)
        {
            rev = (rev *10) + n%10;
            n = n/10;
        }
        System.out.println(rev);
        if(z == rev)
        {
            System.out.println("Number is Palindrome");
        }
        else
        {
            System.out.println("Number is Not palindrome");
        }

    }
}

