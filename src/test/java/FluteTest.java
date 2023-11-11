
import Woodwind_Instruments.Flute;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FluteTest {

    Flute flute;


    @Before
    public void before(){
        flute = new Flute(50, 100, "Toot", "Oliver", 16);
    }

    @Test
    public void hasCostPrice(){
        assertEquals( 50, flute.getCostPrice());
    }

    @Test
    public void hasRetailPrice(){
        assertEquals(100, flute.getRetailPrice());
    }

    @Test
    public void hasName(){
        assertEquals("Toot", flute.getName());
    }

    @Test
    public void hasReed(){
        assertEquals("Oliver", flute.getReed());
    }

    @Test
    public void hasButtons(){
        assertEquals(16, flute.getButtons());
    }

    @Test
    public void canGetMarkup(){
        assertEquals(50, flute.calculateMarkup());
    }


}




