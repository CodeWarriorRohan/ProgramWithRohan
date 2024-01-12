interface Website
{
    void webdesign();  // public + abstract
    void webdevelop();  // public + abstract
}

abstract class Webtech implements Website
{
    @Override
    public void webdesign() {
        System.out.println("Green, Top menu, Three dot button");
    }
}

class Wscube extends Webtech
{
    @Override
    public void webdevelop() {
        System.out.println("HTML, CSS, JAVASCRIPT");
    }
}
public class Interface_pr3_method
{
    public static void main(String[] args) {
        Wscube ws = new Wscube();
        ws.webdesign();
        ws.webdevelop();
    }
}


