package com.example.refund.entities;

public class RefundRequest {
    private String userId;
    private Refund book;

    public RefundRequest() {
    }

    public RefundRequest(String userId, Refund book) {
        this.userId = userId;
        this.book = book;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Refund getBook() {
        return book;
    }

    public void setBook(Refund book) {
        this.book = book;
    }

    @Override
    public String toString() {
        return "RefundRequest{" +
                "userId='" + userId + '\'' +
                ", book=" + book +
                '}';
    }
}
