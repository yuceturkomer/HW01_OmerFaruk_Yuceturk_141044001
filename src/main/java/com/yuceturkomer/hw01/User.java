package com.yuceturkomer.hw01;

/**
 * The User class which implements UserInterface. This is an abstract class.
 * It holds a string for the name and surname, a string for mail address,
 * a CourseAutomationSystem reference.
 */
public abstract class User implements UserInterface {
    private String nameSurname;
    private String mail;
    protected CourseAutomationSystem sysRef;

    /**
     * The User constructor. It sets nameSurname, mail, and system references according to given values
     *
     * @param nameSurname The name and surname of user.
     * @param mail        The mail address of the user.
     * @param sysRef      The course automation system reference.
     */
    public User(String nameSurname, String mail, CourseAutomationSystem sysRef) {
        this.nameSurname = nameSurname;
        this.mail = mail;
        this.sysRef = sysRef;
    }

    /**
     * Getter of nameSurname. Returns a string.
     *
     * @return Name surname string.
     */
    public String getNameSurname() {
        return nameSurname;
    }

    /**
     * Setter of nameSurname.
     *
     * @param nameSurname The name and surname to be set as string
     */
    public void setNameSurname(String nameSurname) {
        this.nameSurname = nameSurname;
    }

    /**
     * Getter of mail address.
     *
     * @return Mail address string.
     */
    public String getMail() {
        return mail;
    }

    /**
     * Setter of mail address.
     *
     * @param mail Mail address as string to be set
     */
    public void setMail(String mail) {
        this.mail = mail;
    }

    /**
     * Overriden method of equals.
     *
     * @param o The object to be compaed.
     * @return True if variables are same.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof User))
            return false;

        User user = (User) o;

        return getNameSurname().equals(user.getNameSurname()) && getMail().equals(user.getMail());
    }

    /**
     * Overriding of toString
     *
     * @return The String of user's status, name surname and mail address.
     */
    @Override
    public String toString() {
        return "User status: " + getClass().getSimpleName() + " User Name Surname: " + getNameSurname()
                + " User mail: " + getMail();
    }

    /**
     * Abstract method and not implemented here.
     *
     * @param number Number to be set
     * @throws NoSuchVariableToWorkException Thrown
     */
    public abstract void setNumber(int number) throws NoSuchVariableToWorkException;

    /**
     * Abstract method and not implemented here.
     *
     * @return an integer value
     * @throws NoSuchVariableToWorkException Thrown
     */
    public abstract int getNumber() throws NoSuchVariableToWorkException;

    /**
     * Abstract method and not implemented here.
     */
    public abstract void listUserCourses();

}
