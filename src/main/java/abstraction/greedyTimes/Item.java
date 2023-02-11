package abstraction.greedyTimes;

public class Item {
    private ItemType itemType;
    private String itemName;
    private int amount;

    public Item(ItemType itemType, String itemName, int amount) {
        this.itemType = itemType;
        this.itemName = itemName;
        this.amount = amount;
    }

    public ItemType getItemType() {
        return itemType;
    }

    public void setItemType(ItemType itemType) {
        this.itemType = itemType;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}