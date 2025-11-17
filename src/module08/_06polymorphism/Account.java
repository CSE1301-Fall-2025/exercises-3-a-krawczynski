package module08._06polymorphism;

public class Account 
{
    private String name;
    private double balance;

    public Account(String name, double balance)
    {
       this.name = name;
       this.balance = balance;
    }
    
    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double withdraw(double amount) {
        if (amount <= this.balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + ". Balance: " + balance);
            return balance; }
        else {
            this.balance  = 0;
            return this.balance;
        }
    }


    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount + ". Balance: " + balance);
    }
    public static void main(String[] args)
    {
        
    }
}
