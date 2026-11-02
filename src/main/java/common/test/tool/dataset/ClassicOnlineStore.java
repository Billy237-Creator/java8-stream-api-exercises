package common.test.tool.dataset;

import common.test.tool.entity.Customer;
import common.test.tool.entity.Item;
import common.test.tool.entity.OnlineShoppingMall;
import common.test.tool.entity.Shop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ClassicOnlineStore {

    protected final OnlineShoppingMall mall = new OnlineShoppingMall();
    private final List<Shop> shops = new ArrayList<>();
    private final List<Customer> customers = new ArrayList<>();

    public ClassicOnlineStore() {
        createShops();
        createCustomers();
        mall.setShopList(shops);
        mall.setCustomerList(customers);
    }

    private void createShops() {
        // White Furniture
        shops.add(createShop("White Furniture",
                new String[]{"chair", "table", "small chair", "small table"},
                new int[]{2000, 5500, 1800, 2800}));

        // Dish Devices
        shops.add(createShop("Dish Devices",
                new String[]{"cup", "plate", "fork", "spoon", "chopsticks"},
                new int[]{380, 680, 210, 210, 180}));

        // The Do It Ourselves
        shops.add(createShop("The Do It Ourselves",
                new String[]{"rope", "saw", "bond", "plane", "screwdriver"},
                new int[]{800, 1400, 480, 2200, 600}));

        // Electrics
        shops.add(createShop("Electrics",
                new String[]{"chair", "desk", "cable", "speaker", "headphone", "earphone"},
                new int[]{600, 1800, 230, 19000, 8800, 7800}));

        // Amazing Apothecary
        shops.add(createShop("Amazing Apothecary",
                new String[]{"cold medicine", "ointment", "eye-drops", "poultice"},
                new int[]{800, 500, 600, 900}));

        // The Rapid Supermarket
        shops.add(createShop("The Rapid Supermarket",
                new String[]{"spinach", "ginseng", "onion", "ice cream", "crisps"},
                new int[]{100, 120, 160, 200, 80}));
    }

    private void createCustomers() {
        customers.add(createCustomer("Joe", 22, 8000, new String[]{"small table", "plate", "fork"}));
        customers.add(createCustomer("Steven", 27, 2000, new String[]{"ice cream", "screwdriver", "cable", "earphone"}));
        customers.add(createCustomer("Patrick", 28, 4000, new String[]{"onion", "ice cream", "crisps", "chopsticks"}));
        customers.add(createCustomer("Diana", 38, 12000, new String[]{"cable", "speaker", "headphone"}));
        customers.add(createCustomer("Chris", 26, 9000, new String[]{"saw", "bond", "plane", "bag"}));
        customers.add(createCustomer("Kathy", 22, 6000, new String[]{"cold medicine"}));
        customers.add(createCustomer("Alice", 32, 2500, new String[]{"chair", "desk"}));
        customers.add(createCustomer("Andrew", 35, 11000, new String[]{"pants", "coat"}));
        customers.add(createCustomer("Martin", 21, 1000, new String[]{"cup", "plate", "fork", "spoon"}));
        customers.add(createCustomer("Amy", 36, 2000, new String[]{"ointment", "poultice", "spinach", "ginseng", "onion"}));
    }

    private Shop createShop(String name, String[] itemNames, int[] prices) {
        Shop shop = new Shop();
        shop.setName(name);

        List<Item> itemList = new ArrayList<>();
        for (int i = 0; i < itemNames.length; i++) {
            Item item = new Item();
            item.setName(itemNames[i]);
            item.setPrice(prices[i]);
            itemList.add(item);
        }

        shop.setItemList(itemList);
        return shop;
    }

    private Customer createCustomer(String name, int age, int budget, String[] itemNames) {
        Customer customer = new Customer();
        customer.setName(name);
        customer.setAge(age);
        customer.setBudget(budget);

        List<Item> wantToBuy = new ArrayList<>();
        for (String itemName : itemNames) {
            Item item = new Item();
            item.setName(itemName);
            item.setPrice(-1); // az XML-ben sincs ár a kívánt termékekhez
            wantToBuy.add(item);
        }

        customer.setWantToBuy(wantToBuy);
        return customer;
    }

    // Teszteléshez
    public static void main(String[] args) {
        ClassicOnlineStore store = new ClassicOnlineStore();
        System.out.println("Shops loaded: " + store.mall.getShopList().size());
        System.out.println("Customers loaded: " + store.mall.getCustomerList().size());
        System.out.println("First shop: " + store.mall.getShopList().get(0));
        System.out.println("First customer: " + store.mall.getCustomerList().get(0));
    }
}
