package com.yuceturkomer.hw01;

import org.junit.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Admin Class testing
 */
public class AdminTest {
    private Admin sysAdmin;
    private CourseAutomationSystem theSys;

    @Before
    public void setUp() throws Exception {
        System.out.println("Admin class test method is going to be called");
        theSys = new CourseAutomationSystem();
        sysAdmin = new Admin("OmerYuceturk", "oyuceturk@gtu.edu.tr", theSys);
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("Admin class test method is called and ended");
    }

    @Test
    public void testAddUser() throws Exception {
        Student std1 = new Student("ogrenci1", "ogrenci1mail", theSys, 141000141);
        sysAdmin.addUser(std1);
        Assert.assertEquals(std1, new Student("ogrenci1", "ogrenci1mail", theSys, 141000141));
    }

    @Test
    public void testRemoveUser() throws Exception {
        Student std1 = new Student("ogrenci1", "ogrenci1mail", theSys, 141000141);
        sysAdmin.addUser(std1);
        Assert.assertEquals(new Student("ogrenci1", "ogrenci1mail", theSys, 141000141), sysAdmin.removeUser(std1));
    }

    @Test
    public void testAddCourse() throws Exception {
        Course course1 = new Course("course1", false, new Teacher("YSA", "akgul@gyte.edu.tr", theSys));
        sysAdmin.addCourse(course1);
        Assert.assertEquals(course1, new Course("course1", false, new Teacher("YSA", "akgul@gyte.edu.tr", theSys)));
    }

    @Test
    public void testRemoveCourse() throws Exception {
        Course course1 = new Course("course1", false, new Teacher("YSA", "akgul@gyte.edu.tr", theSys));
        sysAdmin.addCourse(course1);
        Assert.assertEquals(sysAdmin.removeCourse(course1),
                new Course("course1", false, new Teacher("YSA", "akgul@gyte.edu.tr", theSys)));

    }

    @Test
    public void testListUserCourses() throws Exception {
        Course course1 = new Course("course1", false, new Teacher("YSA", "akgul@gyte.edu.tr", theSys));
        sysAdmin.addCourse(course1);
        sysAdmin.listUserCourses();
    }
}