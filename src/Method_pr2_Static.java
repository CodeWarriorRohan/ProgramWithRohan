import java.util.Scanner;

public class Method_pr2_Static
{
    public static void main(String[] args)
    {
        System.out.println("Enter your Sentence");
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();

        Sentence(sentence);

    }

    public static void Sentence(String sentence)
    {
        System.out.println(sentence);
    }
}

