package JavaFSE.DeepsKilling.Module1_Design_Patterns_and_Principles.Exercise08_strategy;

public class PayPalPayment implements PaymentStrategy {

    @Override
    public void pay(double amount) {
        System.out.println("Paid Rs." + amount + " using PayPal");
    }
}