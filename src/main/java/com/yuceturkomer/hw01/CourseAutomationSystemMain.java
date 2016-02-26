package com.yuceturkomer.hw01;

/**
 * Created by Omer Faruk Yuceturk on 22.2.2016.
 *
 * @author Omer Faruk Yuceturk
 *         <p>
 *         The main method for testing classes.
 */
public class CourseAutomationSystemMain {
    public static void main(String[] args) {
        /*****************************        Creating objects      **************************************************/
        CourseAutomationSystem automationSystem = new CourseAutomationSystem();
        Admin sysAdmin = new Admin("OmerYuceturk", "omeryuceturk@gmail.com", automationSystem);
        Student std1 = new Student("Omer Yuceturk", "oyuceturk@gtu.edu.tr", automationSystem, 141044001);
        Student std2 = new Student("Asim Olmez", "asimolmez@gtu.edu.tr", automationSystem, 131044001);
        Tutor tutor1 = new Tutor("Serkan Beyoglu", "sby@gtu.edu.tr", automationSystem, 121212121);
        Teacher teacher1 = new Teacher("Yakup Genc", "ygenc@gtu.edu.tr", automationSystem);
        Teacher teacher2 = new Teacher("Fatih Erdogan Sevilgen", "sevilgen@gtu.edu.tr", automationSystem);
        Course course1 = new Course("CSE222", false, teacher1, teacher2);
        Course course2 = new Course("CSE102", false, teacher1);
        Homework assig1 = new Homework("HW01");
        Quiz assig2 = new Quiz("102QUIZ");
        File doc1 = new File("Readme");
        Book doc2 = new Book("The Call");
        WhiteboardDescription doc3 = new WhiteboardDescription("Description");
        Url doc4 = new Url("University site");
        AssignmentTeacher teacherAssig1 = new AssignmentTeacher("Homework assignment");
        /*****************************     Creating the structure of the system by using methods     ******************/

        try {
            sysAdmin.addUser(std1);
            System.out.println("User added to the system: " + std1.toString());
        } catch (UserAlreadyExistsException e) {
            System.out.println("User " + std1.toString() + " couldnt added to the system. It already exists");
        }
        try {
            sysAdmin.addUser(std2);
            System.out.println("User added to the system: " + std2.toString());
        } catch (UserAlreadyExistsException e) {
            System.out.println("User " + std2.toString() + " couldnt added to the system. It already exists");
        }
        System.out.println("***         Intentional exception throwing, catching       ***");
        try {
            sysAdmin.addUser(std2);
            System.out.println("User added to the system: " + std2.toString());
        } catch (UserAlreadyExistsException e) {
            System.out.println("User " + std2.toString() + " couldnt added to the system. It already exists");
        }
        try {
            sysAdmin.addUser(tutor1);
            System.out.println("User added to the system: " + tutor1.toString());
        } catch (UserAlreadyExistsException e) {
            System.out.println("User " + tutor1.toString() + " couldnt added to the system. It already exists");
        }
        try {
            sysAdmin.addUser(teacher1);
            System.out.println("User added to the system: " + teacher1.toString());
        } catch (UserAlreadyExistsException e) {
            System.out.println("User " + teacher1.toString() + " couldnt added to the system. It already exists");
        }
        try {
            sysAdmin.addUser(teacher2);
            System.out.println("User added to the system: " + teacher2.toString());
        } catch (UserAlreadyExistsException e) {
            System.out.println("User " + teacher2.toString() + " couldnt added to the system. It already exists");
        }
        try {
            sysAdmin.addCourse(course1);
            System.out.println("Course added to the system: " + course1.toString());
        } catch (CourseAlreadyExsistsException e) {
            System.out.println("Course " + course1.toString() + " couldnt added to the system. It already exists");
        }
        System.out.println("***         Intentional exception throwing, catching       ***");
        try {
            sysAdmin.addCourse(course1);
            System.out.println("Course added to the system: " + course1.toString());
        } catch (CourseAlreadyExsistsException e) {
            System.out.println("Course " + course1.toString() + " couldnt added to the system. It already exists");
        }
        try {
            sysAdmin.addCourse(course2);
            System.out.println("Course added to the system: " + course2.toString());
        } catch (CourseAlreadyExsistsException e) {
            System.out.println("Course " + course2.toString() + " couldnt added to the system. It already exists");
        }

        /********************************** Using teacher methods **************************************************/

        try {
            teacher1.addStudentToCourse(std1, course1);
            System.out.println("\n\n\nStudent " + std1.toString() + "\n added to the course: " + course1.toString() + "\n");
        } catch (UserAlreadyExistsException e) {
            System.out.println("Student " + std1.toString() + " couldnt added to the course.It already exists. ");
        }
        try {
            teacher1.addStudentToCourse(std2, course2);
            System.out.println("Student " + std2.toString() + "\n added to the course: " + course2.toString() + "\n");
        } catch (UserAlreadyExistsException e) {
            System.out.println("Student " + std2.toString() + " couldnt added to the course.It already exists. ");
        }
        try {
            teacher1.addTutorToCourse(tutor1, course2);
            System.out.println("Tutor  " + tutor1.toString() + "\n added to the course: " + course1.toString() + "\n");
        } catch (UserAlreadyExistsException e) {
            System.out.println("Tutor " + tutor1.toString() + " couldnt added to the course.It already exists. ");
        }
        System.out.println("***         Intentional exception throwing, catching       ***");
        try {
            teacher1.addTutorToCourse(tutor1, course2);
            System.out.println("Tutor " + tutor1.toString() + " added to the course: " + course1.toString() + "\n");
        } catch (UserAlreadyExistsException e) {
            System.out.println("Tutor " + tutor1.toString() + " couldnt added to the course" + course2.toString() +
                    "It already exists. " + "\n");
        }

        try {
            teacher1.addAssignment(teacherAssig1, course2);
            System.out.println("Assignment" + teacherAssig1.toString() + "\n added to the course: " + course2.toString() + "\n");
        } catch (NoSuchCourseException e) {
            System.out.println("Assignment " + teacherAssig1.toString() + " couldnt added to the course " +
                    course2.toString() + "There is no such course. ");
        } catch (AssignmentAlreadyExistsException e) {
            System.out.println("Assignment " + teacherAssig1.toString() + " couldnt added to the course " +
                    course2.toString() + "It already exists. ");
        }

        try {
            teacher2.addDocument(doc1, course2);
            System.out.println("Document" + doc1.toString() + "\n added to the course: " + course2.toString() + "\n");
        } catch (DocumentAlreadyExistsException e) {
            System.out.println("Document " + doc1.toString() + " couldnt added to the course " +
                    course2.toString() + "It already exists. ");
        } catch (NoSuchCourseException e) {
            System.out.println("Document " + doc1.toString() + " couldnt added to the course " +
                    course2.toString() + "There is no such course. ");
        }
        try {
            teacher1.addDocument(doc2, course1);
            System.out.println("Document" + doc2.toString() + "\n added to the course: " + course1.toString() + "\n");
        } catch (DocumentAlreadyExistsException e) {
            System.out.println("Document " + doc2.toString() + "  couldnt added to the course " +
                    course2.toString() + "It already exists. ");
        } catch (NoSuchCourseException e) {
            System.out.println("Document " + doc2.toString() + " couldnt added to the course " +
                    course2.toString() + "There is no such course. ");
        }
        try {
            teacher2.addDocument(doc3, course2);
            System.out.println("Document" + doc3.toString() + "\n added to the course: " + course2.toString() + "\n");
        } catch (DocumentAlreadyExistsException e) {
            System.out.println("Document  " + doc3.toString() + " couldnt added to the course " +
                    course2.toString() + "It already exists. ");
        } catch (NoSuchCourseException e) {
            System.out.println("Document " + doc3.toString() + " couldnt added to the course " +
                    course2.toString() + "There is no such course. ");
        }
        try {
            teacher2.addDocument(doc4, course2);
            System.out.println(doc4.toString() + "\n added to the course: " + course2.toString() + "\n");
        } catch (DocumentAlreadyExistsException e) {
            System.out.println(doc4.toString() + " couldnt added to the course " +
                    course2.toString() + "It already exists. ");
        } catch (NoSuchCourseException e) {
            System.out.println(doc4.toString() + " couldnt added to the course " +
                    course2.toString() + "There is no such course. ");
        }
        /********************************** Student methods *****************************************************/

        try {
            std1.sendAssignment(course2, teacherAssig1, assig2);
            System.out.println(assig2.toString() + "\n sent to the course: " + course2.toString() + "\n");
        } catch (NoSuchCourseException e) {
            System.out.println(assig2.toString() + " couldnt send to the course " +
                    course2.toString() + "There is no such course.");
        } catch (NoSuchTeacherAssignmentException e) {
            System.out.println(assig2.toString() + " couldnt send to the course " +
                    course2.toString() + "There is no such teacher assignment.");
        }
        try {
            std2.sendAssignment(course2, teacherAssig1, assig2);
            System.out.println(assig2.toString() + "\n sent to the course: " + course2.toString() + "\n");
        } catch (NoSuchCourseException e) {
            System.out.println(std2.toString() + " couldnt send to the course " +
                    course2.toString() + " There is no such course.");
        } catch (NoSuchTeacherAssignmentException e) {
            System.out.println(std2.toString() + " couldnt send to the course " +
                    course2.toString() + " There is no such teacher assignment.");
        }
        System.out.print("\n\n\n");
        std1.listUserCourses();
        System.out.print("\n");
        std1.listUserDocuments();
        System.out.print("\n\n\n");
        std2.listUserCourses();
        System.out.print("\n");
        std2.listUserDocuments();

    }

}
