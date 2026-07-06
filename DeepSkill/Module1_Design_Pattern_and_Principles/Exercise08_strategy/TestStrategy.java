package JavaFSE.DeepsKilling.Module1_Design_Patterns_and_Principles.Exercise08_strategy;

public class TestStrategy {

    public static void main(String[] args) {

        PaymentContext context = new PaymentContext();

        context.setPaymentStrategy(new CreditCardPayment());
        context.executePayment(5000);

        context.setPaymentStrategy(new PayPalPayment());
        context.executePayment(2500);
    }
}