package com.company;

public class Employee {
    private String lastName, phoneNumber;
    private int day, month, year;

    public Employee(String lastName, String phoneNumber, int day, int month, int year) {
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }


}
