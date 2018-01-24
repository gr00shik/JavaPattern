package by.gr00shik.movie;

public class Comedy implements Movie {
    @Override
    public void getGenre() {
        System.out.println("Comedy films");
    }

    @Override
    public void getName() {
        System.out.println("Allways says YES");
    }
}
