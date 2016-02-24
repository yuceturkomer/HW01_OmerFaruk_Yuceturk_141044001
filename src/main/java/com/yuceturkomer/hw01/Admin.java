package com.yuceturkomer.hw01;

/**
 * Created by ömer on 21.2.2016.
 */
public class Admin extends User {
    public Admin(String nameSurname, String mail, CourseAutomationSystem sysRef) {
        super(nameSurname, mail, sysRef);
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
        System.out.println("This admin ("+ toString() +
                ") has permission upon all courses and they are listed below :");
        for(int i = 0 ; i < sysRef.userArrSize() ; ++i){
            System.out.println(sysRef.getUserAtIndex(i).toString());
        }

    }
}
