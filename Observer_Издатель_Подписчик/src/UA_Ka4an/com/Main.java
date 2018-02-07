package UA_Ka4an.com;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        MetoSten station = new MetoSten();

        station.addObserver(new User());
        station.setTemperature(25, 890);
    }
}
interface Observed{
    void addObserver(Observer o);
    void removeObserver(Observer o);
    void notifyOObservers();
}

interface Observer{
    void handleEvent(int temp, int presser);
}
 class MetoSten implements Observed{
    int temperature;
    int pressur;

     public void setTemperature(int t, int p) {
         this.temperature = t;
         this.pressur = p;
         notifyOObservers();
     }
     List<Observer>observers = new ArrayList<>();

     @Override
     public void addObserver(Observer o) {
         observers.add(o);
     }

     @Override
     public void removeObserver(Observer o) {
            observers.remove(o);
     }

     @Override
     public void notifyOObservers() {
        for (Observer  o : observers){
            o.handleEvent(temperature, pressur);
        }
     }
 }
 class User implements Observer{

     @Override
     public void handleEvent(int temp, int presser) {
         System.out.println("Темтература изменилась. Температура= " + temp +" "+"Давление= "+presser + "." );
     }
 }
