package module08._06polymorphism;

public class CheckingAccount extends Account{
    double overdraftFee;

    public CheckingAccount(String name, double balance, double overdraftFee) {
        super(name,balance);
        this.overdraftFee = overdraftFee;
    }
   
    @Override
   public double withdraw(double amount) {
        if (amount <= this.getBalance() + 50) {
            this.setBalance(this.getBalance() - amount - overdraftFee);
        } else {
            this.setBalance(0);

        }
   }
    

}
