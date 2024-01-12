public class String_pr2_Methods
{
    public static void main(String[] args)
    {
        String name = new String("hello friend!");
        String str = new String("WELCOME BACK!");
        System.out.println(name);

//      1.
        int length = name.length();
        System.out.println(length+" letters in above string");

//      2.
        System.out.println(name.toUpperCase());
        System.out.println(str);

//      3.
        System.out.println(str.toLowerCase());

//      4. trim() --> All space remove
        String nonTrimmed = "     Rohan   ";
        System.out.println(nonTrimmed);
        System.out.println(nonTrimmed.trim());

//      5. substring(1nt a) --> Start print the string from given index
        System.out.println(name.substring(3));

//      6. substring(1nt a, int n) --> Start print the string from given starting index to n-1
        System.out.println(name.substring(4,10));

//      7.
        System.out.println(name.replace('h','C'));

//      8.
        System.out.println(name.replace("hello","Hi"));

//      9.
        System.out.println(name.startsWith("he"));
        System.out.println(name.startsWith("we"));

//      10.
        System.out.println(name.endsWith("nd!"));
        System.out.println(name.endsWith("n"));

//      11.
        System.out.println(name.charAt(7));

//      12.
        System.out.println(name.indexOf("r"));
        System.out.println(name.indexOf("e",6));
        System.out.println(name.lastIndexOf("l"));






    }
}
