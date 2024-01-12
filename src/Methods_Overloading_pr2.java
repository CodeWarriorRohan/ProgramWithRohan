public class Methods_Overloading_pr2
{
    void add()
    {
        int a = 10, b = 20, c;
        c = a+b;
        System.out.println(c);
    }

    void add(int x, int y)
    {
        int c;
        c = x+y;
        System.out.println(c);
    }

    void add(int x, double y)
    {
        double c;
        c = x+y;
        System.out.println(c);
    }

    public static void main(String[] args)
    {
        Methods_Overloading_pr2 mr = new Methods_Overloading_pr2();
        mr.add();
        mr.add(8,6);
        mr.add(9,12.2);
    }

}

