package by.gr00shik;

import by.gr00shik.Factory.AbstractFactory;
import by.gr00shik.Factory.Day;
import by.gr00shik.Factory.Night;
import by.gr00shik.movie.Movie;
import by.gr00shik.music.Music;

public class MainApp {
    public static void main(String[] args) {

//        AbstractFactory factory = new Day();
        AbstractFactory factory = new Night();
        Movie movie = factory.getMovie();
        Music music = factory.getMusic();
        movie.getGenre();
        movie.getName();
        System.out.println("-------------------");
        music.getGenre();
        music.getName();

    }
}
