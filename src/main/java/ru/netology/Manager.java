package ru.netology;

public class Manager {
    private Movie[] movies = new Movie[0];
    private int amountMovies;

    public Manager(int amountMovies) {
        this.amountMovies = 10;
    }

    public Manager() {
    }

    //Добавление нового фильма
    public void add(Movie movie) {
        int length = movies.length + 1;
        Movie[] tmp = new Movie[length];
        System.arraycopy(movies, 0, tmp, 0, movies.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = movie;
        this.movies = tmp;
    }

    //Возвращение в обратном порядке согласно ограничению в 10 штук
    public Movie[] getAll(int amountMovies) {
        if (movies.length > amountMovies) {
            Movie[] result = new Movie[amountMovies];
            for (int i = 0; i < result.length; i++) {
                int index = movies.length - i - 1;
                result[i] = this.movies[index];
            }
            return result;
        } else {
            Movie[] result = new Movie[movies.length];
            for (int i = 0; i < result.length; i++) {
                int index = result.length - i - 1;
                result[i] = this.movies[index];
            }
            return result;
        }
    }

}

