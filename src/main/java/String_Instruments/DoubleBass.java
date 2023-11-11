package String_Instruments;

import String_Instruments.StringInstruments;

public class DoubleBass extends StringInstruments {
    public DoubleBass(int costPrice, int retailPrice, String name, int numOfStrings, String material) {
        super(costPrice, retailPrice, name, numOfStrings, material);
    }

    @Override
    public String play() {
        return "bom bom bom";
    }
}
