import java.util.GregorianCalendar;
import java.util.TimeZone;

public class U_Calender_class_pr4_gregorian
{
    public static void main(String[] args)
    {
        GregorianCalendar gr = new GregorianCalendar();
        System.out.println(gr.isLeapYear(2020));
        System.out.println(TimeZone.getAvailableIDs(0));
        System.out.println(TimeZone.getAvailableIDs(1));
        System.out.println(TimeZone.getAvailableIDs(2));
        System.out.println(TimeZone.getAvailableIDs(3));


    }
}


