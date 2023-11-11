import Accesories.SheetMusic;
import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SheetMusicTest{

    SheetMusic sheetMusic;

    @Before
    public void before(){
        sheetMusic = new SheetMusic(15, 30, "101 Songs", "Classical");
    }

    @Test
    public void testGetRetailPrice() {
        assertEquals(30, sheetMusic.getRetailPrice());
    }

    @Test
    public void testGetCostPrice() {
        assertEquals(15, sheetMusic.getCostPrice());
    }

    @Test
    public void testTestGetName() {
        assertEquals("101 Songs", sheetMusic.getName());
    }

    @Test
    public void testGetGenre() {
        assertEquals("Classical", sheetMusic.getGenre());
    }

    @Test
    public void canGetMarkup(){
        assertEquals(15, sheetMusic.calculateMarkup());
    }
}