package HwDev.client;

import HwDev.store.ShopList;

public class Main {
    public static void main(String[] args) {
        ShopList shopList = new ShopList();
        double totalBag = shopList.totalCost("A A A");
        System.out.println(totalBag);
    }
}
