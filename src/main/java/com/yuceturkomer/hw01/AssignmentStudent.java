package com.yuceturkomer.hw01;

/**
 * An abstract class which implements AssignmentStudentInterface.
 * The assignment that will be sent is type of this class.
 */
public abstract class AssignmentStudent implements AssignmentStudentInterface {
    private String assigName;
    protected String assigType;

    /**
     * The only constructor of this class. Sets the name by given parameter.
     * @param assigName The assignment name will be set as this variable.
     */
    public AssignmentStudent(String assigName) {
        setAssigName(assigName);
    }

    /**
     * Getter of assignment type
     * @return Returns assignment type
     */
    public String getAssigType() {
        return assigType;
    }

    /**
     * Getter of assignment name
     * @return Returns assignment name
     */
    public String getAssigName() {
        return assigName;
    }

    /**
     * Setter of assignment name
     */
    public void setAssigName(String assigName) {
        this.assigName = assigName;
    }

    /**
     * toString overriding
     * @return Returns the expected string format
     */
    @Override
    public String toString() {
        return "Assignment " + getAssigType() + getAssigName();
    }

    /**
     * equals overriding
     * @param o represents the object which will be compared with "this" object
     * @return Returns true if variables are equal. Else returns false.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AssignmentStudent)) return false;

        AssignmentStudent that = (AssignmentStudent) o;

        if (!getAssigName().equals(that.getAssigName())) return false;
        return getAssigType().equals(that.getAssigType());

    }

}
