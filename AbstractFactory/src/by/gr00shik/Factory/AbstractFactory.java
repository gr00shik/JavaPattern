package by.gr00shik.Factory;

import by.gr00shik.movie.Movie;
import by.gr00shik.music.Music;

public interface AbstractFactory {
    Movie getMovie();
    Music getMusic();
}
