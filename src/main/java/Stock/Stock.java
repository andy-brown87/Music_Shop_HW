package Stock;

import Interfaces.ISell;


public abstract class Stock implements ISell {

    private int retailPrice;
    private int costPrice;
    private String name;
    private InstrumentType type;

    public Stock(int costPrice, int retailPrice, String name, InstrumentType type) {

        this.costPrice = costPrice;
        this.retailPrice = retailPrice;
        this.name = name;
        this.type = type;

    }

    public int getRetailPrice() {
        return retailPrice;
    }

    public int getCostPrice() {
        return costPrice;
    }

    public String getName() {
        return name;
    }

    public InstrumentType getType() {
        return type;
    }

    public int calculateMarkup() {
        return this.retailPrice - this.costPrice;
    }

}
