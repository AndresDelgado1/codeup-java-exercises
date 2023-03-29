package practice;

public class Account {

    public static void main(String[] args) {
        Account bobsAccount = new Account();
        bobsAccount.withdrawFunds(100.0);
        bobsAccount.depositFunds(250);
        bobsAccount.withdrawFunds(50);

        Account andresAccount = new Account("12345", 200, "Andres", "andres@gmail.com", "713-222-222" );
        System.out.println(andresAccount.getNumber());
    }
    private String number;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String customerPhone;

    public Account() {
        System.out.println("empty constructor called");
    }

    public Account(String number, double balance, String customerName, String customerEmail, String customerPhone) {
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerPhone = customerPhone;
    }


    public void depositFunds(double depositAmount) {
        balance += depositAmount;
        System.out.println("deposit of $" + depositAmount + " made. New balance is $" + balance);
    }

    public void withdrawFunds(double withdrawalAmount) {
        if (balance - withdrawalAmount < 0) {
            System.out.println("insufficient funds! You only have $" + balance);
        } else {
            balance -= withdrawalAmount;
            System.out.println("withrawal of $" + withdrawalAmount + " processed, Remaining balance = $" + balance);
        }
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }
}
