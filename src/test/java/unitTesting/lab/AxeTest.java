package unitTesting.lab;

import org.junit.*;


import static org.junit.Assert.assertEquals;

public class AxeTest {
    private final static int ATTACK_POINTS = 10;
    private final static int DURABILITY_POINTS = 10;
    private final static int HEALTH = 100;
    private final static int EXPERIENCE = 100;

    private Axe axe;
    private Axe brokenAxe;
    private Dummy dummy;


    public AxeTest() {
        this.axe = new Axe(ATTACK_POINTS, DURABILITY_POINTS);
        this.brokenAxe = new Axe(ATTACK_POINTS, 0);
        this.dummy = new Dummy(HEALTH, EXPERIENCE);
    }

    @Test
    public void testWeaponLoosesDurabilityAfterAttack() {

        axe.attack(dummy);

        assertEquals(DURABILITY_POINTS - 1, axe.getDurabilityPoints());
    }

    @Test(expected = IllegalStateException.class)
    public void testAxeAttackThrowsIfWeaponIsBroken() {

        this.brokenAxe.attack(this.dummy);
    }
}