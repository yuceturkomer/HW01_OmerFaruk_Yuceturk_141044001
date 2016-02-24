package com.yuceturkomer.hw01;

/**
 * Created by ömer on 21.2.2016.
 */
public class Student extends User {
    private int studentNumber;

    @Override
    public void setNumber(int number) {
        studentNumber = number;
    }

    @Override
    public int getNumber() {
        return studentNumber;
    }

    @Override
    public void listUserCourses() {

    }
}
