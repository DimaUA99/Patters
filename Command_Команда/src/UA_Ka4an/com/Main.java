package UA_Ka4an.com;

public class Main {

    public static void main(String[] args) {
        Convyer convyer = new Convyer();
        User user = new User(new CreatCandyCommand(convyer), new WropCandyCommand(convyer), new OffCommand(convyer));
        user.startCreatCandy();
        user.startWrapCandy();
        user.stopOff();
    }
}
interface Command{
    void execute();
}
class Convyer{
    void creatCandy(){
        System.out.println("Зделать канфету");
    }
    void WropCandy(){
        System.out.println("Завернуть канфету");
    }
    void off(){
        System.out.println("Прекратить роботу");
    }
}

class CreatCandyCommand implements Command{
Convyer convyer;

    public CreatCandyCommand(Convyer convyer) {
        this.convyer = convyer;
    }
    @Override
    public void execute() {
        convyer.creatCandy();
    }
}

class WropCandyCommand implements Command{
Convyer convyer;
    public WropCandyCommand(Convyer convyer) {
        this.convyer = convyer;
    }

    @Override
    public void execute() {
        convyer.WropCandy();
    }
}
class OffCommand implements Command{
Convyer convyer;
    public OffCommand(Convyer convyer) {
        this.convyer = convyer;
    }

    @Override
    public void execute() {
        convyer.off();
    }
}

class User {
    Command creatCandy;
    Command wrapCandy;
    Command off;

    public User(Command creatCandy, Command wrapCandy, Command off) {
        this.creatCandy = creatCandy;
        this.wrapCandy = wrapCandy;
        this.off = off;
    }

    void startCreatCandy(){
        creatCandy.execute();
    }
    void startWrapCandy(){
        wrapCandy.execute();
    }
    void stopOff(){
        off.execute();
    }
}
