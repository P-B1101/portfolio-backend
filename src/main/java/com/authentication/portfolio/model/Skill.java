package com.authentication.portfolio.model;

import com.fasterxml.jackson.annotation.JsonValue;

public class Skill {

    private String title;
    private SkillRate rate;

    public String getTitle() {
        return title;
    }

    public SkillRate getRate() {
        return rate;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setRate(SkillRate rate) {
        this.rate = rate;
    }

}

enum SkillRate {
    STARTER(1),
    GOOD(2),
    ADVANCE(3);

    @JsonValue
    public final int rate;

    private SkillRate(int rate) {
        this.rate = rate;
    }
}