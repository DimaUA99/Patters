package UA_Ka4an.com;

public class Main {

    public static void main(String[] args) {
        Game game = new Game();
        game.set("LVL_1", 5);
        System.out.println(game);

        File file = new File();
        file.setSave(game.save());

        game.set("LVL_2", 15);
        System.out.println(game);

        System.out.println("Загружаемся");
        game.load(file.getSave());
        System.out.println(game);
    }
}
class Game{
    private String  level;
    private int sumCandy;

    public void set(String level, int sumCandy){
        this.level = level;
        this.sumCandy = sumCandy;

    }
    public void load(Save save){
        level = save.getLevel();
        sumCandy = save.getSumCandy();
    }
    public  Save save(){
        return new Save(level,sumCandy);
    }

    @Override
    public String toString() {
        return "Game{" +
                "level='" + level + '\'' +
                ", sumCandy=" + sumCandy +
                '}';
    }
}
class Save{
    private final String  level;
    private final int sumCandy;
    public Save(String level, int sumCandy) {
        this.level = level;
        this.sumCandy = sumCandy; }
    public String getLevel() {
        return level;
    }
    public int getSumCandy() {
        return sumCandy;
    }
}
class File{
    Save save;

    public Save getSave() {
        return save;
    }

    public void setSave(Save save) {
        this.save = save;
    }
}