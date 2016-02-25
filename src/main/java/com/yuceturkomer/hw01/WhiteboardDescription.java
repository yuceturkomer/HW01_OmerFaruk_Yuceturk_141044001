package com.yuceturkomer.hw01;

/**
 * Document class extended from Document
 */
public class WhiteboardDescription extends Document {
    public WhiteboardDescription(String docName) {
        super(docName);
        docType = getClass().getSimpleName();
    }
}
