package com.yuceturkomer.hw01;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

/**
 * Teacher class testing
 */
public class TeacherTest {
    private Teacher teacher1;
    private CourseAutomationSystem theSys;
    private Admin sysAdmin;

    @Before
    public void setUp() throws Exception {
        System.out.println("Teacher class test method is going to be called");
        theSys = new CourseAutomationSystem();
        sysAdmin = new Admin("OmerYuceturk", "oyuceturk@gtu.edu.tr", theSys);
        teacher1 = new Teacher("YSA", "akgul@gyte.edu.tr", theSys);
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("Teacher class test method is called and ended");
    }

    @Test
    public void testAddUser() throws Exception {
        Student student1 = new Student("Ahmet", "ahm@gmail.lel", theSys, 141444141);
        teacher1.addUser(student1);
        Assert.assertEquals(student1, new Student("Ahmet", "ahm@gmail.lel", theSys, 141444141));
    }

    @Test
    public void testRemoveUser() throws Exception {
        Student student1 = new Student("Ahmet", "ahm@gmail.lel", theSys, 141444141);
        teacher1.addUser(student1);
        Assert.assertEquals(teacher1.removeUser(student1), new Student("Ahmet", "ahm@gmail.lel", theSys, 141444141));
    }

    @Test
    public void testAddCourse() throws Exception {
        Course course1 = new Course("course1", true, teacher1);
        teacher1.addCourse(course1);
        Assert.assertEquals(course1, new Course("course1", true, teacher1));
    }

    @Test
    public void testRemoveCourse() throws Exception {
        Course course1 = new Course("course1", true, teacher1);
        teacher1.addCourse(course1);
        Assert.assertEquals(teacher1.removeCourse(course1), new Course("course1", true, teacher1));
    }

    @Test
    public void testAddStudentToCourse() throws Exception {
        Course course1 = new Course("course1", true, teacher1);
        Student student1 = new Student("Ahmet", "ahm@gmail.lel", theSys, 141444141);
        teacher1.addCourse(course1);
        teacher1.addStudentToCourse(student1, course1);
        Assert.assertEquals(student1, theSys.courseArrayList.get(0).studentArrayList.get(0));
    }

    @Test
    public void testRemoveStudentFromCourse() throws Exception {
        Course course1 = new Course("course1", false, teacher1);
        Student student1 = new Student("Ahmet", "ahm@gmail.lel", theSys, 141444141);
        teacher1.addCourse(course1);
        teacher1.addStudentToCourse(student1, course1);
        Assert.assertEquals(teacher1.removeStudentFromCourse(student1, course1), student1);
    }

    @Test
    public void testAddTutorToCourse() throws Exception {
        Course course1 = new Course("course1", false, teacher1);
        Tutor tutor1 = new Tutor("Mehmet", "mehm@gmail.lel", theSys, 141444141);
        teacher1.addCourse(course1);
        teacher1.addTutorToCourse(tutor1, course1);
        Assert.assertEquals(tutor1, theSys.courseArrayList.get(0).tutorArrayList.get(0));
    }

    @Test
    public void testRemoveTutorFromCourse() throws Exception {
        Course course1 = new Course("course1", false, teacher1);
        Tutor tutor1 = new Tutor("Mehmet", "mehm@gmail.lel", theSys, 141444141);
        teacher1.addCourse(course1);
        teacher1.addTutorToCourse(tutor1, course1);
        Assert.assertEquals(teacher1.removeTutorFromCourse(tutor1, course1), tutor1);
    }

    @Test
    public void testAddDocument() throws Exception {
        Course course1 = new Course("course1", false, teacher1);
        Book document1 = new Book("Safahat");
        teacher1.addCourse(course1);
        teacher1.addDocument(document1,course1);
        Assert.assertEquals(course1,new Course("course1", false, teacher1));
    }

    @Test
    public void testRemoveDocument() throws Exception {
        Course course1 = new Course("course1", false, teacher1);
        Book document1 = new Book("Safahat");
        teacher1.addCourse(course1);
        teacher1.addDocument(document1,course1);
        Assert.assertEquals(teacher1.removeDocument(document1,course1),new Book("Safahat"));
    }

    @Test
    public void testAddAssignment() throws Exception {
        Course course1 = new Course("course1", false, teacher1);
        AssignmentTeacher teacherAssig = new AssignmentTeacher("HW01");
        teacher1.addCourse(course1);
        teacher1.addAssignment(teacherAssig,course1);
        Assert.assertEquals(teacherAssig,new AssignmentTeacher("HW01"));
    }

    @Test
    public void testRemoveAssignment() throws Exception {
        Course course1 = new Course("course1", false, teacher1);
        AssignmentTeacher teacherAssig = new AssignmentTeacher("HW01");
        teacher1.addCourse(course1);
        teacher1.addAssignment(teacherAssig,course1);
        Assert.assertEquals(teacher1.removeAssignment(teacherAssig,course1),new AssignmentTeacher("HW01"));
    }
}