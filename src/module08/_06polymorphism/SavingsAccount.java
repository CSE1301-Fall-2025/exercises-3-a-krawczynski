package module08._06polymorphism;

public class SavingsAccount extends Account{
    double interestRate;

    public SavingsAccount(String name, double balance, double interestRate) {
        super(name, balance);
        this.interestRate = interestRate;
    }

    public void compoundInterest(double interestRate, double balance) {
        super.deposit(interestRate*super.getBalance());
    }

}
