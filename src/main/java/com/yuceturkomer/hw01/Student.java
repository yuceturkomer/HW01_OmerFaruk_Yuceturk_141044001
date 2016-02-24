package com.yuceturkomer.hw01;

/**
 * Created by ömer on 21.2.2016.
 */
public class Student extends User {
    private int studentNumber;

    public Student(String nameSurname, String mail, CourseAutomationSystem sysRef, int studentNumber) {
        super(nameSurname, mail, sysRef);
        this.studentNumber = studentNumber;
    }

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
            if (!sysRef.getCourseAtIndex(i).isOldCourse()) {
                for (int j = 0; j < sysRef.getCourseAtIndex(i).studentArrayList.size(); ++j) {
                    if (sysRef.getCourseAtIndex(i).studentArrayList.get(j).equals(this))
                        System.out.println(sysRef.getCourseAtIndex(i).getCourseName());
                }
            }
        }
    }

    @Override
    public String toString() {
        return super.toString() + " User number : " + getNumber();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        if (!super.equals(o)) return false;

        Student student = (Student) o;

        return studentNumber == student.studentNumber;
    }

}
