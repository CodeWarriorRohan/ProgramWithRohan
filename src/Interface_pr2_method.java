import java.util.Scanner;

interface Client
{
    void input();
    void output();
}

class Company implements Client
{
    String name; double salary;
    public void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Username: ");
        name = sc.nextLine();

        System.out.println("Enter salary: ");
        salary = sc.nextDouble();
    }
    public void output()
    {
        System.out.println(name+","+salary);
    }

    public static void main(String[] args) {
        Client  c = new Company();
        c.input();
        c.output();
    }
}

public class Interface_pr2_method
{
    public static void main(String[] args) {

    }
}


