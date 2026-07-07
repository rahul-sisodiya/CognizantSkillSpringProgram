package JavaFSE.DeepsKilling.Module2_Data_Structures_and_Algorithms.exercise03.sorting;

public class Order {

    int orderId;
    String customerName;
    double totalPrice;

    public Order(int orderId,
                 String customerName,
                 double totalPrice) {

        this.orderId = orderId;
        this.customerName = customerName;
        this.totalPrice = totalPrice;
    }

    @Override
    public String toString() {

        return "Order ID=" + orderId +
                ", Customer=" + customerName +
                ", Total Price=" + totalPrice;
    }
}