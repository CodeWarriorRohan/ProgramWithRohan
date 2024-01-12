import java.util.Stack;
public class T_Collection_FrameWork_pr5_Stack
{
    public static void main(String[] args)
    {
        Stack<Integer> ab = new Stack<>(); //LIFO
        ab.push(5);
        ab.push(12);
        ab.push(25);
        ab.push(41);
        ab.push(30);

        System.out.println(ab);

//        for (int i = 0; i <= 4; i++)
//        {
//            System.out.println(ab.get(i));
//        }

        ab.push(19);
        System.out.println(ab);

        ab.pop();
        System.out.println(ab);
    }
}
