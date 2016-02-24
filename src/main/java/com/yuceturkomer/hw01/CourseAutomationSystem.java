package com.yuceturkomer.hw01;

import java.util.ArrayList;

/**
 * Created by ömer on 20.2.2016.
 */

//Test comment123

public class CourseAutomationSystem {
    private ArrayList<Course> courseArrayList = new ArrayList<Course>();
    private ArrayList<User> userArrayList = new ArrayList<User>();

    boolean addUser(User userToAdd) throws UserAlreadyExistsException {
        if (userArrayList.indexOf(userToAdd) != -1)
            throw new UserAlreadyExistsException();
        userArrayList.add(userToAdd);
        return true;
    }

    User removeUser(User userToRemove) throws NoSuchUserException {
        if (!userArrayList.remove(userToRemove))
            throw new NoSuchUserException();
        return userToRemove;
    }

    boolean addCourse(Course courseToAdd) throws CourseAlreadyExsistsException {
        if (courseArrayList.indexOf(courseToAdd) != -1)
            throw new CourseAlreadyExsistsException();
        courseArrayList.add(courseToAdd);
        return true;
    }

    Course removeCourse(Course courseToRemove) throws NoSuchCourseException {
        if (!courseArrayList.remove(courseToRemove))
            throw new NoSuchCourseException();
        return courseToRemove;
    }

}
