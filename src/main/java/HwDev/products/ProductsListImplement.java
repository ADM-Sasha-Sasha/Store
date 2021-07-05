package HwDev.products;

public class ProductsListImplement {
    private String id;
    private double productPrice;
    private int salesProductCount;
    private double salesProductPrice;

    public ProductsListImplement(String id, double productPrice) {
        this (id, productPrice, 1, productPrice);
    }

//    public ProductsListImplement(String id, double productPrice, int salesProductCount, double salesProductPrice) {
//    }

    public double getProductPrice (long count) {
        if (count < 1) {
            throw new RuntimeException ("Bag is empty");
        }
        if (count < salesProductCount) {
            return count * productPrice;
        }
        return (count / salesProductCount) * salesProductPrice + (count % salesProductCount) * productPrice;
    }
}
