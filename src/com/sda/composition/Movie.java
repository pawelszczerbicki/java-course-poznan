package com.sda.composition;

public class Movie {
    private String author;
    private String title;

    public Movie setAuthor(String author) {
        this.author = author;
        return this;
    }

    public Movie setTitle(String title) {
        this.title = title;
        return this;
    }

    public static void main(String[] args) {
        Movie m = new Movie()
                .setAuthor("")
                .setTitle("");
    }
}
