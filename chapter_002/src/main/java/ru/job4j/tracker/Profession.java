package ru.job4j.tracker;

public class Profession {
    private String firstName;
    private String lastName;
    private String education;
    private int birthday;

    public String getName() {
        String name = Profession.this.firstName;
        return name;
    }
    public String getLastName() {
        String lastName = Profession.this.lastName;
        return lastName;
    }
    public String getEducation() {
        String education = Profession.this.education;
        return education;
    }
    public int getBirthday() {
        int birthday = Profession.this.birthday;
        return birthday;
    }

}
