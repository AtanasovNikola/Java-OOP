package inheritance.playersAndMonsters;

import inheritance.playersAndMonsters.hero.SoulMaster;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username= scanner.nextLine();
        int level = Integer.parseInt(scanner.nextLine());

        SoulMaster soulMaster = new SoulMaster(username,level);

        System.out.println(soulMaster.getLevel());
        System.out.println(soulMaster.getUsername());
        System.out.println(soulMaster.toString());
    }
}
