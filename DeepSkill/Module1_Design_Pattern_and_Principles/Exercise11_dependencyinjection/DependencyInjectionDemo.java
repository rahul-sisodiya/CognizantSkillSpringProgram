package JavaFSE.DeepsKilling.Module1_Design_Patterns_and_Principles.Exercise11_dependencyinjection;

public class DependencyInjectionDemo {

    public static void main(String[] args) {

        CustomerRepository repository =
                new CustomerRepositoryImpl();

        CustomerService service =
                new CustomerService(repository);

        service.getCustomer(101);
    }
}