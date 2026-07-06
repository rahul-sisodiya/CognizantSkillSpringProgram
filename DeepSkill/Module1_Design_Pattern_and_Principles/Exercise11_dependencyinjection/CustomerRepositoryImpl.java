package JavaFSE.DeepsKilling.Module1_Design_Patterns_and_Principles.Exercise11_dependencyinjection;

public class CustomerRepositoryImpl implements CustomerRepository {

    @Override
    public String findCustomerById(int id) {

        if(id == 101) {
            return "John";
        }

        return "Customer Not Found";
    }
}