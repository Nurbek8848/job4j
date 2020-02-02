package ru.job4j.tracker;

public class Doctor extends Profession {
    private String recipe;

    public Diagnose diagnoseHeal(Patient patient) {
        Diagnose diagnose = new Diagnose(patient);
        return diagnose;
    }
    public void treatment() {
    }
}
