package com.yuceturkomer.hw01;

/**
 * Created by ömer on 21.2.2016.
 */

public interface UserInterface {
    String getNameSurname();

    void setNameSurname(String nameSurname);

    int getNumber() throws NoSuchVariableToWorkException;

    String getMail();

    void setMail(String mail);

    void setNumber(int number) throws NoSuchVariableToWorkException;

    void listUserCourses();

}

/*
    ***These methods gonna be moved to other classes***

    boolean addUser(User theUser);

    boolean removeUserByNameSurname(String userNameSurname);

    boolean addCourse(Course theCourse);

    boolean removeCourseByName(String courseName);

    boolean addTutor(User theTutor);

    boolean removeTutorByNumber(int tutorNumber);*/
