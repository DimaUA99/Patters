package UA_Ka4an.com;

public class Main {

    public static void main(String[] args) {
    PrinterInterface printer = new CandyDecorator(new Candy("Hello"));
    printer.ShowCandy();
    }
}
interface PrinterInterface{
    void ShowCandy();
}
class Candy implements PrinterInterface{
    String caNdy;

    public Candy(String caNdy) {
        this.caNdy = caNdy;
    }

    @Override
    public void ShowCandy() {
        System.out.print(caNdy);
    }
}
class CandyDecorator implements PrinterInterface{
    PrinterInterface component;

    public CandyDecorator(PrinterInterface component) {
        this.component = component;
    }
    @Override
    public void ShowCandy() {
        System.out.print("(");
        component.ShowCandy();
        System.out.print(")");
    }
}