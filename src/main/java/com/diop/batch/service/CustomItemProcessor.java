package com.diop.batch.service;

import com.diop.batch.model.Transaction;
import org.springframework.batch.item.ItemProcessor;

public class CustomItemProcessor implements ItemProcessor<Transaction, Transaction> {

    public Transaction process(Transaction item) {
        System.out.println("Processing..." + item);
        return item;
    }
}