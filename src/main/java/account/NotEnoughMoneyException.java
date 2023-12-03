package kata.account;

public class NotEnoughMoneyException extends RuntimeException {
    public NotEnoughMoneyException(int balance, int amount) {
        super(String.format("You're trying to withdraw %s, you are poor, you only have this much %s", amount, balance));
    }
}
