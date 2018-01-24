package by.gr00shik.Factory;

import by.gr00shik.movie.Horror;
import by.gr00shik.movie.Movie;
import by.gr00shik.music.Metal;
import by.gr00shik.music.Music;

public class Night implements AbstractFactory {
    @Override
    public Movie getMovie() {
        return new Horror();
    }

    @Override
    public Music getMusic() {
        return new Metal();
    }
}
