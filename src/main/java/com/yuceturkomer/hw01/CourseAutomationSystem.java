package com.yuceturkomer.hw01;

import java.util.ArrayList;

/**
 *This is the sysstem path. This is a transit-ish thing
 */

//Test comment123

public class CourseAutomationSystem {
    ArrayList<Course> courseArrayList = new ArrayList<Course>();
    ArrayList<User> userArrayList = new ArrayList<User>();

    /**
     * Returns the course object if index is given.
     * @param index The index we look for
     * @return Returns course object
     * @throws IndexOutOfBoundsException If out of bounds, this is thrown
     */
    Course getCourseAtIndex(int index) throws IndexOutOfBoundsException {
        return courseArrayList.get(index);
    }

    /**
     * @return Returns the course array's size
     */
    int courseArrSize() {
        return courseArrayList.size();
    }
}
