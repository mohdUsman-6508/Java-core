package CreationalDesignPattern.ObserverDP;

public class Main {
    public static void main(String[] args) {

        YoutubeChannel channel = new YoutubeChannel();
        Subscriber newton = new Subscriber("Newton");
        Subscriber issac = new Subscriber("Issac");
        Subscriber alice = new Subscriber("Alice");
        channel.subscribe(newton);
        channel.subscribe(issac);
//        channel.unsubscribe(newton);

        channel.videoUploadNotification("Quantum Computer: Revolution Begin");
        channel.videoUploadNotification("Hello! World");

    }
}
