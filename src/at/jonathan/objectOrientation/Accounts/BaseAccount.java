package at.jonathan.objectOrientation.Accounts;

public class BaseAccount {

    private double balance;

    public double getBalance() {
        return balance;
    }

    public BaseAccount(double balance) {
        this.balance = balance;
    }

    public void deposit( double depositAmount){
        this.balance = this.balance + depositAmount;
        System.out.println(depositAmount + "€ wurden auf das Konto eingezahlt. Neuer Kontostand: " + this.balance + "€");
    }

    public void withdraw( double withdrawAmount){
        this.balance = this.balance - withdrawAmount;
        System.out.println(withdrawAmount + "€ wurden von dem Konto abgehoben. Neuer Kontostand: " + this.balance + "€");
    }

    public void showBalance(){
        System.out.println("Derzeitiger Kontostand: " + this.balance + "€");
    }

    


}
