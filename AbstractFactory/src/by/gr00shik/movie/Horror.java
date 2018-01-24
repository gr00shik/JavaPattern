package by.gr00shik.movie;

public class Horror implements Movie {
    @Override
    public void getGenre() {
        System.out.println("Horror films");
    }

    @Override
    public void getName() {
        System.out.println("SAW");
    }
}
