package ru.job4j.pojo;

public class Book {
    private String name;
    private String genre;
    private int count;

    public Book(String name, String genre, int count) {
        this.name = name;
        this.genre = genre;
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

}
