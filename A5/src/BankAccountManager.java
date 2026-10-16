class BankAcc {
    private String ownerName;
    private String accNum;
    private double balance;
    private static int totalAccounts = 0;

    public BankAcc(String ownerName, String accNum, double iniBalance) {
        this.ownerName = ownerName;
        this.accNum = accNum;

        if (iniBalance < 0) {
            this.balance = 0.0;
        } else {
            this.balance = iniBalance;
        }
        totalAccounts++;
    }

    public  String getOwnerName() {
        return ownerName;
    }

    public String getAccNum() {
        return accNum;
    }

    public double getBalance() {
        return balance;
    }

    public static int getTotalAccounts() {
        return totalAccounts;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public boolean withdraw(double amount) {
        if (amount < 0 && balance <= amount) {
            balance -= amount;
            return true;
        }
        return false;
    }
}
public class BankAccountManager {
    static void main() {

        BankAcc acc1 = new BankAcc("Carl", "001", 25000);
        BankAcc acc2 = new BankAcc("Iane", "002", 13000);
        BankAcc acc3 = new BankAcc("Kate", "003", 10000);

        acc1.deposit(1500);
        boolean withdraw1 = acc2.withdraw(1000);
        boolean withdraw2 = acc3.withdraw(2000);

        System.out.println("Account 1: " + acc1.getOwnerName());
        System.out.println("Balance: " + acc1.getBalance());
        System.out.println();

        System.out.println("Account 2: " + acc2.getOwnerName());
        System.out.println("Withdrawal successful: " + withdraw1);
        System.out.println("Balance: " + acc2.getBalance());
        System.out.println();

        System.out.println("Account 3: " + acc3.getOwnerName());
        System.out.println("Withdrawal successful: " + withdraw2);
        System.out.println("Balance: " + acc3.getBalance());
        System.out.println();

        System.out.println("Total accounts: " + BankAcc.getTotalAccounts());

    }
}
