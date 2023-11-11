package Accesories;

public class GuitarStrings extends Accesories{

    private String TypeOfString;
    public GuitarStrings(int costPrice, int retailPrice, String name, String typeOfString) {
        super(costPrice, retailPrice, name);
        TypeOfString = typeOfString;
    }

    public String getTypeOfString() {
        return TypeOfString;
    }
}
