package com.survivalcoding;

public class Book extends TangibleAsset {
    private String isbn;

    public Book(String name, int price, String color, double weight, String isbn) {
        super(name, price, color, weight);
        this.isbn = isbn;
    }

    public String Getisbn() {
        return isbn;
    }
}
