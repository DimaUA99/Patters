package UA_Ka4an.com;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
}
interface Sorting{
    void sort(int[] arr);
}
class StrategyCandy{
    Sorting strategy;

    public void setStrategy(Sorting strategy) {
        this.strategy = strategy;
    }
    public void executeStrategya(int[] arr){
        strategy.sort(arr);
    }
}
class Strt1 implements  Sorting{

    @Override
    public void sort(int[] arr) {
        System.out.println("сортировка 1");
        System.out.println("До: " + Arrays.toString(arr));
        for (int bar = arr.length - 1; bar >= 0; bar--) {
            for (int i = 0; i < bar; i++) {
                if (arr[i] > arr[i + 1]) {
                    int tmp = (int) arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = tmp;
                }
            }
            System.out.println("после: " + Arrays.toString(arr));
        }
    }
}

class Strt2 implements  Sorting{

    @Override
    public void sort(int[] arr) {
        System.out.println("сортировка 1");
        System.out.println("До: " + Arrays.toString(arr));
        for (int barier = 0; barier< arr.length-1; barier++) {
            for (int i = barier+1;i<arr.length; i++) {
                if (arr[i] < arr[barier]) {
                    int tmp = arr[i];
                    arr[i] = arr[barier];
                    arr[barier] = tmp;
                }
            }
            System.out.println("после: " + Arrays.toString(arr));
        }
    }
}