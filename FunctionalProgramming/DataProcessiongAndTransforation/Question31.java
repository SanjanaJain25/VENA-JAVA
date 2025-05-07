package FunctionalProgramming.DataProcessiongAndTransforation;
import java.util.*;
import java.util.stream.*;

class Transaction {
    double amount;
    String type;

    Transaction(double amount, String type) {
        this.amount = amount;
        this.type = type;
    }

    public double getAmount() {
        return amount;
    }

    public String getType() {
        return type;
    }
}



public class Question31 {
    public static void main(String[] args) {
        List<Transaction> transactions = Arrays.asList(
                new Transaction(1000, "DEBIT"),
                new Transaction(500, "CREDIT"),
                new Transaction(750, "DEBIT"),
                new Transaction(300, "CREDIT")
        );

        double totalDebit = transactions.stream()
                .filter(txn -> "DEBIT".equals(txn.getType()))
                .mapToDouble(Transaction::getAmount)
                .sum();

        System.out.println("Total DEBIT amount: " + totalDebit);
    }
}
