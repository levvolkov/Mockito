package ru.netology;

public class PosterManager {
    private int movie;

    public PosterManager(int movie) {
        this.movie = movie;
    }
    private PosterManager[] movies = new PosterManager[0];

    public void add(PosterManager movie) {
        PosterManager[] tmp = new PosterManager[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[tmp.length - 1] = movie;
        movies = tmp;
    }
    public PosterManager[] findAll() {

        return movies;
    }
    public PosterManager[] findLast() {
        int resultLength;
        if (movies.length >= movie)   {
            resultLength = movie;
        } else {
            resultLength = movies.length;
        }

        PosterManager[] result = new PosterManager[resultLength];
        for (int i = 0; i < resultLength; i++) {
            result[i] = movies[movies.length - 1 - i];
        }
        return result;
    }
}
