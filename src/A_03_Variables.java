public class A_03_Variables {
    static int c = 42;
    int b = 87;

    public static void main(String[] args) {
        int a = 23;
        System.out.println("The value of Local variable a is: " + a);
        A_03_Variables V = new A_03_Variables();
        System.out.println("The value of Instance variable b is: " + V.b);
        System.out.println("The value of Static variable c is: " + c);

    }
}
