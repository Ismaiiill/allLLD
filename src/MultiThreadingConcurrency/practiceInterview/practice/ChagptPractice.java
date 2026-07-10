package src.MultiThreadingConcurrency.practiceInterview.practice;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ChagptPractice {
    public static void main(String[] args) {
        //all the core java,lld,multithreading and concurrency related practice
        //core java
        List<Transaction> transactions = new ArrayList<>();
        transactions = List.of(
                new Transaction("U1", "500", 1000,500),
                new Transaction("U2", "300", 2000,300),
                new Transaction("U1", "900", 3000,900),
                new Transaction("U3", "400", 1000,400),
                new Transaction("U2", "100", 4000,100)

        );
        Map<String, Transaction> transactionMap = new HashMap<>();
        transactionMap=transactions
                .stream()
                .collect(Collectors.toMap(
                        Transaction::getId,
                        transaction -> transaction,
                        ChagptPractice::functional,
                        HashMap::new
                ));
        List list=transactions.stream().toList();
        List list2=transactions.stream().filter((s)->s.createdAt>1000).toList();
        for (Transaction transaction:transactions){
            transactionMap.merge(transaction.getId(),
                    transaction,
                    ChagptPractice::functional);
        }
        System.out.println(transactionMap);
    }
    private static Transaction functional(Transaction existing,Transaction duplicate){
        if(duplicate.getAmount()>=existing.getAmount()) return duplicate;
        if(duplicate.getCreatedAt()>=existing.getCreatedAt()){
            return duplicate;
        }
        return existing;
    }
}

class Transaction {
    String id;
    String logs;
    int amount;
    int createdAt;

    public Transaction(String id, String logs, int amount,int createdAt) {
        this.amount = amount;
        this.id = id;
        this.logs = logs;
        this.createdAt=createdAt;
    }

    public String getId() {
        return id;
    }

    public String getLogs() {
        return logs;
    }

    public void setLogs(String logs) {
        this.logs = logs;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(int createdAt) {
        this.createdAt= createdAt;
    }
    @Override
    public String toString(){
        return getId() + " " + getAmount();
    }

}