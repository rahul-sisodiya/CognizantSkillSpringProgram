package JavaFSE.DeepsKilling.Module1_Design_Patterns_and_Principles.Exercise04_adapter;

public class PayPalAdapter implements PaymentProcessor {

    private PayPalGateway payPalGateway;

    public PayPalAdapter(PayPalGateway payPalGateway) {
        this.payPalGateway = payPalGateway;
    }

    @Override
    public void processPayment(double amount) {
        payPalGateway.payWithPayPal(amount);
    }
}