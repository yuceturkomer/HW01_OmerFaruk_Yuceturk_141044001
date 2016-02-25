package com.yuceturkomer.hw01;

/**
 * Admin Class can add and remove any kind of users and courses.
 */
public class Admin extends User {
    /**
     * Constructor method uses User superclass' constructor which sets Name Surname, mail address and systemRef
     * respectively
     *
     * @param nameSurname The name and surname of user.
     * @param mail        The mail address of the user.
     * @param sysRef      The system reference to be used in certain methods.
     */
    public Admin(String nameSurname, String mail, CourseAutomationSystem sysRef) {
        super(nameSurname, mail, sysRef);
    }

    /**
     * The method which used for adding any kind of user to the system.
     *
     * @param userToAdd A User object that will be added.
     * @throws UserAlreadyExistsException If there exists same user, then this method throws this exception
     */
    public void addUser(User userToAdd) throws UserAlreadyExistsException {
        if (sysRef.userArrayList.contains(userToAdd))
            throw new UserAlreadyExistsException();
        sysRef.userArrayList.add(userToAdd);
    }

    /**
     * The method which used for removing any kind of user to the system.
     *
     * @param userToRemove The User object which will be searched for and deleted.
     * @return Returns the deleted User object's reference.
     * @throws NoSuchUserException If there is not such user like this, exception will be thrown
     */
    public User removeUser(User userToRemove) throws NoSuchUserException {
        if (!sysRef.userArrayList.contains(userToRemove))
            throw new NoSuchUserException();
        sysRef.userArrayList.remove(userToRemove);
        return userToRemove;
    }

    /**
     * The method for adding the Course to the system.
     *
     * @param courseToAdd The pre-created course which will be added to the system.
     * @throws CourseAlreadyExsistsException If there exists such a course, then it throws exception.
     */
    public void addCourse(Course courseToAdd) throws CourseAlreadyExsistsException {
        if (sysRef.courseArrayList.contains(courseToAdd))
            throw new CourseAlreadyExsistsException();
        sysRef.courseArrayList.add(courseToAdd);
    }

    /**
     * The method for removing the Course to the system.
     *
     * @param courseToRemove The pre-created course which will be removed from the system.
     * @return Returns removed course's object reference.
     * @throws NoSuchCourseException If there is no such course, exception thrown.
     */
    Course removeCourse(Course courseToRemove) throws NoSuchCourseException {
        if (!sysRef.courseArrayList.remove(courseToRemove))
            throw new NoSuchCourseException();
        return courseToRemove;
    }

    /**
     * Since admins dont have number, if this method is called, it throws exception.
     *
     * @param number This parameter came from interface. Not used.
     * @throws NoSuchVariableToWorkException Method throws this exception, because there is not number.
     */
    @Override
    public void setNumber(int number) throws NoSuchVariableToWorkException {
        throw new NoSuchVariableToWorkException();
    }

    /**
     * Since admins dont have number, if this method is called, it throws exception.
     *
     * @return Since it will throw exception,no return value needed.
     * @throws NoSuchVariableToWorkException Method throws this exception, because there is not number.
     */
    @Override
    public int getNumber() throws NoSuchVariableToWorkException {
        throw new NoSuchVariableToWorkException();
    }

    /**
     * In fact, lists all the courses on the system because admin can reach them all.
     */
    @Override
    public void listUserCourses() {
        System.out.println("This admin (" + toString() +
                ") has permission upon all courses and they are listed below :");
        for (int i = 0; i < sysRef.courseArrSize(); ++i) {
            System.out.println(sysRef.getCourseAtIndex(i).toString());
        }

    }
}
