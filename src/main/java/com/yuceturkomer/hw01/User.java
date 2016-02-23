package com.yuceturkomer.hw01;

/**
 * Created by ömer on 21.2.2016.
 */
public abstract class User implements UserInterface {
    private String nameSurname;
    private String mail;
    private System sysRef;

    public User(String nameSurname, String mail,System sysRef) {
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


    public abstract void setNumber(int number);

    public abstract int getNumber();

    public abstract void listUserCourses();

}
