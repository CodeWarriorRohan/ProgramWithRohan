//import java.util.Scanner;

interface BaseInterface
{
    void method1();
    void method2();
}

interface DerivedInterface extends BaseInterface
{
    void method3();
    void method4();
}

class MyInterface implements DerivedInterface
{
    @Override
    public void method1()
    {
        System.out.println("Mathod 1");
    }

    @Override
    public void method2()
    {
        System.out.println("method 2");
    }
    @Override
    public void method3()
    {
        System.out.println("method 3");
    }

    @Override
    public void method4()
    {
        System.out.println("method 4");
    }

}

public class Interface_pr5
{
    public static void main(String[] args)
    {
        MyInterface my = new MyInterface();
        my.method1();
        my.method2();
        my.method3();
        my.method4();

    }
}

