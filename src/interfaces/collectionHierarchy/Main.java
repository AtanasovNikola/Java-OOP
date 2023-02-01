package interfaces.collectionHierarchy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        AddCollection addCollection = new AddCollection();
        AddRemoveCollection addRemoveCollection = new AddRemoveCollection();
        MyListImpl myList = new MyListImpl();

        String[] input = scanner.nextLine().split("\\s+");
        int removeElements = Integer.parseInt(scanner.nextLine());

        printAdd(input,addCollection);
        printAdd(input,addRemoveCollection);
        printAdd(input,myList);

        printRemove(removeElements,addRemoveCollection);
        printRemove(removeElements,myList);


    }

    private static void printRemove(int removeElements, Removable collection) {
        for (int i = 0; i <removeElements ; i++) {
            System.out.print(collection.remove() + " ");
        }
        System.out.println();
    }

    public static void printAdd(String[] input , Addable collection){
        for (String element : input) {
            System.out.print(collection.add(element) + " ");
        }
        System.out.println();
    }
}
