package builderPattern;

import java.util.ArrayList;

/**
 * This class created on 2016/7/25.
 *
 * @author Osborn
 * @since Advanced FineBI Analysis 1.0
 */
public class Meal {
    ArrayList<Item> items = new ArrayList<Item>();

    public double getCost() {
        double cost = 0d;
        for (Item item : items) {
            cost += item.getPrice();
        }
        return cost;
    }
    public void showAllItems() {
        for (Item item : items) {
            System.out.println("Item: "+item.getName());
            System.out.println("Packing: "+item.getPacking());
            System.out.println("Price: "+item.getPrice());
        }
    }
}
