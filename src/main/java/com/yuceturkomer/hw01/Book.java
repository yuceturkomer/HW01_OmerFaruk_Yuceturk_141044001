package com.yuceturkomer.hw01;

/**
 * Book class extended from Document
 *
 */
public class Book extends Document {
    /**
     * Book class' constructor. Also sets the docType.
     * @param docName Sets the docname as this.
     */
    public Book(String docName) {
        super(docName);
        docType=getClass().getSimpleName();
    }
}
