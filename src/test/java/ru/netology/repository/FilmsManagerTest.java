package ru.netology.repository;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FilmsManagerTest {

    @Test
    public void addFilm() {
        FilmsManager films = new FilmsManager();

        films.add("Фильм 1");
        films.add("Фильм 2");
        films.add("Фильм 3");

        String[] expected = {"Фильм 1", "Фильм 2", "Фильм 3"};
        String[] actual = films.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void returnLast3Films1() {
        FilmsManager films = new FilmsManager();

        films.add("Фильм 1");
        films.add("Фильм 2");
        films.add("Фильм 3");

        String[] expected = {"Фильм 3", "Фильм 2", "Фильм 1"};
        String[] actual = films.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void returnLast3Films2() {
        FilmsManager films = new FilmsManager(3);

        films.add("Фильм 1");
        films.add("Фильм 2");
        films.add("Фильм 3");
        films.add("Фильм 4");

        String[] expected = {"Фильм 4", "Фильм 3", "Фильм 2"};
        String[] actual = films.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void returnLast5Films() {
        FilmsManager films = new FilmsManager();

        films.add("Фильм 1");
        films.add("Фильм 2");
        films.add("Фильм 3");
        films.add("Фильм 4");
        films.add("Фильм 5");
        films.add("Фильм 6");
        films.add("Фильм 7");
        films.add("Фильм 8");

        String[] expected = {"Фильм 8", "Фильм 7", "Фильм 6", "Фильм 5", "Фильм 4"};
        String[] actual = films.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

}
