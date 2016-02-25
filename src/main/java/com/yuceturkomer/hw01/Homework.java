package com.yuceturkomer.hw01;

/**
 * Homework class extended from AssignmentStudent
 */
public class Homework extends AssignmentStudent {
    Homework(String assigName) {
        super(assigName);
        assigType = getClass().getSimpleName();
    }
}
