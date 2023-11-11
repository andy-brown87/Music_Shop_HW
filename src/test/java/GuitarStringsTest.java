import Accesories.DrumSticks;
import Accesories.GuitarStrings;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarStringsTest {

    GuitarStrings guitarStrings;

    @Before
    public void before(){
        guitarStrings = new GuitarStrings(5, 15, "4B", "Bass");
    }

    @Test
    public void hasCostPrice(){
        assertEquals(5, guitarStrings.getCostPrice());
    }

    @Test
    public void hasRetailPrice(){
        assertEquals(15, guitarStrings.getRetailPrice());
    }

    @Test
    public void hasName(){
        assertEquals("4B", guitarStrings.getName());
    }

    @Test
    public void hasTypeOfString(){
        assertEquals("Bass", guitarStrings.getTypeOfString());
    }

    @Test
    public void canGetMarkup(){
        assertEquals(10, guitarStrings.calculateMarkup());
    }



}

