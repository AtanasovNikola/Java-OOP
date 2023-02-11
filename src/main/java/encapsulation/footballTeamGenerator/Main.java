package encapsulation.footballTeamGenerator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] command = scanner.nextLine().split(";");
        Team team = null;
        while (!command[0].equals("END")) {
            String teamName = command[1];
            switch (command[0]) {
                case "Team":
                    try {
                        team = new Team(teamName);
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case "Add":
                    String playerName = command[2];
                    int endurance = Integer.parseInt(command[3]);
                    int sprint = Integer.parseInt(command[4]);
                    int dribble = Integer.parseInt(command[5]);
                    int passing = Integer.parseInt(command[6]);
                    int shooting = Integer.parseInt(command[7]);
                    try {
                        Player player = new Player(playerName, endurance, sprint, dribble, passing, shooting);
                        team.addPlayer(player, teamName);
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case "Remove":
                    playerName = command[2];
                    try {
                    team.removePlayer(playerName);
                    }catch (IllegalArgumentException e){
                        System.out.println(e.getMessage());
                    }
                    break;
                case "Rating":
                    playerName = command[1];
                    double rating = team.getRating(playerName);
                    System.out.printf("Arsenal - %.0f%n", rating);
                    break;
            }

            command = scanner.nextLine().split(";");
        }
    }
}
