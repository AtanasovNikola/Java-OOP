package abstractions.greedyTimes;

import java.util.List;

public class Bag {
    private List<Item> items;
    private int capacity;

    public Bag(List<Item> items, int capacity) {
        this.items = items;
        this.capacity = capacity;
    }

   public void print(ItemType itemType){
       System.out.printf("<%s> %d%n",itemType,getAmount(itemType));
       items.stream().filter(e-> e.getItemType().equals(itemType))
               .forEach(e-> System.out.printf("##%s - %d%n",e.getItemName(),e.getAmount()));
   }

    public void put(Item item) {

        if(weCanStore(item)){
            items.add(item);
        }
    }

    private boolean weCanStore(Item item){
        if (capacity < getTotalAmount() + item.getAmount()) {
            return false;
        }
        switch (item.getItemType()) {
            case GEM:
                if (getAmount(ItemType.GEM) + item.getAmount() > getAmount(ItemType.GOLD)) {
                    return false;
                }
                break;
            case CASH:
                if (getAmount(ItemType.CASH) + item.getAmount() > getAmount(ItemType.GEM)) {
                    return false;
                }
                break;
        }
        return true;
    }

    public int getTotalAmount() {
        return getAmount(ItemType.GEM) + getAmount(ItemType.GOLD) + getAmount(ItemType.CASH);
    }

    public int getAmount(ItemType itemType) {
          return   this.items.stream()
                    .filter(e -> e.getItemType().equals(itemType))
                    .mapToInt(e -> (int) e.getAmount())
                    .sum();
    }
}