package String_Instruments;

import Stock.Stock;
import Interfaces.IPlay;

import javax.sound.midi.Instrument;

public abstract class StringInstruments extends Stock implements IPlay {

    private int NumOfStrings;
    private String Material;


    public StringInstruments(int costPrice, int retailPrice, String name, int numOfStrings, String material) {
        super(costPrice, retailPrice, name);
        NumOfStrings = numOfStrings;
        Material = material;
    }

    public int getNumOfStrings() {
        return NumOfStrings;
    }

    public String getMaterial() {
        return Material;
    }



}
