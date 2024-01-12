class Const1
{
    //    Const1(int a)
    Const1()
    {
//        System.out.println("It is Constructor of Super class "+a);
        System.out.println("It is Constructor of Super class");
    }
}

class Const2 extends Const1
{
    Const2()
    {
//        super(12);      It is not compulsory to write
        super();     //  It is not compulsory to write
        System.out.println("It is Constructor of Normal class");
    }
}
public class Keyword_Super_pr5_Constructor
{
    public static void main(String[] args)
    {
        Const2 C =  new Const2();
    }
}
