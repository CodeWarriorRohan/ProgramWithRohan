import java.util.Scanner;

public class Constructor_pr3
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your ID");
        int ID = sc.nextInt();
        System.out.println("Enter your name");
        String name = sc.nextLine();
        new Constructor_pr3(5, name);

    }

    public Constructor_pr3(int ID, String name)
    {
        int x = ID;
        String y = name;
    }
}
