package com.yuceturkomer.hw01;

/**
 * Created by ömer on 21.2.2016.
 */
public abstract class Document implements DocumentInterface {
    private String docName;
    protected String docType;

    public Document(String docName){
        setDocName(docName);
    }
    public String getDocType(){
        return docType;
    }

    public String getDocName() {
        return docName;
    }

    public void setDocName(String docName) {
        this.docName = docName;
    }

    @Override
    public String toString() {
        return "Document" + getDocType() +getDocName();
    }
}
