package abstractions.cardRank;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String rank = scanner.nextLine().toUpperCase();
        String suit = scanner.nextLine().toUpperCase();

        int totalPower =  CardPower.valueOf(rank).getPower() + SuitPower.valueOf(suit).getPower();

        System.out.printf("Card name: %s of %s; Card power: %d", rank, suit,totalPower);

    }
}
