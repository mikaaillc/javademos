import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Customer> customers =new ArrayList<Customer>();

        customers.add(new Customer(1,"mikail","celik"));
        customers.add(new Customer(2,"ali","veli"));
        customers.add(new Customer(3,"veli","ali"));

        customers.remove(new Customer(1,"mikail","celik"));
        for (Customer customer:customers){
            System.out.println(customer.firstName);
        }

    }
}
