package com.twschool.practice;

public class GameResultInfo {
    private Boolean isOver;
    private String Description;

    public GameResultInfo() {
    }

    public GameResultInfo(Boolean isOver, String description) {
        this.isOver = isOver;
        Description = description;
    }

    public Boolean getOver() {
        return isOver;
    }

    public void setOver(Boolean over) {
        isOver = over;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }
}
