package String_Instruments;

import Stock.Stock;
import Interfaces.IPlay;

public abstract class StringInstruments extends Stock implements IPlay {

    private int Strings;

    public StringInstruments(int costPrice, int retailPrice, int Strings) {
        super(costPrice, retailPrice, name);
        this.Strings = Strings;

    }

    public int getStrings() {
        return Strings;
    }
}
