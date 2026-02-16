package com.moynul.dept; // তোমার প্রজেক্টের প্যাকেজ নাম দাও

public class Department {
    private String name;
    private int studentCount;

    public Department(String name, int studentCount) {
        this.name = name;
        this.studentCount = studentCount;
    }

    public String getName() { return name; }
    public int getStudentCount() { return studentCount; }
}