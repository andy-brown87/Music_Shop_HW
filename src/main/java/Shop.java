import Interfaces.ISell;

import java.util.ArrayList;

public class Shop {

    private String name;
    private ArrayList<ISell>stock;

    public Shop(String name){
        this.name = name;
        this.stock = new ArrayList<ISell>();

    }

    public String getName() {
        return name;
    }

    public void addToStock(ISell item) {
        this.stock.add(item);
    }

    public void removeFromStock(ISell item) {
        this.stock.remove(item);
    }

    public int stockCount() {
        return this.stock.size();
    }

    public int totalPotentialProfit() {
        int total = 0;
        for (ISell item : stock) {
            total += item.calculateMarkup();
        }
        return total;
    }


}
