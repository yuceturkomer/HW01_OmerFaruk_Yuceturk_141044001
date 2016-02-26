package com.yuceturkomer.hw01;

/**
 * The document class which implemets DocumentInterface. It is an abstract class and implements some of interface's
 * methods.
 */
public abstract class Document implements DocumentInterface {
    private String docName;
    protected String docType;

    /**
     * Document constructor
     * @param docName the Document name to be set
     */
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
        return "Document -- Type: " + getDocType()+" -- Name: " +getDocName();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Document)) return false;

        Document document = (Document) o;

        return getDocName().equals(document.getDocName()) && getDocType().equals(document.getDocType());

    }
}
