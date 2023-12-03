package account;

public class NotEnoughMoneyException extends RuntimeException {
    public NotEnoughMoneyException(int amount, int balance) {
        super(String.format("You're trying to withdraw %s, you are poor, you only have this much %s", amount, balance));
    }
}
