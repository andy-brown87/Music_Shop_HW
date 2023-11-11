package Woodwind_Instruments;

import Woodwind_Instruments.WoodwindInstruments;

public class Oboe extends WoodwindInstruments {
    public Oboe(int costPrice, int retailPrice, String name, String reed, int buttons) {
        super(costPrice, retailPrice, name, reed, buttons);
    }

    @Override
    public String play() {
        return "Bommmmmm";
    }
}
