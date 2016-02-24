package com.yuceturkomer.hw01;

/**
 * Created by ömer on 21.2.2016.
 */
public class Teacher extends User {
    public Teacher(String nameSurname, String mail, CourseAutomationSystem sysRef) {
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

    public void addDocument(Document docToAdd,
                            Course courseThatAdded) throws DocumentAlreadyExistsException, NoSuchCourseException {
        if(!sysRef.courseArrayList.contains(courseThatAdded))
            throw new NoSuchCourseException();
        int courseIndex = sysRef.courseArrayList.indexOf(courseThatAdded);
        if(sysRef.courseArrayList.get(courseIndex).documentArrayList.contains(docToAdd))
            throw new DocumentAlreadyExistsException();

        sysRef.courseArrayList.get(courseIndex).documentArrayList.add(docToAdd);
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
        System.out.println("This teacher (" + toString() +
                ") is teacher of the courses which are listed below :");
        for (int i = 0; i < sysRef.courseArrSize(); ++i) {
            int indexOfTeacher = sysRef.courseArrayList.get(i).teacherArrayList.indexOf(this);
            if (indexOfTeacher != -1)
                System.out.println(sysRef.getCourseAtIndex(indexOfTeacher).toString());
        }

    }


}
