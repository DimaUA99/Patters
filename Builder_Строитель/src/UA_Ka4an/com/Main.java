package UA_Ka4an.com;

public class Main {

    public static void main(String[] args) {
	Candy candy = new CandyBuilder()
                      .builderCandyWrap("С класным ЛОГО")
                      .builderType("Сосательная")
                      .builder();
        System.out.println(candy);
    }
}
class Candy{
    public String CandyWrap = "Обыкновенная";
    public String Type = "Сасательная";
    public void setCandyWrap(String candyWrap) {CandyWrap = candyWrap; }
    public void setType(String type) {Type = type; }

    @Override
    public String toString() {
        return "Candy{" +
                "CandyWrap='" + CandyWrap + '\'' +
                ", Type='" + Type + '\'' +
                '}';
    }
}

class CandyBuilder{
    public String cp;
    public String t;

    CandyBuilder builderCandyWrap(String cp){
        this.cp = cp;
        return this;
    }

    CandyBuilder builderType(String t){
        this.t = t;
        return this;
    }

    Candy builder(){
        Candy candy = new Candy();
        candy.setCandyWrap(cp);
        candy.setType(t);
        return candy;
    }
}
