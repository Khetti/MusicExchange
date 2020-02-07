import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    Guitar guitar;
    Item item;

    @Before
    public void setUp() {
        shop = new Shop();
        guitar = new Guitar("PRS", "Custom 24", "Sapphire", 550, 799, 6, "85/15 S");
        item = new Item("Guitar Strings", 3, 6.49);
    }

    @Test
    public void hasEmptyArray() {
        assertEquals(0, shop.getStockCount());
    }

    @Test
    public void canAddToStock() {
        shop.addToStock(guitar);
        shop.addToStock(item);
        assertEquals(2, shop.getStockCount());
    }

    @Test
    public void canRemoveFromStock() {
        shop.addToStock(guitar);
        shop.addToStock(item);
        shop.removeFromStock(guitar);
        assertEquals(1, shop.getStockCount());
    }

}
