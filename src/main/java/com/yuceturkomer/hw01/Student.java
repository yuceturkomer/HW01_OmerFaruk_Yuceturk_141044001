package com.yuceturkomer.hw01;

/**
 * The Student class extends User Class
 */
public class Student extends User {
    private int studentNumber;

    /**
     * This Student constructor firstly calls its superclass' constructor. In
     * addition this constructor also sets student number as well.
     *
     * @param nameSurname   Name and surname of the student
     * @param mail          Mail address of the student
     * @param sysRef        The system reference that soon will be used in methods
     * @param studentNumber The number of student
     */
    public Student(String nameSurname, String mail, CourseAutomationSystem sysRef, int studentNumber) {
        super(nameSurname, mail, sysRef);
        this.studentNumber = studentNumber;
    }

    /**
     * With this method, student can send StudentAssignment to the TeacherAssignment. If there
     * is no such course as sent with parameters, it will throw NoSuchCourseException. If there is not such a
     * TeacherAssignment then it will throw NoSuchTeacherAssignmentException
     *
     * @param course       the Course object that assignment will be sent
     * @param teacherAssig the TeacherAssignment object that assignment will be sent
     * @param assigToSend  the assignment to send
     * @throws NoSuchCourseException            If there is no such course as sent with parameters
     * @throws NoSuchTeacherAssignmentException f there is not such a TeacherAssignment
     */
    public void sendAssignment(Course course,
                               AssignmentTeacher teacherAssig,
                               AssignmentStudent assigToSend) throws NoSuchCourseException, NoSuchTeacherAssignmentException {
        int courseIndex = sysRef.courseArrayList.indexOf(course);
        if (courseIndex == -1)
            throw new NoSuchCourseException();
        int teacherAssigIndex = sysRef.courseArrayList.get(courseIndex).teacherAssArrayList.indexOf(teacherAssig);
        if (teacherAssigIndex == -1)
            throw new NoSuchTeacherAssignmentException();

        sysRef.courseArrayList.get(courseIndex).teacherAssArrayList.
                get(teacherAssigIndex).assignmentStudentArrayList.add(assigToSend);
    }

    /**
     * This method allows student to remove assignment that he assigned.
     *
     * @param course        The Course object which StudentAssignment belongs
     * @param teacherAssig  The TeacherAssignment object which StudentAssignment belongs
     * @param assigToDelete The desired object to delete
     * @return Returns deleted objects reference
     * @throws NoSuchCourseException            If there is no such Course
     * @throws NoSuchTeacherAssignmentException If there is no such TeacherAssignment
     * @throws NoSuchStudentAssignmentException If there is no such StudentAssignment
     */
    public AssignmentStudent deleteAssignment(Course course,
                                              AssignmentTeacher teacherAssig,
                                              AssignmentStudent assigToDelete) throws NoSuchCourseException, NoSuchTeacherAssignmentException, NoSuchStudentAssignmentException {
        int courseIndex = sysRef.courseArrayList.indexOf(course);
        if (courseIndex == -1)
            throw new NoSuchCourseException();
        int teacherAssigIndex = sysRef.courseArrayList.get(courseIndex).teacherAssArrayList.indexOf(teacherAssig);
        if (teacherAssigIndex == -1)
            throw new NoSuchTeacherAssignmentException();

        int indexOfAssig = sysRef.courseArrayList.get(courseIndex).teacherAssArrayList.
                get(teacherAssigIndex).assignmentStudentArrayList.indexOf(assigToDelete);
        if (indexOfAssig == -1)
            throw new NoSuchStudentAssignmentException();
        sysRef.courseArrayList.get(courseIndex).teacherAssArrayList.
                get(teacherAssigIndex).assignmentStudentArrayList.remove(indexOfAssig);
        return assigToDelete;
    }

    /**
     * Prints the list of the documents that student can access
     */
    public void listUserDocuments() {
        System.out.println("The list of documents " +
                "which this student (" + toString() + ") can view");
        for (int i = 0; i < sysRef.courseArrSize(); ++i) {
            for (int j = 0; j < sysRef.getCourseAtIndex(i).studentArrayList.size(); ++j) {
                if (sysRef.getCourseAtIndex(i).studentArrayList.get(j).equals(this))
                    for (int k = 0; k < sysRef.getCourseAtIndex(i).documentArrayList.size(); ++k)
                        System.out.println(sysRef.getCourseAtIndex(i).documentArrayList.get(k).toString());
            }
        }
    }


    /**
     * Number setter
     *
     * @param number Number to be set     *
     */
    public void setNumber(int number) {
        studentNumber = number;
    }

    /**
     * School number getter
     *
     * @return Number of that student     *
     */
    @Override
    public int getNumber() {
        return studentNumber;
    }

    /**
     * Lists the users all courses
     */
    @Override
    public void listUserCourses() {
        System.out.println("This student (" + toString() + ") have been" +
                " enrolled to those courses listed below");
        for (int i = 0; i < sysRef.courseArrSize(); ++i) {
            if (!sysRef.getCourseAtIndex(i).isOldCourse()) {
                for (int j = 0; j < sysRef.getCourseAtIndex(i).studentArrayList.size(); ++j) {
                    if (sysRef.getCourseAtIndex(i).studentArrayList.get(j).equals(this))
                        System.out.println(sysRef.getCourseAtIndex(i).getCourseName());
                }
            }
        }
    }

    /**
     * toString override
     *
     * @return Expected String value
     */
    @Override
    public String toString() {
        return super.toString() + " User number : " + getNumber();
    }

    /**
     * equals override
     *
     * @param o object that'll be beingg compared
     * @return Returns true if its equal
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        if (!super.equals(o)) return false;

        Student student = (Student) o;

        return studentNumber == student.studentNumber;
    }

}
