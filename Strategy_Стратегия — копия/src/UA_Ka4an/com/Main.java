package UA_Ka4an.com;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
}
interface Sorting{
    void sort(Object[] arr);
}
class StrategyCandy{
    Sorting strategy;

    public void setStrategy(Sorting strategy) {
        this.strategy = strategy;
    }
    public void executeStrategya(Object[] arr){
        strategy.sort(arr);
    }
}