import String_Instruments.Banjo;
import String_Instruments.DoubleBass;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DoubleBassTest {

    DoubleBass doubleBass;


        @Before
        public void before(){
            doubleBass = new DoubleBass(200, 300, "Bertha", 4, "Wooden");
        }

        @Test
        public void hasCostPrice(){
            assertEquals( 200, doubleBass.getCostPrice());
        }

        @Test
        public void hasRetailPrice(){
            assertEquals(300, doubleBass.getRetailPrice());
        }

        @Test
        public void hasName(){
            assertEquals("Bertha", doubleBass.getName());
        }

        @Test
        public void hasNumOfStrings(){
            assertEquals(4, doubleBass.getNumOfStrings());
        }

        @Test
        public void hasMaterial(){
            assertEquals("Wooden", doubleBass.getMaterial());
        }

        @Test
        public void canGetMarkup(){
            assertEquals(100, doubleBass.calculateMarkup());
    }


}


