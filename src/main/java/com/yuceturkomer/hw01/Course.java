package com.yuceturkomer.hw01;

import java.lang.*;
import java.lang.System;
import java.util.ArrayList;

/**
 * Created by ömer on 21.2.2016.
 */
public class Course {
    ArrayList<Teacher> teacherArrayList = new ArrayList<Teacher>();
    ArrayList<Tutor> tutorArrayList = new ArrayList<Tutor>();
    ArrayList<Student> studentArrayList = new ArrayList<Student>();
    ArrayList<Document> documentArrayList = new ArrayList<Document>();
    ArrayList<AssignmentTeacher> teacherArrayList = new ArrayList<AssignmentTeacher>();

    private String courseName;
    private boolean oldCourse;

    public Course(String courseName, Teacher... courseTeacher) {
        this.courseName = courseName;
        for (Teacher teacher : courseTeacher) {
            teacherArrayList.add(teacher);
        }

    }

    public boolean isOldCourse() {
        return oldCourse;
    }

    public void setOldCourse(boolean oldCourse) {
        this.oldCourse = oldCourse;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void listUsers() {/*Will be filled*/}

    public void listDocuments() {/*Will be filled*/}

    public void listAssignments() {
        for (AssignmentTeacher iter : teacherArrayList) {

        }
    }


}
