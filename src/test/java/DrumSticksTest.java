import Accesories.DrumSticks;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumSticksTest {

    DrumSticks drumSticks;

    @Before
    public void before(){
        drumSticks = new DrumSticks(4, 10, "5A", "12 inches");
    }

    @Test
    public void hasCostPrice(){
        assertEquals(4, drumSticks.getCostPrice());
    }

    @Test
    public void hasRetailPrice(){
        assertEquals(10, drumSticks.getRetailPrice());
    }

    @Test
    public void hasName(){
        assertEquals("5A", drumSticks.getName());
    }

    @Test
    public void hasLength(){
        assertEquals("12 inches", drumSticks.getLength());
    }

    @Test
    public void canGetMarkup(){
        assertEquals(6, drumSticks.calculateMarkup());
    }



}
