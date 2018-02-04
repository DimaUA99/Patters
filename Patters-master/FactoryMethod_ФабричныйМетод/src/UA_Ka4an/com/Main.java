package UA_Ka4an.com;

public class Main {

    public static void main(String[] args) {
        MakeSeets makeSeets = new CandyChocolateMake();
        Roshen roshen = makeSeets.creatCandy();
        roshen.doSweets();

    }
}
interface Roshen{
    void doSweets();
}
class CandyChocolate implements Roshen{

    @Override
    public void doSweets() {
        System.out.println("Шоколадная канфета");
    }
}
class Lollipop implements Roshen{

    @Override
    public void doSweets() {
        System.out.println("Леденцы");
    }
}
interface MakeSeets {
    Roshen creatCandy();
}
class CandyChocolateMake implements MakeSeets{
    @Override
    public Roshen creatCandy() {
        return new CandyChocolate();
    }
}
//class LollipopMake implements MakeSeets{
//
//    @Override
//    public Roshen creatCandy() {
//        return new Lollipop();
//    }
//}
