package HwDev.store;

import HwDev.products.ProductsListImplement;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class ShopList {
    private final HashMap<String, ProductsListImplement> productsBag = new HashMap<>();
    {
        productsBag.put("A", new ProductsListImplement("A", 1.25, 3, 3.0));
        productsBag.put("B", new ProductsListImplement("B", 4.25));
        productsBag.put("C", new ProductsListImplement("C", 1.0, 6, 5.0));
        productsBag.put("D", new ProductsListImplement("D", 0.75));
    }
    public double totalCost(String bag) {
        String userBag = filterBag(bag);
        Map<String, Long> produtsQuantity = Arrays.stream(userBag.split(""))
                .map(productsBag::get)
                .collect(Collectors.groupingBy(ProductsListImplement::getId, Collectors
                        .mapping(ProductsListImplement::getId, Collectors.counting())));
        return produtsQuantity.entrySet().stream().mapToDouble(p -> productsBag
                .get(p.getKey()).getProductPrice((p.getValue()))).sum();
    }

    private String filterBag(String bag) {
        if (bag != null && !bag.isEmpty()) {
            return Arrays.stream(bag.toUpperCase()
                    .split(""))
                    .filter(productsBag::containsKey)
                    .collect(Collectors.joining());
        } else {
            throw new NullPointerException("Wrong product id. Try again");
        }
    }
}
