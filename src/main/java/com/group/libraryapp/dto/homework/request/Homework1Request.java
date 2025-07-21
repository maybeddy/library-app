package com.group.libraryapp.dto.homework.request;

public class Homework1Request {
    private final int num1;
    private final int num2;

    public Homework1Request(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    
    public int getNum1() {
        return num1;
    }
    public int getNum2() {
        return num2;
    }
}
