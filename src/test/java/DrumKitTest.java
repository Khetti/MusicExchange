import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumKitTest {

    DrumKit drumKit;

    @Before
    public void setUp() {
        drumKit = new DrumKit("Pearl", "Decade Maple", "Sunburt", 650, 859, 5, "Zildjian");
    }

    @Test
    public void canGetNoOfPieces() {
        assertEquals(5, drumKit.getNoOfPieces());
    }

    @Test
    public void canGetCymbalBrand() {
        assertEquals("Zildjian", drumKit.getCymbalBrand());
    }

    @Test
    public void canPlay() {
        assertEquals("Ba dum tss", drumKit.play());
    }

    @Test
    public void canGetBuyPrice() {
        assertEquals(650, drumKit.getBuyPrice(), 0.00);
    }

    @Test
    public void canGetSellPrice() {
        assertEquals(859, drumKit.getSellPrice(), 0.00);
    }

    @Test
    public void canSetSellPrice() {
        drumKit.setSellPrice(809);
        assertEquals(809, drumKit.getSellPrice(), 0.00);
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(209, drumKit.calculateMarkup(), 0.00);
    }
}
