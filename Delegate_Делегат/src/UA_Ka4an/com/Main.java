package UA_Ka4an.com;

public class Main {

    public static void main(String[] args) {
     MakeSweets make = new  MakeSweets();
     make.setSweets(new ChocolateCandy());
     make.doSweets();
     make.setSweets(new SuckingCandy());
     make.doSweets();
    }
}
interface Sweets{
  public void doSweets();

}
class ChocolateCandy implements Sweets{

    @Override
    public void doSweets() {
        System.out.println("Я шикаладная канфета");
    }
}
class SuckingCandy implements Sweets{

    @Override
    public void doSweets() {
        System.out.println("Я сосательная канфета");
    }
}

class MakeSweets{
    Sweets doSweets;
  void setSweets(Sweets s){
       doSweets = s;
    }

    void doSweets(){
      doSweets.doSweets();
    }
}
