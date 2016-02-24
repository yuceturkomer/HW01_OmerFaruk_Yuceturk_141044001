package com.yuceturkomer.hw01;

import java.util.ArrayList;

/**
 * Created by ömer on 23.2.2016.
 */
public class AssignmentTeacher {
    private String assigName;

    public AssignmentTeacher(String assigName) {
        setAssigName(assigName);
    }

    public String getAssigName() {
        return assigName;
    }

    public void setAssigName(String assigName) {
        this.assigName = assigName;
    }

    ArrayList<AssignmentStudent> assignmentStudentArrayList = new ArrayList<AssignmentStudent>();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AssignmentTeacher)) return false;

        AssignmentTeacher that = (AssignmentTeacher) o;

        return getAssigName().equals(that.getAssigName());

    }

}
