package UA_Ka4an.com;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
}
interface ChocoleteInterface{
    void jellyBean();
    void ChocolateWithFilling();
}
class Sweets {
    void JBean(){
        System.out.println("Жвательная Канфета");
    }
    void ChocolateF(){
        System.out.println("Шоколадная с начинкой канфета");
    }
}
class Adapter extends Sweets implements ChocoleteInterface{

    @Override
    public void jellyBean() {
        JBean();
    }

    @Override
    public void ChocolateWithFilling() {
        ChocolateF();
    }
}