package UA_Ka4an.com;

public class Main {

    public static void main(String[] args) {
        C c = new A();
        c.templateMethod();

        System.out.println();

        C b = new B();b.templateMethod();
    }
}
class A extends C{
    void differ() {
        System.out.println("Разлечающая часть кода");
    }
}
class B extends C{
    void differ(){
        System.out.println("Разлечающая часть кода");
    }
}
abstract class C{
   final void  templateMethod(){
        System.out.println("Общая часть кода двук класов");
        differ();
        System.out.println("Общая часть кода двук класов");
    }
    abstract void differ();
}