package ru.netology.repository;

public class FilmsManager {
    private String[] films = new String[0];
    private int count = 5;

    public void add(String film) {
        String[] tmp = new String[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = film;
        films = tmp;
    }

    public String[] findAll() {
        return films;
    }

    public String[] findLast() {
        if (films.length < count){
            count = films.length;
        }

        String[] tmp = new String[count];

        for (int i = 0; i < count; i++) {
            tmp[i] = films[films.length - 1 - i];
        }

        return tmp;
    }

    public String[] findLast(int count) {
        if (films.length < count){
            count = films.length;
        }

        String[] tmp = new String[count];

        for (int i = 0; i < count; i++) {
            tmp[i] = films[films.length - 1 - i];
        }

        return tmp;
    }

}
