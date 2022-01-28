package ru.netology;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class Movie {
    private int id;
    private String movieId;
    private String name;
    private String genre;
    private int amountMovies=10;

    public Movie(int amountMovies) {
        this.amountMovies = amountMovies;
    }

    public Movie(int id, String movieId, String name, String genre) {
        this.id = id;
        this.movieId = movieId;
        this.name = name;
        this.genre = genre;
    }
}
