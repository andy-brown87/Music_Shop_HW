package Accesories;

public class SheetMusic extends Accesories{

    private String Genre;
    public SheetMusic(int costPrice, int retailPrice, String name, String genre) {
        super(costPrice, retailPrice, name);
        Genre = genre;
    }

    public String getGenre() {
        return Genre;
    }


}
