package exercise7.task1;

public class Runner {

    public static void main(String[] args) {

        BankAccount account = new BankAccount(100.00);

        try {
            while (account.getBalance() >= 0) {
                account.debit(26.00);
            }
        } catch (TransactionException e) {
            e.printStackTrace();
        } finally {
            System.out.println("The final block");
        }

    }

}
