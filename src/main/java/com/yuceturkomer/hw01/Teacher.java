package com.yuceturkomer.hw01;

import javax.naming.NoPermissionException;

/**
 * The Teacher class extends User classs
 */
public class Teacher extends User {
    public Teacher(String nameSurname, String mail, CourseAutomationSystem sysRef) {
        super(nameSurname, mail, sysRef);
    }

    /**
     * User adding method for teacher.
     *
     * @param userToAdd The user to be added
     * @throws UserAlreadyExistsException If there already is this user in the list then exception thrown
     * @throws NoPermissionException      Teacher cannot add/remove admin. If User is an instanceof Admin then exception thrown
     */
    public void addUser(User userToAdd) throws UserAlreadyExistsException, NoPermissionException {
        if (userToAdd instanceof Admin)
            throw new NoPermissionException("Cannot add admin\n");
        if (sysRef.userArrayList.contains(userToAdd))
            throw new UserAlreadyExistsException();
        sysRef.userArrayList.add(userToAdd);
    }

    /**
     * Method to remove user
     *
     * @param userToRemove Desired user to remove
     * @return Returns the Object that just removed
     * @throws NoSuchUserException   If there is bo such user
     * @throws NoPermissionException Teacher cannot add/remove admin. If User is an instanceof Admin then exception thrown
     */
    public User removeUser(User userToRemove) throws NoSuchUserException, NoPermissionException {
        if (userToRemove instanceof Admin)
            throw new NoPermissionException("Cannot remove admin\n");
        if (!sysRef.userArrayList.contains(userToRemove))
            throw new NoSuchUserException();
        sysRef.userArrayList.remove(userToRemove);
        return userToRemove;
    }

    /**
     * Method to add courses
     *
     * @param courseToAdd Course be added
     * @throws CourseAlreadyExsistsException If there is already such course
     */
    public void addCourse(Course courseToAdd) throws CourseAlreadyExsistsException {
        if (sysRef.courseArrayList.contains(courseToAdd))
            throw new CourseAlreadyExsistsException();
        sysRef.courseArrayList.add(courseToAdd);
    }

    /**
     * Removing the course
     *
     * @param courseToRemove Course to be removed
     * @return returns removed objects reference
     * @throws NoSuchCourseException If there is not the Course we look for
     */
    public Course removeCourse(Course courseToRemove) throws NoSuchCourseException {
        if (!sysRef.courseArrayList.remove(courseToRemove))
            throw new NoSuchCourseException();
        return courseToRemove;
    }

    /**
     * Method to add student to the specified class.
     *
     * @param studentToAdd The Student to be added
     * @param toCourse     The Course to be added to
     * @throws UserAlreadyExistsException If there already is such user
     */
    public void addStudentToCourse(Student studentToAdd, Course toCourse) throws UserAlreadyExistsException {
        if (sysRef.courseArrayList.get(sysRef.courseArrayList.indexOf(toCourse)).studentArrayList.contains(studentToAdd))
            throw new UserAlreadyExistsException();
        sysRef.courseArrayList.get(sysRef.courseArrayList.indexOf(toCourse)).studentArrayList.add(studentToAdd);
    }

    /**
     * Method to remove student from the specified class.
     *
     * @param studentToRemove The Student to be removed
     * @param fromCourse      The Student to be removed from
     * @return Returns the removed Student's reference
     * @throws NoSuchUserException If there is no such user
     */
    public Student removeStudentFromCourse(Student studentToRemove, Course fromCourse) throws NoSuchUserException {
        if (!sysRef.courseArrayList.
                get(sysRef.courseArrayList.indexOf(fromCourse)).studentArrayList.contains(studentToRemove))
            throw new NoSuchUserException();
        sysRef.courseArrayList.
                get(sysRef.courseArrayList.indexOf(fromCourse)).studentArrayList.remove(studentToRemove);
        return studentToRemove;
    }

    /**
     * Method to add tutor to the specified class.
     *
     * @param tutorToAdd The Tutor to be added
     * @param toCourse   The Course to be added to
     * @throws UserAlreadyExistsException If there already is such user
     */
    public void addTutorToCourse(Tutor tutorToAdd, Course toCourse) throws UserAlreadyExistsException {
        if (sysRef.courseArrayList.get(sysRef.courseArrayList.indexOf(toCourse)).tutorArrayList.contains(tutorToAdd))
            throw new UserAlreadyExistsException();
        sysRef.courseArrayList.get(sysRef.courseArrayList.indexOf(toCourse)).tutorArrayList.add(tutorToAdd);
    }

    /**
     * Method to remove tutor from the specified class.
     *
     * @param tutorToRemove The Tutor to be removed
     * @param fromCourse      The Tutor to be removed from
     * @return Returns the removed Tutor's reference
     * @throws NoSuchUserException If there is no such user
     */
    public Tutor removeTutorFromCourse(Tutor tutorToRemove, Course fromCourse) throws NoSuchUserException {
        if (!sysRef.courseArrayList.
                get(sysRef.courseArrayList.indexOf(fromCourse)).tutorArrayList.contains(tutorToRemove))
            throw new NoSuchUserException();
        sysRef.courseArrayList.
                get(sysRef.courseArrayList.indexOf(fromCourse)).tutorArrayList.remove(tutorToRemove);
        return tutorToRemove;
    }


    /**
     * Method to add a document
     *
     * @param docToAdd        Document type object to be added
     * @param courseThatAdded Which course we add
     * @throws DocumentAlreadyExistsException if there is such doc already
     * @throws NoSuchCourseException          if there is no such course
     */
    public void addDocument(Document docToAdd, Course courseThatAdded)
            throws DocumentAlreadyExistsException, NoSuchCourseException {
        if (!sysRef.courseArrayList.contains(courseThatAdded))
            throw new NoSuchCourseException();
        int courseIndex = sysRef.courseArrayList.indexOf(courseThatAdded);
        if (sysRef.courseArrayList.get(courseIndex).documentArrayList.contains(docToAdd))
            throw new DocumentAlreadyExistsException();

        sysRef.courseArrayList.get(courseIndex).documentArrayList.add(docToAdd);
    }

    /**
     * Method to remove a doc
     *
     * @param docToRemove       Desired doc to remove
     * @param courseDeletedFrom Course object that deleted from
     * @return Returns removed object's reference
     * @throws NoSuchCourseException   If there is no such course
     * @throws NoSuchDocumentException If there is no such document
     */
    public Document removeDocument(Document docToRemove, Course courseDeletedFrom)
            throws NoSuchCourseException, NoSuchDocumentException {
        if (!sysRef.courseArrayList.contains(courseDeletedFrom))
            throw new NoSuchCourseException();
        int courseIndex = sysRef.courseArrayList.indexOf(courseDeletedFrom);
        if (!sysRef.courseArrayList.get(courseIndex).documentArrayList.contains(docToRemove))
            throw new NoSuchDocumentException();

        sysRef.courseArrayList.get(courseIndex).documentArrayList.remove(docToRemove);
        return docToRemove;
    }

    /**
     * Method to create an assignment. Uses AssignmentTeacher
     *
     * @param assigToAdd      The assignment detail inside the package
     * @param courseThatAdded The course that being added
     * @throws NoSuchCourseException            If there is no course like that
     * @throws AssignmentAlreadyExistsException If there is already an assignment like that
     */
    public void addAssignment(AssignmentTeacher assigToAdd, Course courseThatAdded)
            throws NoSuchCourseException, AssignmentAlreadyExistsException {
        if (!sysRef.courseArrayList.contains(courseThatAdded))
            throw new NoSuchCourseException();
        int courseIndex = sysRef.courseArrayList.indexOf(courseThatAdded);
        if (sysRef.courseArrayList.get(courseIndex).teacherAssArrayList.contains(assigToAdd))
            throw new AssignmentAlreadyExistsException();
        sysRef.courseArrayList.get(courseIndex).teacherAssArrayList.add(assigToAdd);

    }

    /**
     * Removing the assignment which teacher gave
     *
     * @param assigToRemove     the assignment wihch will be removed
     * @param courseRemovedFrom the assignments removed from here
     * @return removed object's reference
     * @throws NoSuchCourseException            If there is no such Course
     * @throws NoSuchTeacherAssignmentException If there is no such AssignmentTeacher
     */
    public AssignmentTeacher removeAssignment(AssignmentTeacher assigToRemove, Course courseRemovedFrom)
            throws NoSuchCourseException, NoSuchTeacherAssignmentException {
        if (!sysRef.courseArrayList.contains(courseRemovedFrom))
            throw new NoSuchCourseException();
        int courseIndex = sysRef.courseArrayList.indexOf(courseRemovedFrom);
        if (sysRef.courseArrayList.get(courseIndex).teacherAssArrayList.contains(assigToRemove))
            throw new NoSuchTeacherAssignmentException();
        sysRef.courseArrayList.get(courseIndex).teacherAssArrayList.remove(assigToRemove);
        return assigToRemove;
    }

    /**
     * Number setter
     *
     * @param number Number to be set
     * @throws NoSuchVariableToWorkException If has no data field of number, exception threw
     */
    @Override
    public void setNumber(int number) throws NoSuchVariableToWorkException {
        throw new NoSuchVariableToWorkException();
    }

    /**
     * School number getter
     *
     * @return Number of that student
     * @throws NoSuchVariableToWorkException If there is no number field for user this'll be thrown
     */
    @Override
    public int getNumber() throws NoSuchVariableToWorkException {
        throw new NoSuchVariableToWorkException();
    }

    /**
     * Lists the teacher's courses
     */
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
