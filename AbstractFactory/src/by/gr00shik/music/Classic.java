package by.gr00shik.music;

public class Classic implements Music {
    @Override
    public void getGenre() {
        System.out.println("Classic music");
    }

    @Override
    public void getName() {
        System.out.println("Chaikovski");
    }
}
