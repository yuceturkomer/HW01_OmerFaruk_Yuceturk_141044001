package com.yuceturkomer.hw01;

/**
 * Created by ömer on 21.2.2016.
 */
public abstract class AssignmentStudent implements AssignmentStudentInterface {
    private String assigName;
    protected String assigType;

    public AssignmentStudent(String assigName) {
        setAssigName(assigName);
    }

    public String getAssigType() {
        return assigType;
    }

    public String getAssigName() {
        return assigName;
    }

    public void setAssigName(String assigName) {
        this.assigName = assigName;
    }

    @Override
    public String toString() {
        return "Document" + getAssigType() + getAssigName();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AssignmentStudent)) return false;

        AssignmentStudent that = (AssignmentStudent) o;

        if (!getAssigName().equals(that.getAssigName())) return false;
        return getAssigType().equals(that.getAssigType());

    }

}
