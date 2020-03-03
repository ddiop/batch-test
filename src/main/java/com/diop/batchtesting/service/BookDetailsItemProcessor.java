package com.diop.batchtesting.service;

import com.diop.batchtesting.model.BookDetails;
import com.diop.batchtesting.model.BookRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;

public class BookDetailsItemProcessor implements ItemProcessor<BookRecord, BookDetails> {

    private static Logger LOGGER = LoggerFactory.getLogger(BookDetailsItemProcessor.class);

    @Override
    public BookDetails process(BookRecord item) throws Exception {
        BookDetails bookDetails = new BookDetails();
        bookDetails.setBookFormat(item.getBookFormat());
        bookDetails.setBookISBN(item.getBookISBN());
        bookDetails.setPublishingYear(item.getPublishingYear());
        bookDetails.setBookName(item.getBookName());
        LOGGER.info("Processing bookdetails {}", bookDetails);
        return bookDetails;
    }

}
