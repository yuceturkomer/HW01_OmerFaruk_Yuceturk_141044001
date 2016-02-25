package com.yuceturkomer.hw01;

/**
 * Group project class extended from AssignmentStudent
 */
public class GroupProject extends AssignmentStudent {
    GroupProject(String assigName) {
        super(assigName);
        assigType = getClass().getSimpleName();
    }
}
