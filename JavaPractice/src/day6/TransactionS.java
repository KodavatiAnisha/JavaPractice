package day6;

public class TransactionS {

    record Transaction(String transactionId, double amount, String currency) {
    }

    public static void main(String[] args) {

        var tx = new Transaction("TX-9081", 450.75, "INR");

        System.out.println("Record Ledger Entry: " + tx);
    }
}