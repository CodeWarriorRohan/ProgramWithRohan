import java.util.Calendar;

public class U_Calender_class_pr3
{
    public static void main(String[] args)
    {
        Calendar c = Calendar.getInstance();
        System.out.println(c.getTime());
        System.out.println(c.get(Calendar.DATE));
        System.out.println(c.get(Calendar.SECOND));
        System.out.println(c.get(Calendar.HOUR));
        System.out.println(c.get(Calendar.HOUR_OF_DAY)); // Railway time
        System.out.println(c.get(Calendar.HOUR_OF_DAY)+":"+c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND));



        System.out.println(c.getCalendarType());
        System.out.println(c.getTimeZone());
        System.out.println(c.getTimeZone().getID());

    }
}
