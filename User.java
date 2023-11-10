import java.util.Observable;
import java.util.Observer;

class User implements Observer {
    private String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("User " + name + ": Order Status - " + arg);
    }
}
