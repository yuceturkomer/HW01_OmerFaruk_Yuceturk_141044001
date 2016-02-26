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
        Admin sysAdmin = new Admin("OmerYuceturk","omeryuceturk@gmail.com",automationSystem);
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
        /*****************************     Creating the structure of the system by using methods     ******************/

        try {
            sysAdmin.addUser(std1);
            System.out.println("User added to the system: " +std1.toString());
        } catch (UserAlreadyExistsException e) {
            System.out.println("User " + std1.toString()+ " couldnt added to the system. It already exists");
        }
        try {
            sysAdmin.addUser(std2);
            System.out.println("User added to the system: " +std2.toString());
        } catch (UserAlreadyExistsException e) {
            System.out.println("User " + std2.toString()+ " couldnt added to the system. It already exists");
        }
        try {
            sysAdmin.addUser(std2);
            System.out.println("User added to the system: " +std2.toString());
        } catch (UserAlreadyExistsException e) {
            System.out.println("User " + std2.toString()+ " couldnt added to the system. It already exists");
        }
        try {
            sysAdmin.addUser(tutor1);
            System.out.println("User added to the system: " +tutor1.toString());
        } catch (UserAlreadyExistsException e) {
            System.out.println("User " + tutor1.toString()+ " couldnt added to the system. It already exists");
        }
        try {
            sysAdmin.addUser(teacher1);
            System.out.println("User added to the system: " +teacher1.toString());
        } catch (UserAlreadyExistsException e) {
            System.out.println("User " + teacher1.toString()+ " couldnt added to the system. It already exists");
        }
        try {
            sysAdmin.addUser(teacher2);
            System.out.println("User added to the system: " +teacher2.toString());
        } catch (UserAlreadyExistsException e) {
            System.out.println("User " + teacher2.toString()+ " couldnt added to the system. It already exists");
        }

        /********************************** Using teacher methods **************************************************/

    }

}
