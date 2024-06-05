package com.authentication.portfolio.model;

import java.util.Date;

public class Education {

    private String mainField;
    private String academicOrientation;
    private String school;
    private Date fromDate;
    private Date toDate;

    public String getMainField() {
        return mainField;
    }

    public String getAcademicOrientation() {
        return academicOrientation;
    }

    public String getSchool() {
        return school;
    }

    public Date getFromDate() {
        return fromDate;
    }

    public Date getToDate() {
        return toDate;
    }

    public void setMainField(String mainField) {
        this.mainField = mainField;
    }

    public void setAcademicOrientation(String academicOrientation) {
        this.academicOrientation = academicOrientation;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    public void setToDate(Date toDate) {
        this.toDate = toDate;
    }

}
