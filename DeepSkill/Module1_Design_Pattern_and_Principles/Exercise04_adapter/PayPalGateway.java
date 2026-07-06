package JavaFSE.DeepsKilling.Module1_Design_Patterns_and_Principles.Exercise04_adapter;

public class PayPalGateway {
    public void payWithPayPal(double amount) {
        System.out.println("Paid Rs." + amount + " using PayPal Gateway");
    }
}
