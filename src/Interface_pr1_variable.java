interface Customer
{
    int amt = 5; // public + static + final
    void purchase(); // public + abstract
}
class Seller implements Customer
{
    @Override
    public void purchase()
    {
        System.out.println("Customer needs "+amt+" kg rice!");
    }
}
//public class Interface_pr1_variable implements Customer
public class Interface_pr1_variable
{
    //    @Override
//    public void purchase()
//    {
//        System.out.println("Customer needs "+amt+" kg rice!");
//    }
    public static void main(String[] args) {
//         Interface_pr1_variable c = new Interface_pr1_variable();
        Customer c = new Seller();
        c.purchase();
//        System.out.println(Customer.amt);
    }
}

