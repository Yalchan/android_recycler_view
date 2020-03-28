package com.example.task6yhn17621653.model;

public class Movie {
    private int idMovie;
    private String title;
    private String genre;
    private Integer year;

    public Movie(int idMovie, String title, String genre, int year) {
        this.idMovie=idMovie;
        this.title = title;
        this.genre = genre;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public Integer getYear() {
        return year;
    }

    public int getIdMovie() {
        return idMovie;
    }
}
