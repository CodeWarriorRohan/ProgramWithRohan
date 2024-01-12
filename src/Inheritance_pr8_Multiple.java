interface multi
{
    void show(); // public + abstract
}

interface  multi2
{
    void disp(); // public + abstract
}

public class Inheritance_pr8_Multiple implements multi, multi2
{
    @Override
    public void show() {
        System.out.println("Interface A");
    }

    @Override
    public void disp() {
        System.out.println("Interface B");
    }

    public static void main(String[] args) {
        Inheritance_pr8_Multiple im = new Inheritance_pr8_Multiple();
        im.show();
        im.disp();
    }
}

