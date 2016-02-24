package com.yuceturkomer.hw01;

/**
 * Created by ömer on 21.2.2016.
 */
public class GroupProject extends AssignmentStudent {
    GroupProject(String assigName) {
        super(assigName);
        assigType = getClass().getSimpleName();
    }
}
