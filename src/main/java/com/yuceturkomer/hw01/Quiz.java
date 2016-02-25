package com.yuceturkomer.hw01;

/**
 * Quiz class which extends AssignmentStudent
 */
public class Quiz extends AssignmentStudent {
    /**
     * Quiz class' constructor that sets the name
     * @param assigName Name to be set
     */
    Quiz(String assigName) {
        super(assigName);
        assigType = getClass().getSimpleName();
    }
}
