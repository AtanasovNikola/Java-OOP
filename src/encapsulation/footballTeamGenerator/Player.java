package encapsulation.footballTeamGenerator;

public class Player {

    private String name;
    private int endurance;
    private int sprint;
    private int dribble;
    private int passing;
    private int shooting;

    public Player(String name, int endurance, int sprint, int dribble, int passing, int shooting) {
        this.setName(name);
        this.setEndurance(endurance);
        this.setSprint(sprint);
        this.setDribble(dribble);
        this.setPassing(passing);
        this.setShooting(shooting);
    }

    private void setName(String name) {
        if (name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name can not be empty%n");
        }
        this.name = name;
    }

    private void setEndurance(int endurance) {
        exception(endurance, "Endurance");
        this.endurance = endurance;
    }

    private void setSprint(int sprint) {
        exception(sprint, "Sprint");
        this.sprint = sprint;
    }

    private void setDribble(int dribble) {
        exception(dribble, "Dribble");
        this.dribble = dribble;
    }

    private void setPassing(int passing) {
        exception(passing, "Passing");
        this.passing = passing;
    }

    private void setShooting(int shooting) {
        exception(shooting, "Shooting");
        this.shooting = shooting;
    }

    public String getName() {

        return name;
    }

    private boolean notValid(int stat) {

        return stat < 0 || stat > 100;
    }

    private void exception(int type, String command) {
        if (notValid(type)) {
            throw new IllegalArgumentException(command+ " should be between 0 and 100.");
        }
    }

    public double overallSkillLevel() {

        return (endurance + sprint + dribble + passing + 1.0 * shooting) / 5;
    }
}
