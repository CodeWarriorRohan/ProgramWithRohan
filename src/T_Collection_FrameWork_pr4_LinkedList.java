import java.util.LinkedList;
public class T_Collection_FrameWork_pr4_LinkedList
{
    public static void main(String[] args)
    {
        LinkedList<Integer> l1 = new LinkedList<>();
//        LinkedList<Integer> l2 = new LinkedList<>();   // pass the capacity of array
//        l1.addFirst(423);
//        l2.add(12);
//        l2.add(89);
//        l2.add(54);
//        l2.add(29);
        l1.add(6);
        l1.add(4);
        l1.add(9);
        l1.add(7);
        l1.add(2);
        System.out.println(l1);
        l1.add(0,3);  // set the index of element
        System.out.println(l1);
//        l1.addAll(l2);             // Add all elements of one array in other array
        l1.addLast(125);
        System.out.println(l1);
//        l1.addAll(0,l2);         // Add all elements of one array in other array with indexing
//        l1.set(1, 41);             // set the index of element
        System.out.println(l1.contains(30));   // Check array contains passed element or not --> Ans. in true and false
        System.out.println(l1.indexOf(4));     // Returns the index number of element
//
//        for (int i = 0; i <= l1.size(); i++)
//        {
//            System.out.print(l1.get(i));
//            System.out.print(", ");
//        }
    }
}
