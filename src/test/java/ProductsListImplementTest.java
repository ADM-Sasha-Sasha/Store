import HwDev.products.ProductsListImplement;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductsListImplementTest {
    private ProductsListImplement testProduct;

    @BeforeEach
    public void init() {
        testProduct = new ProductsListImplement("A", 1.25, 3, 3);
    }

    @Test
    public void testGetPrice() {
        double expected = 3.0;
        double actual = testProduct.getProductPrice(3);
        assertEquals(expected, actual);
    }

    @Test
    public void testMinusQuantity() {
        assertThrows(RuntimeException.class, () -> testProduct.getProductPrice(-2),
                "Amount can't be less than 1");
    }

    @Test
    public void testCompareProducts() {
        ProductsListImplement similar = new ProductsListImplement("A", 1.25, 3, 3);
        assertEquals(similar, testProduct);
    }

    @Test
    public void testDifferentCompareProducts() {
        ProductsListImplement another = new ProductsListImplement("B", 4.25);
        assertNotEquals(another, testProduct);

        ProductsListImplement anotherPrice = new ProductsListImplement("A", 1.5, 3, 3);
        assertNotEquals(anotherPrice, testProduct);

        ProductsListImplement anotherSalesQuantity = new ProductsListImplement("A", 1.25, 4, 3);
        assertNotEquals(anotherSalesQuantity, testProduct);

        ProductsListImplement salesPrice = new ProductsListImplement("A", 1.25, 3, 4);
        assertNotEquals(salesPrice, testProduct);
    }
}