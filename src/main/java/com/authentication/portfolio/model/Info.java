package com.authentication.portfolio.model;

public class Info {

    private String name;
    private String lastName;
    private String phoneNumber;
    private String email;
    private String image;
    private String linkedInUrl;
    private String portfolioUrl;
    private String githubUrl;

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public String getImage() {
        return image;
    }

    public String getLinkedInUrl() {
        return linkedInUrl;
    }

    public String getPortfolioUrl() {
        return portfolioUrl;
    }

    public String getGithubUrl() {
        return githubUrl;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setLinkedInUrl(String linkedInUrl) {
        this.linkedInUrl = linkedInUrl;
    }

    public void setPortfolioUrl(String portfolioUrl) {
        this.portfolioUrl = portfolioUrl;
    }

    public void setGithubUrl(String githubUrl) {
        this.githubUrl = githubUrl;
    }

}
