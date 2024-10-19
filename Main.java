import java.util.ArrayList;
import java.util.List;

// Item class
class Item {
    private String name;
    private String type; // "Fruit" or "Vegetable"
    private double price;

    // Constructor
    public Item(String name, String type, double price) {
        this.name = name;
        this.type = type;
        this.price = price;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    // Display method for an item
    public void displayItem() {
        System.out.println("Name: " + name + ", Type: " + type + ", Price: " + price);
    }
}

// Inventory class
//import java.util.ArrayList;
//import java.util.List;

class Inventory {
    private List<Item> items; // List to store items

    // Constructor
    public Inventory() {
        this.items = new ArrayList<>();
    }

    // Method to add item to the inventory
    public void addItem(Item item) {
        items.add(item);
        System.out.println(item.getName() + " added to the inventory.");
    }

    // Method to display all items in the inventory
    public void displayItems() {
        System.out.println("Displaying all items:");
        if (items.isEmpty()) {
            System.out.println("Inventory is empty.");
        } else {
            for (Item item : items) {
                item.displayItem();
            }
        }
    }

    // Method to display items by category (Fruit or Vegetable)
    public void categoryWiseDisplay(String type) {
        System.out.println("Displaying all " + type + "s:");
        boolean found = false;
        for (Item item : items) {
            if (item.getType().equalsIgnoreCase(type)) {
                item.displayItem();
                found = true;
            }
        }
        if (!found) {
            System.out.println("No items found in the category: " + type);
        }
    }

    // Method to search for an item by name
    public void searchItem(String name) {
        boolean found = false;
        for (Item item : items) {
            if (item.getName().equalsIgnoreCase(name)) {
                System.out.println(name + " is available in the inventory.");
                item.displayItem();
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println(name + " is not available in the inventory.");
        }
    }

    // Method to purchase an item and reduce its quantity
    public void purchaseItem(String name, int quantity) {
        Item foundItem = null;
        for (Item item : items) {
            if (item.getName().equalsIgnoreCase(name)) {
                foundItem = item;
                break;
            }
        }

        if (foundItem != null) {
            System.out.println("Purchased " + quantity + " " + name + "(s) successfully.");
            // Here, you can add logic to reduce stock or remove items from the inventory if required.
        } else {
            System.out.println(name + " is not available in the inventory.");
        }
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        // Create an Inventory object
        Inventory inventory = new Inventory();

        // Create some Item objects (Fruits and Vegetables)
        Item apple = new Item("Apple", "Fruit", 1.5);
        Item banana = new Item("Banana", "Fruit", 0.5);
        Item carrot = new Item("Carrot", "Vegetable", 0.8);
        Item tomato = new Item("Tomato", "Vegetable", 1.0);

        // Add items to the inventory
        inventory.addItem(apple);
        inventory.addItem(banana);
        inventory.addItem(carrot);
        inventory.addItem(tomato);

        // Display all items
        inventory.displayItems();

        // Display items by category
        inventory.categoryWiseDisplay("Fruit");
        inventory.categoryWiseDisplay("Vegetable");

        // Search for an item
        inventory.searchItem("Apple");
        inventory.searchItem("Potato"); // Item not present

        // Purchase an item
        inventory.purchaseItem("Banana", 10);
        inventory.purchaseItem("Potato", 5); // Item not present
    }
}
