package UA_Ka4an.com;

public class Main {

    public static void main(String[] args) {
        BoxSweets bs = new BoxSweets();

        Iterator iterator =bs.getIterator();

        while (iterator.DoesFollowingSweetness()){
            System.out.println((String)iterator.next());
        }
    }
}
interface Iterator{
    boolean DoesFollowingSweetness();
    Object next();
}

interface Agregat{
    Iterator getIterator();
}


class BoxSweets implements  Agregat{
    String[] capacity = {"Канфета", "Батончик", "Чупа-чупс", "Ванильное-печенье", "Шоколадка"};

    @Override
    public Iterator getIterator() {
        return new CapacityIterator();
    }
    class CapacityIterator implements Iterator{
        int index = 0;
        @Override
        public boolean DoesFollowingSweetness() {
            if (index <capacity.length) {
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            return capacity[index++];
        }
    }
}
