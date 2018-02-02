package UA_Ka4an.com;

public class Main {

    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.run();
    }
}
class Facade{
    WrapperOfSweets wos = new WrapperOfSweets();
    CollectInABox col = new CollectInABox();

    void run(){
        wos.hasWeets();
        wos.PutOnAWrapper();
        wos.Wrap();

        col.collectInBox(wos);
    }
}
class WrapperOfSweets {
    private boolean sweets = false;
    public  boolean hasWeets(){
        return sweets;
    }
    void PutOnAWrapper(){
        System.out.println("Подготовка  к завертанию");
    }
    void Wrap(){
        System.out.println("Завертание..");
        sweets = true;

    }
    void off(){
        System.out.println("Прекращение роботы");
        sweets = false;
    }
}

class CollectInABox{

  public  void collectInBox(WrapperOfSweets ws){
        if (ws.hasWeets()){
            System.out.println("Происходит слаживание в ящик");
        }else System.out.println("Заверните канфеты");
      System.out.println("Ящик запакован готов к отправке!!");
    }
}