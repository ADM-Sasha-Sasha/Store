import HwDev.store.ShopList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShopListTest {

    ShopList shopList = new ShopList();

    @Test
    public void testTotalCost() {
        double expected = 7.25;
        double actual = shopList.totalCost("ABCD");
        assertEquals(expected, actual);
    }
    @Test
    public void testLowerCaseCalculateTotalCost() {
        double expectedLowerCaseBucket = 8.50;
        double actualLowerCaseBuckets = shopList.totalCost("abCDA");
        assertEquals(expectedLowerCaseBucket, actualLowerCaseBuckets);
    }

    @Test
    public void testCalculateTotalCostUndefinedProducts() {
        double expectedUndefinedProduct = 4.25;
        double actualUndefinedProducts = shopList.totalCost("berry");
        assertEquals(expectedUndefinedProduct, actualUndefinedProducts);
    }
    @Test
    public void testCalculateBucketSpace() {
        double expectedSpace = 5.75;
        double actualSpace = shopList.totalCost("A C CA DA");
        assertEquals(expectedSpace, actualSpace);
    }
    @Test
    public void testCalculateBucketNumbers() {
        double expectedNumbers = 5.0;
        double actualNumbers = shopList.totalCost("A1111C3D5566DA");
        assertEquals(expectedNumbers, actualNumbers);
    }

    @Test
    public void testCalculateUndefinedAndCorrect() {
        double expectedUndefinedAndCorrect = 8.50;
        double actualUndefinedAndCorrect = shopList.totalCost("JAVAJDBC");
        assertEquals(expectedUndefinedAndCorrect, actualUndefinedAndCorrect);
    }
}