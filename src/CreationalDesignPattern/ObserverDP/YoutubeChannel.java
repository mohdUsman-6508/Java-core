package CreationalDesignPattern.ObserverDP;

import java.util.ArrayList;
import java.util.List;

public class YoutubeChannel implements Subject {

    List<Observer> channel = new ArrayList<>();

    public List<Observer> getList() {
        return this.channel;
    }

    @Override
    public void subscribe(Observer obs) {
        channel.add(obs);
    }

    @Override
    public void unsubscribe(Observer obs) {
        channel.remove(obs);

    }

    @Override
    public void videoUploadNotification(String name) {
        for (Observer obs : channel) {
            obs.notified(name);
        }
    }
}
