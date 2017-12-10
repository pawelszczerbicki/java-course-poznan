package com.sda;

public class Movie {
    private String title;
    private String author;

    public Movie(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public Movie setTitle(String title) {
        return new Movie(title, this.author);
    }

    public Movie setAuthor(String author) {
        return new Movie(this.title, author);
    }
}
