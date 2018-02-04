package UA_Ka4an.com;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Sweets lollipop = new Lollipop();
        Sweets jellyBean = new JellyBean();
        Sweets chocolateBar = new ChocolateBar();

        Sweets lollipop2 = new Lollipop();
        Sweets jellyBean2 = new JellyBean();
        Sweets chocolateBar2 = new ChocolateBar();

        Composite composite = new Composite();
        Composite composite2 = new Composite();
        composite.addComponent(lollipop);
        composite.addComponent(jellyBean);
        composite.addComponent(chocolateBar);

        composite.addComponent(lollipop2);
        composite.addComponent(jellyBean2);
        composite.addComponent(chocolateBar2);
       composite2.addComponent(composite);

       composite2.BuySweets();
    }
}
interface Sweets{
    void BuySweets();
}
class Lollipop implements Sweets{

    @Override
    public void BuySweets() {
        System.out.println("Я леденец");
    }
}
class JellyBean implements Sweets{

    @Override
    public void BuySweets() {
        System.out.println("Я Жевательная канфета");
    }
}
class ChocolateBar implements Sweets{

    @Override
    public void BuySweets() {
        System.out.println("Я Шокаладка");
    }
}

class Composite implements Sweets{
 private List<Sweets> components = new ArrayList<>();

 public void addComponent(Sweets component){
     components.add(component);
 }

 public void removeComponent(Sweets component){
     components.remove(component);
 }
    @Override
    public void BuySweets() {
        for (Sweets component: components){
            component.BuySweets();
        }
    }
}
