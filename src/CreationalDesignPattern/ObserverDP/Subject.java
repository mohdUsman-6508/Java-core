package CreationalDesignPattern.ObserverDP;

interface Subject {

    void subscribe(Observer obs);

    void unsubscribe(Observer obs);

    void videoUploadNotification(String name);
}
