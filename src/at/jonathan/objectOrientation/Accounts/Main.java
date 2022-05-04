package at.jonathan.objectOrientation.Accounts;

public class Main {

    public static void main(String[] args) {

        BaseAccount b1 = new BaseAccount(1000);

        b1.deposit(600);
        b1.withdraw(850.34);
        b1.showBalance();



    }
}
