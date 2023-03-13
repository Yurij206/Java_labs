package lab2.lab2_15;
import java.util.*;
class Invoice {
    public static class Item { // Открытый вложенный класс
        private String description;
        private int quantity;
        private double unitPrice;
        public Item(String description, int quantity, double unitPrice) {
            this.description = description;
            this.quantity = quantity;
            this.unitPrice = unitPrice;
        }
        public double price() { return quantity * unitPrice; }
    }
    private ArrayList<Item> items = new ArrayList<>();
    public void add(Item item) { items.add(item); }
    public void print()
    {
        System.out.printf("%20s    %9s    %9s\n", "description", "quantity", "price");
        for (Item it : items)
            System.out.printf("%20s    %9d    %9f\n", it.description, it.quantity, it.unitPrice);
    }
}
