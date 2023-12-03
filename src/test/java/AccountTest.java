
import account.Account;
import account.IAccount;
import account.NotEnoughMoneyException;
import org.junit.jupiter.api.Test;

public class AccountTest {

    IAccount account = new Account();

    @Test
    public void shouldIncreaseBalance()
    {
        int balance = account.getBalance();
        int amountToAdd = 100;
        account.deposit(amountToAdd);
        assert account.getBalance() == balance + amountToAdd;
    }

    @Test
    public void shouldDecreaseBalance()
    {

    }

    @Test()
    public void shouldThrowExceptionIfAmountIsBiggerThanBalance()
    {

    }

    @Test
    public void shouldPrintHistoryEmpty()
    {

    }

    @Test
    public void shouldPrintFullHistory()
    {

    }
}
