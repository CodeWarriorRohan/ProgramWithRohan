class student
{
    int roll_num;
    String name;
    static String Collage_name = "SUG";


    student(int x, String y)
    {
        roll_num = x;
        name = y;
    }

    void display()
    {
        System.out.println("Student roll no is " + roll_num);
        System.out.println("Student name is " + name);
        System.out.println("Student collage name is  " + Collage_name);
    }
}

public class Keyword_Static2
{
    public static void main(String[] args)
    {
        student st = new student(101,"Ram");
        student sd = new student(102,"Shyam");
        st.display();
        sd.display();
    }

}

