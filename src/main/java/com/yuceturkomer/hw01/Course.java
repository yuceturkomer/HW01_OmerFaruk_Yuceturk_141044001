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
    ArrayList<AssignmentTeacher> teacherAssArrayList = new ArrayList<AssignmentTeacher>();

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

    public void listUsers() {
        System.out.println("The list of students for course: " + getCourseName());
        for (int i = 0; i < studentArrayList.size(); ++i) {
            System.out.println(studentArrayList.get(i).toString());
        }
        System.out.println("The list of teachers for course: " + getCourseName());
        for (int i = 0; i < teacherArrayList.size(); ++i) {
            System.out.println(teacherArrayList.get(i).toString());
        }
        System.out.println("The list of tutors for course: " + getCourseName());
        for (int i = 0; i < tutorArrayList.size(); ++i) {
            System.out.println(tutorArrayList.get(i).toString());
        }
    }

    public void listDocuments() {
        System.out.println("The list of documents for course: " + getCourseName());
        for (int i = 0; i < documentArrayList.size(); ++i) {
            System.out.println(documentArrayList.get(i).toString());
        }
    }

    public void listAssignments() {
        System.out.println("The list of assignments for course: " + getCourseName());
        for (int i = 0; i < teacherAssArrayList.size(); ++i) {
            System.out.println(teacherAssArrayList.get(i).toString());
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof Course))
            return false;

        Course course = (Course) o;

        if (isOldCourse() != course.isOldCourse())
            return false;
        return getCourseName().equals(course.getCourseName());

    }

    @Override
    public String toString() {
        String toReturn="The students for course: " + getCourseName() + "\n";
        for (int i = 0; i < studentArrayList.size(); ++i) {
            toReturn += " " + studentArrayList.get(i).toString();
        }
        toReturn += "The tutors for course: " + getCourseName() + "\n";
        for (int i = 0; i < tutorArrayList.size(); ++i) {
            toReturn += " " + tutorArrayList.get(i).toString();
        }
        toReturn += "The teachers for course: " + getCourseName() + "\n";
        for (int i = 0; i < teacherArrayList.size(); ++i) {
            toReturn += " " + teacherArrayList.get(i).toString();
        }
        toReturn += "The documents for course: " + getCourseName() + "\n";
        for (int i = 0; i < documentArrayList.size(); ++i) {
            toReturn += " " + documentArrayList.get(i).toString();
        }
        toReturn += "The assignments for course: " + getCourseName() + "\n";
        for (int i = 0; i < teacherAssArrayList.size(); ++i) {
            toReturn += " " + teacherAssArrayList.get(i).toString();
        }
        return toReturn;

    }
}
