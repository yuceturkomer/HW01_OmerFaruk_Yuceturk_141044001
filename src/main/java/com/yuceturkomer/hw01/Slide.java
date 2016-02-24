package com.yuceturkomer.hw01;

/**
 * Created by ömer on 21.2.2016.
 */
public class Slide extends Document {
    public Slide(String docName) {
        super(docName);
        docType=getClass().getSimpleName();
    }
}
