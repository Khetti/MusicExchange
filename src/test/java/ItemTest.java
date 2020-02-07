import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ItemTest {

    Item item;

    @Before
    public void setUp() {
        item = new Item("Guitar Strings", 3, 6.49);
    }

    @Test
    public void canGetType() {
        assertEquals("Guitar Strings", item.getType());
    }

    @Test
    public void canGetBuyPrice() {
        assertEquals(3, item.getBuyPrice(), 0.00);
    }

    @Test
    public void canGetSellPrice() {
        assertEquals(6.49, item.getSellPrice(), 0.00);
    }

    @Test
    public void canSetSellPrice() {
        item.setSellPrice(6.99);
        assertEquals(6.99, item.getSellPrice(), 0.00);
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(3.49, item.calculateMarkup(), 0.00);
    }

}
