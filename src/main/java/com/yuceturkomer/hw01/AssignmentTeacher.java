package com.yuceturkomer.hw01;

import java.util.ArrayList;

/**
 * This class provides teacher to give assignment. It holds an AssignmentStudent arraylist.
 */
public class AssignmentTeacher {
    private String assigName;

    /**
     * Constructor of class, sets the assignment name as given parameter value.
     * @param assigName name is changed as this.
     */
    public AssignmentTeacher(String assigName) {
        setAssigName(assigName);
    }

    /**
     * getter of name
     * @return name of assignment
     */
    public String getAssigName() {
        return assigName;
    }

    /**
     * setter of mame
     * @param assigName the parameter value that name is set by
     */
    public void setAssigName(String assigName) {
        this.assigName = assigName;
    }

    /**
     * Visibility = package arraylist.
     */
    ArrayList<AssignmentStudent> assignmentStudentArrayList = new ArrayList<AssignmentStudent>();

    /**
     * Equals overriding
     * @param o Is the object that is compared.
     * @return Returns true if data fields are same. Else, false.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AssignmentTeacher)) return false;

        AssignmentTeacher that = (AssignmentTeacher) o;

        return getAssigName().equals(that.getAssigName());

    }

    @Override
    public String toString() {
        return "Teacher assignment array. Name: " + getAssigName();
    }
}
