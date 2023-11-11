package Woodwind_Instruments;

import Woodwind_Instruments.WoodwindInstruments;

public class Flute extends WoodwindInstruments {
    public Flute(int costPrice, int retailPrice, String name, String reed, int buttons) {
        super(costPrice, retailPrice, name, reed, buttons);
    }

    @Override
    public String play() {
        return "Whistle";
    }
}
