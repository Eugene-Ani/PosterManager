package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovieTest {
    private Movie first = new Movie(1, "poster-bloodshot", "Bloodshot", "Action");
    private Movie second = new Movie(2, "poster-forward", "Forward", "Animation");
    private Movie third = new Movie(3, "poster-hotel Belgrade", "Hotel Belgrade", "Comedy");
    private Movie fourth = new Movie(4, "poster-gentlemen", "Gentlemen", "Action");
    private Movie fifth = new Movie(5, "poster-invisible Man", "Invisible Man", "Horror");
    private Movie sixth = new Movie(6, "poster-trolls", "Trolls", "Animation");
    private Movie seventh = new Movie(7, "poster-number one", "Number one", "Action");
    private Movie eighth = new Movie(8, "poster-what the hell", "What the hell", "Action");
    private Movie ninth = new Movie(9, "poster-i write heresy", "I write heresy", "Journalism");
    private Movie tenth = new Movie(10, "poster-I want to go on vacation", "I want to go on vacation", "Animation");
    private Movie eleventh = new Movie(11, "poster-sleep, eat, two barrels", "Sleep, eat, two barrels", "Rave");
    private Movie twelfth = new Movie(12, "poster-Good night kids", "Good night kids", "Horror");

    @Test //количество фильмов больше порога
    public void shouldGive10Movies() {
        Manager manager = new Manager();
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);
        manager.add(tenth);
        manager.add(eleventh);
        manager.add(twelfth);

        Movie[] actual = manager.getAll(10);
        Movie[] expected = new Movie[]{twelfth, eleventh, tenth, ninth, eighth, seventh, sixth, fifth, fourth, third};
        assertArrayEquals(expected, actual);

    }

    @Test //количество фильмов больше порога
    public void shouldGive10MoviesBorder() {
        Manager manager = new Manager();
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);
        manager.add(tenth);

        Movie[] actual = manager.getAll(10);
        Movie[] expected = new Movie[]{tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};
        assertArrayEquals(expected, actual);

    }

    @Test //количество фильмов среднее значение
    public void shouldGive9OrLessMovies() {
        Manager manager = new Manager();
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);

        Movie[] actual = manager.getAll(6);
        Movie[] expected = new Movie[]{sixth, fifth, fourth, third, second, first};
        assertArrayEquals(expected, actual);
    }
}