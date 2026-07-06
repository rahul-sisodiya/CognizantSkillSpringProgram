package JavaFSE.DeepsKilling.Module1_Design_Patterns_and_Principles.Exercise07_observer;

public interface Stock {

    void registerObserver(Observer observer);

    void deregisterObserver(Observer observer);

    void notifyObservers();
}