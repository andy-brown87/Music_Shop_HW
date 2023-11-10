package String_Instruments;

import String_Instruments.StringInstruments;

public class Banjo extends StringInstruments {
    public Banjo(int costPrice, int retailPrice) {
        super(costPrice, retailPrice, name);
    }

    @Override
    public String play() {
        return null;
    }
}
