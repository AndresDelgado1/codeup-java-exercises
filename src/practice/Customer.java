package practice;

public class Customer {
    public static void main(String[] args) {
        Customer customer = new Customer("Andres", 1000, "email");
        System.out.println(customer.getEmail());
        System.out.println(customer.getName());

//        this is a reference, this instance and the one above are both pointing to the same object in memory.
//        printing "anotherCustomer" will print the same thing as "customer"
        Customer anotherCustomer = customer;
    }
    private String name;
    private double creditLimit;
    private String email;


    public Customer(String name, String email) {
        this(name, 2000, email);
    }

    public Customer (String name, double creditLimit, String email){
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }






    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
