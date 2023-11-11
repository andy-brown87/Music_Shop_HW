
import String_Instruments.Guitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;


    @Before
    public void before(){
        guitar = new Guitar(400, 500, "Flying V", 6, "Steel");
    }

    @Test
    public void hasCostPrice(){
        assertEquals( 400, guitar.getCostPrice());
    }

    @Test
    public void hasRetailPrice(){
        assertEquals(500, guitar.getRetailPrice());
    }

    @Test
    public void hasName(){
        assertEquals("Flying V", guitar.getName());
    }

    @Test
    public void hasNumOfStrings(){
        assertEquals(6, guitar.getNumOfStrings());
    }

    @Test
    public void hasMaterial(){
        assertEquals("Steel", guitar.getMaterial());
    }

    @Test
    public void canGetMarkup(){
        assertEquals(100, guitar.calculateMarkup());
    }


}



