package account;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Account implements IAccount {

    private int balance = 0;
    private List<Operation> operations = new ArrayList<>();

    @Override
    public void deposit(int amount) {

        balance+=amount;
        operations.add(new Operation(LocalDate.now(), OperationTypes.DEPOSIT, amount, balance));

    }

    @Override
    public void withdraw(int amount) {

        if (balance-amount < 0){
            throw new NotEnoughMoneyException(amount, balance);
        }

        balance-=amount;

        operations.add(new Operation(LocalDate.now(), OperationTypes.WITHDRAWAL, amount, balance));

    }

    @Override
    public void printStatement() {

        for (Operation operation : operations) {

        }

    }

    @Override
    public int getBalance() {
        return balance;
    }

    private class Operation{

        private LocalDate date;
        private OperationTypes operationType;
        private int amount;
        private int balance;

        public Operation(LocalDate date, OperationTypes operationType, int amount, int balance) {
            this.date = date;
            this.operationType = operationType;
            this.amount = amount;
            this.balance = balance;
        }

        @Override
        public String toString() {
            return "Operation{" +
                    "date=" + date.toString() +
                    ", operationType=" + operationType.type +
                    ", amount=" + amount +
                    ", balance=" + balance +
                    '}';
        }
    }

    enum OperationTypes{
        DEPOSIT("+"), WITHDRAWAL("-");

        private final String type;

        OperationTypes(String s) {
            this.type = s;
        }
    }
}
