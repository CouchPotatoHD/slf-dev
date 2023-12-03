package account;

public interface IAccount {
    void deposit(int amount);
    void withdraw(int amount);
    void printStatement();
    int getBalance();
}