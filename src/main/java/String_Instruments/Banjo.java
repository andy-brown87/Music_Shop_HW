package String_Instruments;

import String_Instruments.StringInstruments;

public class Banjo extends StringInstruments {
    public Banjo(int costPrice, int retailPrice, String name, int numOfStrings, String material) {
        super(costPrice, retailPrice, name, numOfStrings, material);
    }

    @Override
    public String play() {
        return "di du di du";
    }






}
