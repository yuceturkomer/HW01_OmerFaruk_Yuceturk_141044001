package com.yuceturkomer.hw01;

import java.util.ArrayList;

/**
 * Created by ömer on 21.2.2016.
 */
public class Student extends User {
    private int studentNumber;

    public Student(String nameSurname, String mail, CourseAutomationSystem sysRef, int studentNumber) {
        super(nameSurname, mail, sysRef);
        this.studentNumber = studentNumber;
    }

    public boolean sendAssignment(Course course,
                                  AssignmentTeacher teacherAssig,
                                  AssignmentStudent assigToSend) throws NoSuchCourseException {
        int courseIndex = sysRef.courseArrayList.indexOf(course);
        if (courseIndex == -1)
            throw new NoSuchCourseException();

    }


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
        System.out.println("This student (" + toString() + ") have been" +
                " enrolled to those courses listed below");
        for (int i = 0; i < sysRef.courseArrSize(); ++i) {
            System.out.println(sysRef.getCourseAtIndex(i).getCourseName());
        }
    }

    @Override
    public String toString() {
        return super.toString() + " User number : " + getNumber();
    }
}
