package kata.account;

public interface IAccount {
    void deposit(int amount);
    void withdraw(int amount);
    String printStatement();
    int getBalance();
}