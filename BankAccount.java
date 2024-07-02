public class BankAccount
{
    private String accountNumber;
    private double balance;
    private String accountHolderName;

    public BankAccount(String accountNumber, double balance, String accountHolderName)
    {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountHolderName = accountHolderName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }
    public void deposite(double amount)
    {
        if(amount>0)
        {
          balance += amount;
          System.out.println("Deposited " + amount + " to " + accountHolderName);
        }
        else
        {
            System.out.println("Insufficient Funds");
        }
    }
    public void withdraw(double amount)
    {
        if(amount>0 && amount<=balance)
        {
            balance -= amount;
            System.out.println("Withdrawn " + amount + " to " + accountHolderName);
        }
        else
        {
            System.out.println("Insufficient Funds");
        }
    }
    public void displayAccountDetails()
    {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Balance: " + balance);
    }

}
