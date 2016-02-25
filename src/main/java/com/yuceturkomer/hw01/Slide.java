package com.yuceturkomer.hw01;

/**
 * Slide class extended from Document
 */
public class Slide extends Document {
    /**
     * Book class' constructor. Also sets the docType.
     *
     * @param docName Sets the docname as this.
     */
    public Slide(String docName) {
        super(docName);
        docType = getClass().getSimpleName();
    }
}
