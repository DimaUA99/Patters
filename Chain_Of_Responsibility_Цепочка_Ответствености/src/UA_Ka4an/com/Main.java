package UA_Ka4an.com;

public class Main {

    public static void main(String[] args) {
        Securety securety = new GuardOnExpirationDate(Level.ERROR);
        Securety securety1 = new SecurityGuard(Level.DEBUG);
        Securety securety2 = new SecurityOfAccessibility(Level.INFO);

        securety.setNext(securety1);
        securety1.setNext(securety2);

        securety.writeMessage("Срок годности товара", Level.ERROR);
        securety.writeMessage("Происходет просмотр",Level.DEBUG);
        securety.writeMessage("Тавар на месте",Level.INFO);
    }
}
class Level{
    public static final int ERROR = 1;
    public static final int DEBUG = 2;
    public static final int INFO = 3;
}
abstract class Securety{
    int priority;
    public  Securety(int priority){
    this.priority = priority;
}

    public Securety next;
    public void setNext(Securety next){
        this.next = next;
    }
    public void writeMessage(String message, int level) {
        if (level < priority) {
            write(message);
        }
        if (next != null) {
            next.writeMessage(message, level);
        }
    }
    abstract void write(String message);
}
class GuardOnExpirationDate extends Securety{
    public GuardOnExpirationDate(int priority) {
        super(priority);
    }

    @Override
    void write(String message) {
        System.out.println("Срок годности товара "+message);
    }
}
class SecurityGuard extends Securety{
    public SecurityGuard(int priority) {
        super(priority);
    }

    @Override
    void write(String message) {
        System.out.println("Цельность товара"+message);
    }
}
class SecurityOfAccessibility extends Securety{
    public SecurityOfAccessibility(int priority) {
        super(priority);
    }

    @Override
    void write(String message) {
        System.out.println("Наявность товара" + message);
    }
}
