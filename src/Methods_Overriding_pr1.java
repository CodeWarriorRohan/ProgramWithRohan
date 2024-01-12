class Bikes
{
    void run(int a, int b)
    {
        int multi = a*b;
        System.out.println("Bikes are running speed of " + multi +" km/h");
    }
}

class Scooter extends Bikes
{
    void run()
    {
        System.out.println("Scooter is running at 40 km/h !");
    }
}

public class Methods_Overriding_pr1
{
    public static void main(String[] args)
    {
        Scooter ab = new Scooter();
        ab.run(10,16);
        ab.run();
    }
}

