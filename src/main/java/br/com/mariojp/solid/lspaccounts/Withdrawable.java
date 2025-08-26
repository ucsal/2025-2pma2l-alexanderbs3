package br.com.mariojp.solid.lspaccounts;

public interface Withdrawable {
    void withdraw(double amount);
    boolean canWithdraw(double amount);
}
