package ru.mephi.java.ch02.dop;

import java.util.ArrayList;
import java.util.List;

public class MovieData {
    public List<String> titles = new ArrayList<>(),
            directors = new ArrayList<>();

    {
        add("Jurassic Park", "Steven Spielberg");
        add("The Dark Night", "Christopher Nolan");
        add("Titanic", "James Cameron");
    }

    private void add(String title, String director) {
        titles.add(title);
        directors.add(director);
    }
}