package com.diop.batchtesting.service;

import com.diop.batchtesting.model.Book;
import com.diop.batchtesting.model.BookRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;

public class BookItemProcessor implements ItemProcessor<BookRecord, Book> {

    private static Logger LOGGER = LoggerFactory.getLogger(BookItemProcessor.class);

    @Override
    public Book process(BookRecord item) throws Exception {
        Book book = new Book();
        book.setAuthor(item.getBookAuthor());
        book.setName(item.getBookName());
        LOGGER.info("Processing book {}", book);
        return book;
    }

}