package com.group.libraryapp.dto.homework.request;

import java.time.LocalDate;

public class Homework2Request {
    private final LocalDate date;

    public Homework2Request(LocalDate date) {
        this.date = date;
    }

    public LocalDate getDate() {
        return date;
    }
}
