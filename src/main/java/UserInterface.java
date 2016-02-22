/**
 * Created by ömer on 21.2.2016.
 */

public interface UserInterface {
    String getNameSurname();

    void setNameSurname(String nameSurname);

    int getNumber();

    void setNumber(int number);

    void listUserCourses();

    boolean addUser(User theUser);

    boolean removeUserByNameSurname(String userNameSurname);

    boolean addCourse(Course theCourse);

    boolean removeCourseByName(String courseName);

    boolean addTutor(User theTutor);


}