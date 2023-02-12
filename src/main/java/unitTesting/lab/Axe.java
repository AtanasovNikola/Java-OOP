package unitTesting.lab;

public class Axe {
    private int attackPoints;
    private int durabilityPoints;

    public Axe(int attackPoints, int durabilityPoints) {
        this.attackPoints = attackPoints;
        this.durabilityPoints = durabilityPoints;
    }

    public int getAttackPoints() {
        return attackPoints;
    }

    public int getDurabilityPoints() {
        return durabilityPoints;
    }

    public void attack(Dummy target) {
        if (this.durabilityPoints <= 0) {
            throw new IllegalStateException("Axe is broken");
        }
        target.takeAttack(this.attackPoints);
        this.durabilityPoints -= 1;
    }
}
