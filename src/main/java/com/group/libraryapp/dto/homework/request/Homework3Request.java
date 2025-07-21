package com.group.libraryapp.dto.homework.request;

import java.util.List;

public class Homework3Request {
    private final List<Integer> numbers;

    public Homework3Request(List<Integer> numbers) {
        this.numbers = numbers;
    }

    public List<Integer> getNumbers() {
        return numbers;
    }
}
