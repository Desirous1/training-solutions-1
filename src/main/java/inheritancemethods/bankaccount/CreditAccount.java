package inheritancemethods.bankaccount;

public class CreditAccount extends DebitAccount {
    private long overdraftLimit;

    public CreditAccount(String accountNumber, long balance, long overdraftLimit) {
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }

    public boolean transaction(long amount) {
        return false;
    }

    public long getOverdraftLimit() {
        return overdraftLimit;
    }
}
