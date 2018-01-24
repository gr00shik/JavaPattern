package by.gr00shik.Factory;

import by.gr00shik.movie.Comedy;
import by.gr00shik.movie.Movie;
import by.gr00shik.music.Classic;
import by.gr00shik.music.Music;

public class Day implements AbstractFactory {
    @Override
    public Movie getMovie() {
        return new Comedy();
    }

    @Override
    public Music getMusic() {
        return new Classic();
    }
}
