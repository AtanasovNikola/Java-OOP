package tdd.chainBlock;

import java.util.*;
import java.util.stream.Collectors;

public class ChainBlockImpl implements ChainBlock {
    private Map<Integer, Transaction> transactionMap;

    public ChainBlockImpl() {
        this.transactionMap = new LinkedHashMap<>();
    }

    public int getCount() {
        return this.transactionMap.size();
    }

    public void add(Transaction transaction) {
        this.transactionMap.putIfAbsent(transaction.getId(), transaction);
    }

    public boolean contains(Transaction transaction) {
        return this.contains(transaction.getId());
    }

    public boolean contains(int id) {
        return this.transactionMap.containsKey(id);
    }

    public void changeTransactionStatus(int id, TransactionStatus newStatus) {
        Transaction transaction = this.getById(id);
        transaction.setStatus(newStatus);

    }

    public void removeTransactionById(int id) {
        //throw exception if no such transaction
        if (!this.contains(id)) {
            throw new IllegalArgumentException();
        }
        //remove transaction
        this.transactionMap.remove(id);
    }

    public Transaction getById(int id) {
        if (!this.contains(id)) {
            throw new IllegalArgumentException();
        }
        return this.transactionMap.get(id);
    }

    public Iterable<Transaction> getByTransactionStatus(TransactionStatus status) {

        List<Transaction> filteredTransactions = transactionMap.values()
                .stream().filter(t -> t.getStatus().equals(status)).toList();
        if (filteredTransactions.size() == 0) {
            throw new IllegalArgumentException();
        }

        return filteredTransactions
                .stream()
                .sorted(Comparator.comparing(Transaction::getAmount).reversed())
                .collect(Collectors.toList());
    }

    public Iterable<String> getAllSendersWithTransactionStatus(TransactionStatus status) {
        return null;
    }

    public Iterable<String> getAllReceiversWithTransactionStatus(TransactionStatus status) {
        return null;
    }

    public Iterable<Transaction> getAllOrderedByAmountDescendingThenById() {
        return null;
    }

    public Iterable<Transaction> getBySenderOrderedByAmountDescending(String sender) {
        return null;
    }

    public Iterable<Transaction> getByReceiverOrderedByAmountThenById(String receiver) {
        return null;
    }

    public Iterable<Transaction> getByTransactionStatusAndMaximumAmount(TransactionStatus status, double amount) {
        return null;
    }

    public Iterable<Transaction> getBySenderAndMinimumAmountDescending(String sender, double amount) {
        return null;
    }

    public Iterable<Transaction> getByReceiverAndAmountRange(String receiver, double lo, double hi) {
        return null;
    }

    public Iterable<Transaction> getAllInAmountRange(double lo, double hi) {
        return this.transactionMap
                .values()
                .stream()
                .filter(transaction -> transaction.getAmount() >= lo && transaction.getAmount() <= hi)
                .collect(Collectors.toList());
    }

    public Iterator<Transaction> iterator() {
        return null;
    }
}