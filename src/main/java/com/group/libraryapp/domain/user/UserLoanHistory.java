package com.group.libraryapp.domain.user;

import jakarta.persistence.*;

@Entity
public class UserLoanHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private User user;

    private String bookName;

    private boolean isReturn;

    public UserLoanHistory(User user, String bookName){
        this.user = user;
        this.bookName = bookName;
        this.isReturn = false;
    }

    public String getBookName() {
        return bookName;
    }

    protected  UserLoanHistory() {

    }

    public void doReturn() {
        this.isReturn = true;
    }
}
