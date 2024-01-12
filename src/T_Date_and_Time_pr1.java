public class T_Date_and_Time_pr1
{
    public static void main(String[] args)
    {
//        System.out.println(System.currentTimeMillis()/1000/3600/24/365);
        System.out.println("This time has passed since 1 january 1971 in millisecond -->"+System.currentTimeMillis());
        System.out.println("This time has passed since 1 january 1971 in seconds -->"+System.currentTimeMillis()/1000);
        System.out.println("This time has passed since 1 january 1971 in minutes -->"+System.currentTimeMillis()/3600);
        System.out.println("This time has passed since 1 january 1971 in days -->"+System.currentTimeMillis()/24);
        System.out.println("This time has passed since 1 january 1971 in years -->"+System.currentTimeMillis()/1000/3600/24/365);

    }
}
