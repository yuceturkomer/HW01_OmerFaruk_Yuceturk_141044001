package com.yuceturkomer.hw01;

/**
 * Created by ömer on 21.2.2016.
 */
public abstract class User implements UserInterface {
    private String nameSurname;
    private String mail;
    protected CourseAutomationSystem sysRef;

    public User(String nameSurname, String mail, CourseAutomationSystem sysRef) {
        this.nameSurname = nameSurname;
        this.mail = mail;
        this.sysRef = sysRef;
    }

    public String getNameSurname() {
        return nameSurname;
    }

    public void setNameSurname(String nameSurname) {
        this.nameSurname = nameSurname;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof User))
            return false;

        User user = (User) o;

        if (!getNameSurname().equals(user.getNameSurname()))
            return false;
        return getMail().equals(user.getMail());
    }

    @Override
    public String toString() {
        return "User status: "+ getClass().getSimpleName() +" User Name Surname: " + getNameSurname()
                + " User mail: " + getMail();
    }

    public abstract void setNumber(int number) throws NoSuchVariableToWorkException;

    public abstract int getNumber() throws NoSuchVariableToWorkException;

    public abstract void listUserCourses();

}
