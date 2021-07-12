import HwDev.store.ShopList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class ExepTest {
    ShopList shopList = new ShopList();

    @Test
    public void totalCost() {
        assertThrows(NumberFormatException.class, () -> shopList.totalCost(null), "Check your bag");
    }
    @Test
    public void testTotalCostOnlySpaceBag() {
        assertThrows(NumberFormatException.class, () -> shopList.totalCost(null), "Check your bag");
    }
}
