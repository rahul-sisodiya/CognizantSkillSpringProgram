package JavaFSE.DeepsKilling.Module1_Design_Patterns_and_Principles.Exercise04_adapter;

public class RazorpayAdapter implements PaymentProcessor {

    private RazorpayGateway razorpayGateway;

    public RazorpayAdapter(RazorpayGateway razorpayGateway) {
        this.razorpayGateway = razorpayGateway;
    }

    @Override
    public void processPayment(double amount) {
        razorpayGateway.makeRazorPayment(amount);
    }
}