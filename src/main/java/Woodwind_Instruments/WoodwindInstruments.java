package Woodwind_Instruments;

import Stock.Stock;
import Interfaces.IPlay;

public abstract class WoodwindInstruments extends Stock implements IPlay {

    private String reed;

    private int buttons;

    public WoodwindInstruments(int costPrice, int retailPrice, String reed, int buttons) {
        super(costPrice, retailPrice, name);
        this.reed = reed;
        this.buttons= buttons;
    }
}

