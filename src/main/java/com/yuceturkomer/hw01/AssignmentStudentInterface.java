package com.yuceturkomer.hw01;

/**
 * Assignment interface for being sure that these methods will be implemented.
 */
public interface AssignmentStudentInterface {
    /**
     * Method to get the assignment name.
     * @return the assignment name.
     */
    String getAssigName();

    /**
     * Methot to set the assignment name.
     * @param name the String which is gonna be assigned as.
     */
    void setAssigName(String name);

    /**
     * Method that returns the string type of assignment type.
     * @return
     */
    String getAssigType();
}
