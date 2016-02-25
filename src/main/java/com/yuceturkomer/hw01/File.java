package com.yuceturkomer.hw01;

/**
 * File class extended from Document
 */
public class File extends Document {
    /**
     * File class' constructor. Also sets the docType.
     * @param docName Sets the docname as this.
     */
    public File(String docName) {
        super(docName);
        docType=getClass().getSimpleName();
    }
}
