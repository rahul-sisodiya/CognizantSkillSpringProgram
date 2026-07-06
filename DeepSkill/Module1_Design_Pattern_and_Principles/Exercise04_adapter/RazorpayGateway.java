package JavaFSE.DeepsKilling.Module1_Design_Patterns_and_Principles.Exercise04_adapter;

public class RazorpayGateway {

    public void makeRazorPayment(double amount) {
        System.out.println("Paid Rs." + amount + " using Razorpay Gateway");
    }
}