package Accesories;

public class DrumSticks extends Accesories{

    private String Length;

    public DrumSticks(int costPrice, int retailPrice, String name, String length) {
        super(costPrice, retailPrice, name);
        Length = length;
    }

    public String getLength() {
        return Length;
    }
}
