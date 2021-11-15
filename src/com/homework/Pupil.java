package com.homework;

public class Pupil {
    private String name;
    private String fullName;
    private String fathersName;

    public void setName(String name) {
        this.name = name;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setFathersName(String fatherName) {
        this.fathersName = fatherName;
    }

    public String getName() {
        return name;
    }

    public String getFullName() {
        return fullName;
    }

    public String getFathersName() {
        return fathersName;
    }

    void study() {
        System.out.println("Це новий учень. Рівень робіт має оцінюватися вчителем від 1 до 12 балів.");
    }

    void read() {
        System.out.println("Читати потрібно від 120 слів на хвилину.");
    }

    void write() {
        System.out.println("Писати один твір на 5 днів.");
    }

    void relax() {
        System.out.println("Відпочивати на свіжому повітрі, на природі.");
    }
}
