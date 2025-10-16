package com;

public class Car1 {
    private String color;
    private int year;

    public Car1(String color, int year) {
        this.color = color;
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public void carStatus() {
        System.out.println("Car Status: Running!");
    }
}
