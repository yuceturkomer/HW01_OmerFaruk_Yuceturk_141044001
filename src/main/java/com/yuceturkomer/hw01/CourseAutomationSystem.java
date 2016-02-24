package com.yuceturkomer.hw01;

import java.util.ArrayList;

/**
 * Created by ömer on 20.2.2016.
 */

//Test comment123

public class CourseAutomationSystem {
    ArrayList<Course> courseArrayList = new ArrayList<Course>();
    ArrayList<User> userArrayList = new ArrayList<User>();

    Course getCourseAtIndex(int index) throws IndexOutOfBoundsException {
        return courseArrayList.get(index);
    }

    int courseArrSize() {
        return courseArrayList.size();
    }
}
