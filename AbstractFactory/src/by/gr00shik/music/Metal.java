package by.gr00shik.music;

public class Metal implements Music {
    @Override
    public void getGenre() {
        System.out.println("Metal music");
    }

    @Override
    public void getName() {
        System.out.println("Metallica");
    }
}
