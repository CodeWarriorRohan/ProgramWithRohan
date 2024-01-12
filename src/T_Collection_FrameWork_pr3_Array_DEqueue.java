import java.util.ArrayDeque;
public class T_Collection_FrameWork_pr3_Array_DEqueue
{
    public static void main(String[] args)
    {
        ArrayDeque<Integer> DE = new ArrayDeque<>();
        DE.add(7);
        DE.add(53);
        DE.add(34);
        DE.add(22);
        DE.add(12);

        System.out.println(DE);
        DE.addFirst(4);
        DE.addLast(89);
        System.out.println(DE);
        DE.pop();
        System.out.println(DE);
//        System.out.println(DE.getFirst());
//        System.out.println(DE.getLast());

//        for (int i = 0; i <= DE.size(); i++)
//        {
//            System.out.print(DE);
//            System.out.println(", ");
//        }
    }
}
