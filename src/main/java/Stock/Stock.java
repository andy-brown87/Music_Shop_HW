package Stock;

import Interfaces.ISell;

public abstract class Stock implements ISell {

    private int retailPrice;
    private int costPrice;
    private String name;

    public Stock(int costPrice, int retailPrice, String name) {

        this.costPrice = costPrice;
        this.retailPrice = retailPrice;
        this.name = name;

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

    public int calculateMarkup() {
        return this.retailPrice - this.costPrice;
    }
}
