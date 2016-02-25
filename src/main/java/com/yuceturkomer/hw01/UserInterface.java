package com.yuceturkomer.hw01;

/**
 * The user interface to force implementing these methods
 */

public interface UserInterface {
    /**
     * Name surname getter
     *
     * @return NameSurname string
     */
    String getNameSurname();

    /**
     * Name surname setter
     *
     * @param nameSurname The name and surname to be set as string
     */
    void setNameSurname(String nameSurname);

    /**
     * School number getter
     *
     * @return Number of that student
     * @throws NoSuchVariableToWorkException If there is no number field for user this'll be thrown
     */
    int getNumber() throws NoSuchVariableToWorkException;

    /**
     * Mail address getter
     *
     * @return Mail address of user as String
     */
    String getMail();

    /**
     * Mail address setter
     *
     * @param mail Mail address as string to be set
     */
    void setMail(String mail);


    /**
     * Number setter
     *
     * @param number Number to be set
     * @throws NoSuchVariableToWorkException If has no data field of number, exception threw
     */
    void setNumber(int number) throws NoSuchVariableToWorkException;

    /**
     * Lists User's courses in seperate lines each
     */
    void listUserCourses();

}

