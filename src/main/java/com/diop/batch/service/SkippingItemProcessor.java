package com.diop.batch.service;

import com.diop.batch.model.Transaction;
import org.springframework.batch.item.ItemProcessor;

public class SkippingItemProcessor implements ItemProcessor<Transaction, Transaction> {

    @Override
    public Transaction process(Transaction transaction) {

        System.out.println("SkippingItemProcessor: " + transaction);

        if (transaction.getUsername() == null || transaction.getUsername().isEmpty()) {
            throw new MissingUsernameException();
        }

        double txAmount = transaction.getAmount();
        if (txAmount < 0) {
            throw new NegativeAmountException(txAmount);
        }

        return transaction;
    }
}
