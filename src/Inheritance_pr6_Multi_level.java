class Rectangle
{
    void area1(int l, int b)
    {
        int area1 = l*b;
        System.out.println("area of rectangle is: " + area1);
    }
}

class Triangle extends Rectangle
{
    void area2(int l, int b)
    {
        int area2 = ((l*b)/2);
        System.out.println("area of triangle is: " + area2);
    }
}

class Circle extends Triangle
{
    void area3(float r)
    {
        double area3 = (3.14*r*r);
        System.out.println("area of circle is: " + area3);
    }
}

class Squar extends Circle
{
    void area4(int a)
    {
        int area4 = (a * a);
        System.out.println("area of circle is: " + area4);
    }
}


public class Inheritance_pr6_Multi_level
{
    public static void main(String[] args)
    {
        Squar sq = new Squar();
        sq.area1(5, 8);
        sq.area2(4, 9);
        sq.area3(7);
        sq.area4(6);
    }
}

