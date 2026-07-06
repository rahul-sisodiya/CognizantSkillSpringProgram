package JavaFSE.DeepsKilling.Module1_Design_Patterns_and_Principles.Exercise11_dependencyinjection;

public class CustomerService {

    private CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public void getCustomer(int id) {

        String customerName =
                customerRepository.findCustomerById(id);

        System.out.println("Customer ID : " + id);
        System.out.println("Customer Name : " + customerName);
    }
}