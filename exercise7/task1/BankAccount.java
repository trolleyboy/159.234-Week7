package exercise7.task1;

/**
 * BankAccount
 */
public class BankAccount {

    // attributes
    private double balance;

    // constructors
    /**
     * @param balance the starting balance of the account
     */
    public BankAccount(double balance) {
        setBalance(balance);
    }

    // methods
    // getters/setters
    /**
     * @return the balance
     */
    public double getBalance() {
        return balance;
    }

    /**
     * @param balance the balance to set.
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    // functions
    /**
     * A method to debit an amount from the current balance.
     * 
     * @param debitAmount the amount to debit from the balance.
     * @throws TransactionException 
     */
    public void debit(double debitAmount) throws TransactionException {

        if (getBalance() < debitAmount) {
            throw new TransactionException("Insufficient funds");
        } else {
            setBalance(getBalance() - debitAmount);
            System.out.println("New Balance: " + getBalance());
        }

    }

}