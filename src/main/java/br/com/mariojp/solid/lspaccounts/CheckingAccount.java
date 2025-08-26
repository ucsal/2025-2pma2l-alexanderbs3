package br.com.mariojp.solid.lspaccounts;

public class CheckingAccount extends Account implements Withdrawable {
    @Override
    public void withdraw(double amount) {
        if (!canWithdraw(amount)) {
            throw new IllegalArgumentException("Saldo insuficiente");
        }
        this.balance -= amount;
    }

    @Override
    public boolean canWithdraw(double amount) {
        return balance >= amount;
    }
}