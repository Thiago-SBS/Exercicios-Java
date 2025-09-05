package ExerciciosDeClasses.Ex012;

public class InvestmentAccount {
    private double balance;
    private double interest;

    public InvestmentAccount(double balance, double interest) {
        this.balance = balance;
        this.interest = interest;
    }

    public void addInterest() {
        balance += balance * (interest / 100);
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getInterest() {
        return interest;
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }
}
