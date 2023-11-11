
import Woodwind_Instruments.Bassoon;
import Woodwind_Instruments.Oboe;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OboeTest {

    Oboe oboe;


    @Before
    public void before(){
        oboe = new Oboe(200, 300, "Gebruder", "Lou", 19);
    }

    @Test
    public void hasCostPrice(){
        assertEquals( 200, oboe.getCostPrice());
    }

    @Test
    public void hasRetailPrice(){
        assertEquals(300, oboe.getRetailPrice());
    }

    @Test
    public void hasName(){
        assertEquals("Gebruder", oboe.getName());
    }

    @Test
    public void hasReed(){
        assertEquals("Lou", oboe.getReed());
    }

    @Test
    public void hasButtons(){
        assertEquals(19, oboe.getButtons());
    }

    @Test
    public void canGetMarkup(){
        assertEquals(100, oboe.calculateMarkup());
    }


}




