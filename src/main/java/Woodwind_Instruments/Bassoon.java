package Woodwind_Instruments;

import Woodwind_Instruments.WoodwindInstruments;

public class Bassoon extends WoodwindInstruments {
    public Bassoon(int costPrice, int retailPrice) {
        super(costPrice, retailPrice, name);
    }

    @Override
    public String play() {
        return null;
    }
}
