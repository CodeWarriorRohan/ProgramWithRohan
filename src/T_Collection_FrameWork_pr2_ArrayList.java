import java.util.ArrayList;

public class T_Collection_FrameWork_pr2_ArrayList
{
    public static void main(String[] args)
    {
        ArrayList<String> str = new ArrayList<>();
        str.add("Kunal");
        str.add("Shubham");
        str.add("Rohit");
        str.add("Deepak");
        System.out.println(str);

//        str.add("Aman");
//        System.out.println(str);

//        str.add(1,"Tilak");
//        System.out.println(str);

        str.set(0,"Ram");
        System.out.println(str);

        str.add(3,"Mohan");
        System.out.println(str);

        str.remove(2);
        System.out.println(str);

        System.out.println(str.get(3));

    }
}
