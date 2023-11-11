import String_Instruments.Banjo;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BanjoTest {

    Banjo banjo;

    @Before
    public void before(){
        banjo = new Banjo(100, 150, "Kazooey", 6, "Wooden");
    }

    @Test
    public void hasCostPrice(){
        assertEquals( 100, banjo.getCostPrice());
    }

    @Test
    public void hasRetailPrice(){
        assertEquals(150, banjo.getRetailPrice());
    }

    @Test
    public void hasName(){
        assertEquals("Kazooey", banjo.getName());
    }

    @Test
    public void hasNumOfStrings(){
        assertEquals(6, banjo.getNumOfStrings());
    }

    @Test
    public void hasMaterial(){
        assertEquals("Wooden", banjo.getMaterial());
    }

    @Test
    public void canGetMarkup(){
        assertEquals(50, banjo.calculateMarkup());
    }


}