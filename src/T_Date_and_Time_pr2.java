import java.util.Date;
public class T_Date_and_Time_pr2
{
    public static void main(String[] args)
    {
//        System.out.println(Long.MAX_VALUE); // print the maximum size long
//        System.out.println(System.currentTimeMillis());
        Date d = new Date();  // print the current date and time
        System.out.println(d);

        System.out.println(d.getTime());  // time in milliseconds
        System.out.println(d.getDate());  // current date
        System.out.println(d.getSeconds());  // current seconds
        System.out.println(d.getYear());  // current year + 1900

    }
}
