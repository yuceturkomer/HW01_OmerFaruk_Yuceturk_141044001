package com.yuceturkomer.hw01;

/**
 * This is the document interface to force implementation
 */
public interface DocumentInterface {
    /**
     * Doc name getter
     * @return Document name string
     */
    String getDocName();

    /**
     * Doc name setter
     * @param docName Document name
     */
    void setDocName(String docName);

    /**
     * Doc type getter
     * @return Document type string
     */
    String getDocType();
}
