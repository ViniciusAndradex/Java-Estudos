import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class DemoAccount {
    public static void main(String[] args) {
        Account acc = new Account(1001, "Alex", 0.0);
        BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);

        //Upcasting
        Account acc1 = bacc;
        Account acc2 = new SavingsAccount(1004, "Ana",0.0, 0.01);

        //Downcasting
        SavingsAccount acc4 = (SavingsAccount) acc2;
        acc4.deposit(822.00);
        if (acc2 instanceof BusinessAccount) {
            SavingsAccount acc5 = (SavingsAccount) acc2;
        }

        if (bacc instanceof BusinessAccount) {
            BusinessAccount bacc1 = (BusinessAccount) bacc;
            System.out.println(bacc1.getLoanLimit());
        }
    }
}
