package Woodwind_Instruments;

import Woodwind_Instruments.WoodwindInstruments;

public class Flute extends WoodwindInstruments {
    public Flute(int costPrice, int retailPrice) {
        super(costPrice, retailPrice, name);
    }

    @Override
    public String play() {
        return null;
    }
}
