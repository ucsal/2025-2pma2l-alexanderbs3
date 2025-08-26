package br.com.mariojp.solid.lspaccounts;

public class BankService {

    public void processWithdrawal(Account account, double amount) {
        if (account instanceof Withdrawable) {
            Withdrawable withdrawableAccount = (Withdrawable) account;
            if (withdrawableAccount.canWithdraw(amount)) {
                withdrawableAccount.withdraw(amount);
            } else {
                System.out.println("Withdrawal failed: Insufficient funds");
            }
        } else {
            System.out.println("Withdrawal not supported for this account type");
        }
    }

    // Method that explicitly requires withdrawable accounts (different name to avoid ambiguity)
    public void processWithdrawalFromWithdrawable(Withdrawable account, double amount) {
        if (account.canWithdraw(amount)) {
            account.withdraw(amount);
        } else {
            System.out.println("Withdrawal failed: Insufficient funds");
        }
    }

    public void processDeposit(Account account, double amount) {
        account.deposit(amount);
    }
}