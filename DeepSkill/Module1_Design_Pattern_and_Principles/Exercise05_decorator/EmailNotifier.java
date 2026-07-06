package JavaFSE.DeepsKilling.Module1_Design_Patterns_and_Principles.Exercise05_decorator;

public class EmailNotifier implements Notifier {

    @Override
    public void send(String message) {
        System.out.println("Email Notification: " + message);
    }
}