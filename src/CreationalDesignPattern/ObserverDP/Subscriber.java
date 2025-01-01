package CreationalDesignPattern.ObserverDP;

public class Subscriber implements Observer {

    String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void notified(String videoName) {
        System.out.println("Hello "+this.name+", "+videoName + " is out, watch!!!");
    }
}
