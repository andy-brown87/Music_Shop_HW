package Woodwind_Instruments;

import Woodwind_Instruments.WoodwindInstruments;

public class Oboe extends WoodwindInstruments {
    public Oboe(int costPrice, int retailPrice) {
        super(costPrice, retailPrice, name);
    }

    @Override
    public String play() {
        return null;
    }
}
