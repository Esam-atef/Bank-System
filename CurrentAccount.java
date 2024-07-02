public class CurrentAccount extends BankAccount
{
    private double overdraftLimit;

    public CurrentAccount(String accountNumber, double balance, String accountHolderName, double overdraftLimit)
    {
        super(accountNumber, balance, accountHolderName);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount)
    {
        if(amount>0 && amount<getBalance()+overdraftLimit)
        {
            super.withdraw(amount);
        }
        else
        {
            System.out.println("Insufficient funds");
        }
    }
    public void displayAccountDetails()
    {
        super.displayAccountDetails();
        System.out.println("Overdraft Limit: " + overdraftLimit);
    }
}
