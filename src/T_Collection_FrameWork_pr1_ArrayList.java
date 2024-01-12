import java.util.ArrayList;

public class T_Collection_FrameWork_pr1_ArrayList
{
    public static void main(String[] args)
    {
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>(5);   // pass the capacity of array
        l2.add(22);
        l2.add(12);
        l2.add(89);
        l2.add(54);
        l2.add(29);
        l1.add(6);
        l1.add(9);
        l1.add(4);
        l1.add(7);
        l1.add(0,3);  // set the index of element
        l1.addAll(l2);             // Add all elements of one array in other array
//        l1.addAll(0,l2);         // Add all elements of one array in other array with indexing
        l1.set(1, 41);             // set the index of element
        System.out.println(l1.contains(30));   // Check array contains passed element or not --> Ans. in true and false
        System.out.println(l1.indexOf(4));     // Returns the index number of element

        for (int i = 0; i <= l1.size(); i++)
        {
            System.out.print(l1.get(i));
            System.out.print(", ");
        }
    }
}
