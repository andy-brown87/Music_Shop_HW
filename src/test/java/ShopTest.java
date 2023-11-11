import Accesories.DrumSticks;
import Accesories.GuitarStrings;
import Accesories.SheetMusic;
import Interfaces.ISell;
import String_Instruments.Banjo;
import String_Instruments.DoubleBass;
import String_Instruments.Guitar;
import Woodwind_Instruments.Bassoon;
import Woodwind_Instruments.Flute;
import Woodwind_Instruments.Oboe;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    ISell banjo;
    ISell bassoon;
    ISell doubleBass;
    ISell drumSticks;
    ISell flute;
    ISell guitarStrings;
    ISell guitar;
    ISell oboe;
    ISell sheetMusic;


    @Before
    public void before(){
        shop = new Shop("Ray's Music Exchange");
        banjo = new Banjo(200, 350, "Deliverance", 12, "Bamboo");
        bassoon = new Bassoon(500, 700, "Big Bassa", "John", 10);
        doubleBass = new DoubleBass(300, 400, "Betty", 8, "Match sticks");
        drumSticks = new DrumSticks(10, 25, "10Z", "10 inches");
        flute = new Flute(100, 300, "Gazza", "Jack", 20);
        guitarStrings = new GuitarStrings(20, 45, "12E", "12 String");
        guitar = new Guitar(700, 1000, "Les Paul", 6, "Electric");
        oboe = new Oboe(500, 800, "David", "Jim", 24);
        sheetMusic = new SheetMusic(10, 20, "200 Songs","Thrash Metal");

    }

    @Test
    public void hasName() {
        assertEquals("Ray's Music Exchange", shop.getName());
    }

    @Test
    public void canAddItemToStock(){
        shop.addToStock(banjo);
        assertEquals(1, shop.stockCount());
    }

    @Test
    public void canRemoveItemFromStock() {
        shop.addToStock(banjo);
        shop.removeFromStock(banjo);
        assertEquals(0, shop.stockCount());
    }

    @Test
    public void canGetTotalPotentialProfit() {
        shop.addToStock(banjo);
        shop.addToStock(bassoon);
        shop.addToStock(doubleBass);
        shop.addToStock(drumSticks);
        shop.addToStock(flute);
        shop.addToStock(guitarStrings);
        shop.addToStock(guitar);
        shop.addToStock(oboe);
        shop.addToStock(sheetMusic);
        assertEquals(1300, shop.totalPotentialProfit());
    }
}
