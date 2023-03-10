package unitTesting.lab;

public class Dummy {
    private int health;
    private int experience;

    public Dummy(int health, int experience) {
        this.health = health;
        this.experience = experience;
    }

    public int getHealth() {
        return health;
    }

    public int getExperience() {
        return experience;
    }

    public void takeAttack(int attackPoints) {
        if (this.isDead()) {
            throw new IllegalStateException("This Dummy is dead");
        }
        this.health -= attackPoints;
    }

    public int giveExperience() {
        if (!this.isDead()) {
            throw new IllegalStateException("This Dummy is not dead");
        }
        return this.experience;
    }

    public boolean isDead() {
        return this.health <= 0;
    }
}
