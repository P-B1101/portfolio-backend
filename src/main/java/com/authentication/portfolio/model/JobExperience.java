package com.authentication.portfolio.model;

import java.util.Date;

public class JobExperience {

    private String company;
    private String title;
    private Date fromDate;
    private Date toDate;
    private Boolean isContinue;

    public String getCompany() {
        return company;
    }

    public String getTitle() {
        return title;
    }

    public Date getFromDate() {
        return fromDate;
    }

    public Date getToDate() {
        return toDate;
    }

    public Boolean getIsContinue() {
        return isContinue;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    public void setToDate(Date toDate) {
        this.toDate = toDate;
    }

    public void setIsContinue(Boolean isContinue) {
        this.isContinue = isContinue;
    }

}