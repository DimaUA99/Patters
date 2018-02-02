package UA_Ka4an.com;

public class Main {

    public static void main(String[] args) {
        ConveyorMake conveyorMake = getFactory("Ru");
            SugarCandyConveyor  sugarCandy = conveyorMake.makerCandy();
            ConveyorOfChocolateSweets conveyor = conveyorMake.makerSweets();

            sugarCandy.doForm();
            sugarCandy.wrap();

            conveyor.doForm();
            conveyor.decorate();

    }
    private static ConveyorMake getFactory(String lang){
        switch (lang){
            case "Ru":
                return new RU_MakerSugarCandy();
            case "En":
                return new EN_MakerSugarCandy();
            default:
                throw new RuntimeException("bla bla!!" + lang);
        }
    }
}

interface SugarCandyConveyor{
    void doForm();
    void wrap();
}
interface ConveyorOfChocolateSweets{
    void doForm();
    void decorate();
}
interface ConveyorMake{
   SugarCandyConveyor makerCandy();
   ConveyorOfChocolateSweets makerSweets();
}



class RU_SugarCandy implements SugarCandyConveyor{
    @Override
    public void doForm() {
        System.out.println("Зделать Форму питуха");
    }
    @Override
    public void wrap() {
        System.out.println("Завернуть");
        System.out.println("Готово!!");
    }

}
class RU_ChocolateSweets implements ConveyorOfChocolateSweets{
    @Override
    public void doForm() {
        System.out.println("Зделать прямоугольную форму");
    }
    @Override
    public void decorate() {
        System.out.println("Завернуть в фантик");
        System.out.println("Готово!!");
    }
}

class EN_SugarCandy implements SugarCandyConveyor{
    @Override
    public void doForm() {
        System.out.println("Make the shape of the cock");
    }
    @Override
    public void wrap() {
        System.out.println("Wrap");
        System.out.println("finish");
    }
}
class EN_ChocolateSweets implements ConveyorOfChocolateSweets{
    @Override
    public void doForm() {
        System.out.println("Make a rectangular shape");
    }
    @Override
    public void decorate() {
        System.out.println("Close in wrapper");
        System.out.println("finish");
    }
}

class RU_MakerSugarCandy implements ConveyorMake{
    @Override
    public SugarCandyConveyor makerCandy() {
        return new RU_SugarCandy();
    }
    @Override
    public ConveyorOfChocolateSweets makerSweets() {
        return new RU_ChocolateSweets();
    }
}
class EN_MakerSugarCandy implements ConveyorMake{


    @Override
    public SugarCandyConveyor makerCandy() {
        return new EN_SugarCandy();
    }

    @Override
    public ConveyorOfChocolateSweets makerSweets() {
        return new EN_ChocolateSweets();

    }
}
