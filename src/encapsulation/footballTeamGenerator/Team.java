package encapsulation.footballTeamGenerator;

import java.util.ArrayList;
import java.util.List;

public class Team {

    private String name;
    private List<Player> players;

    public Team(String name) {
        this.setName(name);
        this.players = new ArrayList<>();
    }

    private void setName(String name) {
        if (name.trim().isEmpty()) {
            throw new IllegalArgumentException("A name should not be empty.%n");
        }
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void addPlayer(Player player, String team) {
        if (team.equals(name)) {
            players.add(player);
        } else {
            System.out.printf("Team %s does not exist.%n", team);
        }
    }

    public void removePlayer(String playerName) {
        for (Player player : players) {

            if (player.getName().equals(playerName)) {
                players.remove(player);
                return;
            }
        }
        System.out.printf("Player %s is not in %s team.%n", playerName, this.name);
    }

    public double getRating(String team) {
            double rating = 0;

            for (Player player : players) {
                rating += player.overallSkillLevel();
            }
            if (rating==0){
                return 0;
            }
            return rating / players.size();
    }
}
