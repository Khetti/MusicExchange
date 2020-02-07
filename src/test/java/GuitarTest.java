import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void setUp() {
        guitar = new Guitar("PRS", "Custom 24", "Sapphire", 550, 799, 6, "85/15 S");
    }

    @Test
    public void canGetBrand() {
        assertEquals("PRS", guitar.getBrand());
    }

    @Test
    public void canGetModel() {
        assertEquals("Custom 24", guitar.getModel());
    }

    @Test
    public void canGetColour() {
        assertEquals("Sapphire", guitar.getColour());
    }

    @Test
    public void canGetBuyPrice() {
        assertEquals(550, guitar.getBuyPrice(), 0.00);
    }

    @Test
    public void canGetSellPrice() {
        assertEquals(799, guitar.getSellPrice(), 0.00);
    }

    @Test
    public void canGetNoOfStrings() {
        assertEquals(6, guitar.getNoOfStrings());
    }

    @Test
    public void canGetPickups() {
        assertEquals("85/15 S", guitar.getPickups());
    }

}
