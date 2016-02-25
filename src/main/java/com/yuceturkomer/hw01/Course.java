package com.yuceturkomer.hw01;

import java.lang.*;
import java.lang.System;
import java.util.ArrayList;

/**
 * Course class contains 5 arraylists for teachers, tutors, students, documents, assignments
 */
public class Course {
    ArrayList<Teacher> teacherArrayList = new ArrayList<Teacher>();
    ArrayList<Tutor> tutorArrayList = new ArrayList<Tutor>();
    ArrayList<Student> studentArrayList = new ArrayList<Student>();
    ArrayList<Document> documentArrayList = new ArrayList<Document>();
    ArrayList<AssignmentTeacher> teacherAssArrayList = new ArrayList<AssignmentTeacher>();

    private String courseName;
    private boolean oldCourse;

    /**
     * Course's constructor. You give a name to course, wheter it is old or not (booelan) and as many teachers
     * as wanted.
     * @param courseName The name of the course
     * @param oldCourse Wheter its old or not
     * @param courseTeacher The teacher(s) of the class.
     */
    public Course(String courseName, boolean oldCourse, Teacher... courseTeacher) {
        this.courseName = courseName;
        for (Teacher teacher : courseTeacher) {
            teacherArrayList.add(teacher);
        }
        setOldCourse(oldCourse);
    }

    /**
     * Returns true if old
     * @return True if its old
     */
    public boolean isOldCourse() {
        return oldCourse;
    }

    /**
     * Sets if its old or not
     * @param oldCourse Set old or not
     */
    public void setOldCourse(boolean oldCourse) {
        this.oldCourse = oldCourse;
    }

    /**
     * Getting the course name
     * @return Course name
     */
    public String getCourseName() {
        return courseName;
    }

    /**
     * Sets the course name
     * @param courseName The name which is replaced
     */
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    /**
     * Method that lists all the users for this course
     */
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

    /**
     * Method that lists all the documents for this course
     */
    public void listDocuments() {
        System.out.println("The list of documents for course: " + getCourseName());
        for (int i = 0; i < documentArrayList.size(); ++i) {
            System.out.println(documentArrayList.get(i).toString());
        }
    }

    /**
     * Method that lists all the assignments for this course
     */
    public void listAssignments() {
        System.out.println("The list of assignments for course: " + getCourseName());
        for (int i = 0; i < teacherAssArrayList.size(); ++i) {
            System.out.println(teacherAssArrayList.get(i).toString());
        }
    }

    /**
     * Equal overriden
     * @param o object reference
     * @return Returns true if data fields are equal.
     */
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

    /**
     * Tostring is overriden
     * @return Returns the toString method as wanted format
     */
    @Override
    public String toString() {
        return "Course name : " + getCourseName() + "Old course : " + Boolean.toString(isOldCourse());
    }
}
