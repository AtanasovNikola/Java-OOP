package unitTesting;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DummyTest {

    private final static int HEALTH = 100;
    private final static int EXPERIENCE = 100;

    private Dummy dummy;
    private Dummy deadDummy;
    private int attackPoints;

    @Before
    public void setUp() {
        this.attackPoints = 10;
        this.dummy = new Dummy(HEALTH, EXPERIENCE);
        this.deadDummy = new Dummy(0, EXPERIENCE);
    }


    @Test()
    public void dummyLoosesHealthWhenAttacked() {

        this.dummy.takeAttack(this.attackPoints);
        Assert.assertEquals(HEALTH - this.attackPoints, this.dummy.getHealth());
    }

    @Test(expected = IllegalStateException.class)
    public void testDeadDummy() {
        this.deadDummy.takeAttack(this.attackPoints);
    }

    @Test
    public void testDeadDummyCanGiveXP() {
        int actual = this.deadDummy.giveExperience();
        Assert.assertEquals(EXPERIENCE, actual);
    }

    @Test(expected = IllegalStateException.class)
    public void testAliveDummyCanNotGiveXP() {
        this.dummy.giveExperience();
    }
}