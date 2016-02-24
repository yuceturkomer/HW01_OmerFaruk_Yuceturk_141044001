package com.yuceturkomer.hw01;

/**
 * Created by ömer on 21.2.2016.
 */
public class Admin extends User {
    public Admin(String nameSurname, String mail, CourseAutomationSystem sysRef) {
        super(nameSurname, mail, sysRef);
    }

    public void addUser(User userToAdd) throws UserAlreadyExistsException {
        if(sysRef.userArrayList.contains(userToAdd))
            throw new UserAlreadyExistsException();
        sysRef.userArrayList.add(userToAdd);
    }
    public User removeUser(User userToRemove) throws NoSuchUserException{
        if(!sysRef.userArrayList.contains(userToRemove))
            throw new NoSuchUserException();
        sysRef.userArrayList.remove(userToRemove);
        return userToRemove;
    }
    public void addCourse(Course courseToAdd) throws CourseAlreadyExsistsException {
        if(sysRef.courseArrayList.contains(courseToAdd))
            throw new CourseAlreadyExsistsException();
        sysRef.courseArrayList.add(courseToAdd);
    }
    Course removeCourse(Course courseToRemove) throws NoSuchCourseException {
        if (!sysRef.courseArrayList.remove(courseToRemove))
            throw new NoSuchCourseException();
        return courseToRemove;
    }


    @Override
    public void setNumber(int number) throws NoSuchVariableToWorkException {
        throw new NoSuchVariableToWorkException();
    }

    @Override
    public int getNumber() throws NoSuchVariableToWorkException {
        throw new NoSuchVariableToWorkException();
    }

    @Override
    public void listUserCourses() {
        System.out.println("This admin (" + toString() +
                ") has permission upon all courses and they are listed below :");
        for (int i = 0; i < sysRef.courseArrSize(); ++i) {
            System.out.println(sysRef.getCourseAtIndex(i).toString());
        }

    }
}
