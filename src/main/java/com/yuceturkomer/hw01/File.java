package com.yuceturkomer.hw01;

/**
 * Created by ömer on 21.2.2016.
 */
public class File extends Document {
    public File(String docName) {
        super(docName);
        docType=getClass().getSimpleName();
    }
}
