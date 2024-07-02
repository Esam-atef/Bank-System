public class SavingAccount extends BankAccount
{
    private double interestRate;

    public SavingAccount(String accountNumber, double balance, String accountHolderName, double interestRate)
    {
        super(accountNumber, balance, accountHolderName);
        this.interestRate = interestRate;
    }
    public void addInterst()
    {
        double interst=interestRate * getBalance()/100;
        super.deposite(interst);
        System.out.println("Interest added: " + interst);
    }
    public void displayAccountDetails()
    {
        super.displayAccountDetails();
        System.out.println("Interest Rate: " + interestRate);
    }
}
