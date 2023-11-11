package String_Instruments;

import String_Instruments.StringInstruments;

public class Guitar extends StringInstruments {
    public Guitar(int costPrice, int retailPrice, String name, int numOfStrings, String material) {
        super(costPrice, retailPrice, name, numOfStrings, material);
    }

    @Override
    public String play() {
        return "Strum";
    }




}
