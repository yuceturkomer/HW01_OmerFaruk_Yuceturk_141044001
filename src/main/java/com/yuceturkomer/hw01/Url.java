package com.yuceturkomer.hw01;

/**
 * Url class extended from Document
 */
public class Url extends Document {
    /**
     * Url class' constructor. Also sets the docType.
     * @param docName Sets the docname as this.
     */
    public Url(String docName) {
        super(docName);
        docType = getClass().getSimpleName();
    }
}
