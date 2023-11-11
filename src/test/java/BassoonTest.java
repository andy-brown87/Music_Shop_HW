import String_Instruments.Banjo;
import String_Instruments.DoubleBass;
import Woodwind_Instruments.Bassoon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BassoonTest {

    Bassoon bassoon;


    @Before
    public void before(){
        bassoon = new Bassoon(250, 350, "Ya Bassa", "Mike", 8);
    }

    @Test
    public void hasCostPrice(){
        assertEquals( 250, bassoon.getCostPrice());
    }

    @Test
    public void hasRetailPrice(){
        assertEquals(350, bassoon.getRetailPrice());
    }

    @Test
    public void hasName(){
        assertEquals("Ya Bassa", bassoon.getName());
    }

    @Test
    public void hasReed(){
        assertEquals("Mike", bassoon.getReed());
    }

    @Test
    public void hasButtons(){
        assertEquals(8, bassoon.getButtons());
    }

    @Test
    public void canGetMarkup(){
        assertEquals(100, bassoon.calculateMarkup());
    }


}



