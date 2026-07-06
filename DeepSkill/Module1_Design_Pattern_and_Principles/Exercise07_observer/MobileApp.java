package JavaFSE.DeepsKilling.Module1_Design_Patterns_and_Principles.Exercise07_observer;

public class MobileApp implements Observer {

    @Override
    public void update(String stockName, double price) {

        System.out.println(
                "Mobile App Notification -> "
                        + stockName
                        + " Price Updated: Rs."
                        + price);
    }
}