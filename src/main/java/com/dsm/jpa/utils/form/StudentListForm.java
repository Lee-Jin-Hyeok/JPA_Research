package com.dsm.jpa.utils.form;

import java.util.List;

public class StudentListForm {
    private List<StudentResponseForm> students;

    public StudentListForm() {}
    public StudentListForm(List<StudentResponseForm> students) {
        this.students = students;
    }

    public List<StudentResponseForm> getStudents() {
        return students;
    }

    public void setStudents(List<StudentResponseForm> students) {
        this.students = students;
    }
}
