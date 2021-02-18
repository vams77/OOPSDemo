class Account
{
    String name;
    protected double balance;
    
    public Account(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }
    public String getName() {
        return name;
    }
    public double getBalance() {
        return balance;
    }
    void deposit(double amt) {
        balance += amt;
        System.out.println("Depositing: " + amt);
        }
    void withdraw(double amt) {
        balance -= amt;
        System.out.println("WithDrawing: " + amt);
    }
}

 

class SavingsAccount extends Account{
    double intrestRate;

 

    public SavingsAccount(String str,double bal,double intrestRate) {
        super(str, bal);
        this.intrestRate = intrestRate;
    }

 

    public double getIntrestRate() {
        return intrestRate;
    }

 

}
class CheckingAccount extends Account{
    double overDraft;
    public CheckingAccount(String str,double bal,double overDraft) {
        super(str, bal);
        this.overDraft = overDraft;
    }
    void withdraw(double amt) {
           System.out.println("Overdraft Amount: " + overDraft);
           if (amt <= balance) {
              balance -= amt;
              System.out.println("Withdrawing: " + amt);
            } else if ((amt > balance) && (amt > (balance + overDraft))) {
               System.out.println("Sorry! You cannot withdraw");
            } else {
               double result = amt - balance;
               overDraft -= result;
               balance = 0;
               System.out.println("Withdrawing: " + amt);
               System.out.println("Current Overdraft Amount: "
               + overDraft);
            }
        }
}

 

public class AccountTest {

 

    public static void main(String[] args) {
        SavingsAccount sAccountObj = new SavingsAccount("John", 500, 4);
        System.out.println("\nSavings Account Details");
        System.out.println("------------------------");
        System.out.println("" + sAccountObj.getName()
        + " has an initial Balance of: " + sAccountObj.getBalance());
        sAccountObj.deposit(200);
        sAccountObj.withdraw(200);
        System.out.println("" + sAccountObj.getName()
        + " at the end of transaction has a Balance of: "
        + sAccountObj.getBalance());

 

        System.out.println("\nChecking Account Details");
        System.out.println("------------------------");

 

        CheckingAccount cAccountObj = new CheckingAccount("Stephen", 200, 200);
        System.out.println("" + cAccountObj.getName()
        + " has an initial Balance of: " + cAccountObj.getBalance());
        cAccountObj.deposit(200);
        cAccountObj.withdraw(700);
        System.out.println("" + cAccountObj.getName()
        + " at the end of transaction has a Balance of: "
        + cAccountObj.getBalance());
    }

 

}
