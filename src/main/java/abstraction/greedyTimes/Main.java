package abstraction.greedyTimes;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int capacity = Integer.parseInt(scanner.nextLine());
            String[] safe = scanner.nextLine().split("\\s+");

            Bag myBag = new Bag(new ArrayList<>(),capacity);

            for (int i = 0; i < safe.length; i += 2) {
                String itemName = safe[i];
                int amount = Integer.parseInt(safe[i + 1]);

                Item item = createItem(itemName, amount);

                myBag.put(item);
            }

            myBag.print(ItemType.GOLD);
            myBag.print(ItemType.GEM);
            myBag.print(ItemType.CASH);
        }

        private static Item createItem(String itemName, int amount){
            ItemType itemType;

            if (itemName.length() == 3) {
                itemType = ItemType.CASH;
            } else if (itemName.toLowerCase().endsWith("gem")) {
                itemType = ItemType.GEM;
            } else if (itemName.toLowerCase().equals("gold")) {
                itemType = ItemType.GOLD;
            } else {
                return null;
            }

            return new Item(itemType, itemName, amount);
        }
    }
