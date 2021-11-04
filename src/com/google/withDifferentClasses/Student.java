package com.google.withDifferentClasses;

public class Student {

    private String name;
    private Integer experience;
    private Float purposefulness;

    public Student(String name, Integer experience, Float purposefulness) {
        this.name = name;
        this.experience = experience;
        this.purposefulness = purposefulness;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getExperience() {
        return experience;
    }

    public void setExperience(Integer experience) {
        this.experience = experience;
    }

    public Float getPurposefulness() {
        return purposefulness;
    }

    public void setPurposefulness(Float purposefulness) {
        this.purposefulness = purposefulness;
    }
}
