package com.yuceturkomer.hw01;

/**
 * The tutor class which extends Student class (Student is a subclass of User).
 */
public class Tutor extends Student {
    public Tutor(String nameSurname, String mail, CourseAutomationSystem sysRef, int studentNumber) {
        super(nameSurname, mail, sysRef, studentNumber);
    }

    @Override
    public void listUserCourses() {
        System.out.println("This student (" + toString() + ") have been" +
                " enrolled to those courses listed below");
        for (int i = 0; i < sysRef.courseArrSize(); ++i) {
            for (int j = 0; j < sysRef.getCourseAtIndex(i).studentArrayList.size(); ++j) {
                if (sysRef.getCourseAtIndex(i).studentArrayList.get(j).equals(this))
                    System.out.println(sysRef.getCourseAtIndex(i).getCourseName());

            }
        }
    }
}
