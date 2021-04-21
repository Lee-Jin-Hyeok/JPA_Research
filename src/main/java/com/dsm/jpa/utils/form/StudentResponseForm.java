package com.dsm.jpa.utils.form;

public class StudentResponseForm {

    private String studentName;
    private String schoolName;
    private String location;

    public StudentResponseForm() {}
    public StudentResponseForm(String studentName, String schoolName, String location) {
        this.studentName = studentName;
        this.schoolName = schoolName;
        this.location = location;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
