package UA_Ka4an.com;

public class Main {

    public static void main(String[] args) {
        Candy candy = new Candy("Барбариска","Сосательнаюя");
        System.out.println(candy);

        Candy clone = (Candy)candy.clone();
        System.out.println(clone);
    }
}
interface Clone{
    Object clone();
}
class Candy implements Clone{
    String name;
    String type;

    public Candy(String name, String type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Candy{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

    @Override
    public Object clone() {
        Candy candy = new Candy(name,type);
        return candy;
    }
}
