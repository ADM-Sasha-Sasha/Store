package HwDev.store;

import HwDev.products.ProductsListImplement;

import java.util.HashMap;

public class ShopList {
    private final HashMap<String, ProductsListImplement> productsBag = new HashMap<>();
    {
        productsBag.put("Apple", new ProductsListImplement("Apple", 1.25, 3, 3.0));
        productsBag.put("Lemon", new ProductsListImplement("Lemon", 4.25));
        productsBag.put("Coconut", new ProductsListImplement("Coconut", 1.0, 6, 5.0));
        productsBag.put("Banana", new ProductsListImplement("Banana", 0.75));
    }
    public double totalCost(String bag) {
        String userBag =
    }
}
