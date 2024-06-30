import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Item {
    private int itemId;
    private String itemName;

    public Item(int itemId, String itemName) {
        this.itemId = itemId;
        this.itemName = itemName;
    }

    public void show() {
        System.out.println("Item Name: " + itemName);
    }

    public static void main(String[] args) {
        List<Item> firstFive = new ArrayList<>();
        firstFive.add(new Item(1, "Book"));
        firstFive.add(new Item(2, "Pen"));
        firstFive.add(new Item(3, "Laptop"));
        firstFive.add(new Item(4, "Headphones"));
        firstFive.add(new Item(5, "Notebook"));

        for (Item item : firstFive = firstFive.subList(0, 5)) {

        }

        List<Item> itemList = new ArrayList<>();
        itemList.add(new Item(6, "Phone"));
        itemList.add(new Item(7, "Watch"));
        itemList.add(new Item(8, "Glasses"));
        itemList.add(new Item(9, "Backpack"));
        itemList.add(new Item(10, "Water Bottle"));


        for (Item item : itemList) {
            item.show();
        }

        Map<Integer, String> itemMap = new HashMap<>();
        for (Item item : itemList) {
            itemMap.put(item.itemId, item.itemName);
        }

        for (Map.Entry<Integer, String> entry : itemMap.entrySet()) {
            System.out.println("Item ID: " + entry.getKey() + ", Item Name: " + entry.getValue());
        }
    }
}
