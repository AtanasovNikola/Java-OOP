package unitTesting.listIterator;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import javax.naming.OperationNotSupportedException;

public class ListIteratorTest {

    private static final String [] ELEMENTS ={"Pesho", "Gosho" , "Nikola"};

    private ListIterator listIterator;

    @Before
    public void setUp() throws OperationNotSupportedException {
        this.listIterator = new ListIterator(ELEMENTS);
    }


    @Test(expected = OperationNotSupportedException.class)
    public void testIfElementsAreNullThrowsException() throws OperationNotSupportedException {
       new ListIterator(null);

    }

    @Test
    public void testConstructorShouldCreateListIterator() throws OperationNotSupportedException {
        new ListIterator(ELEMENTS);
    }

    @Test
    public void testIfMoveHasNextElement(){
        Assert.assertTrue(listIterator.move());
    }

    @Test
    public void testIfMoveHasNotNextElement(){
        listIterator.move();
        listIterator.move();
        Assert.assertFalse(listIterator.move());
    }

    @Test(expected = IllegalStateException.class)
    public void testIfTheLengthOfTheElementsIs0ThrowsException() throws OperationNotSupportedException {
        ListIterator emptyList = new ListIterator();
        emptyList.print();
    }

    @Test
    public void testIfPrintsTheElementOfTheGivenIndex(){

        Assert.assertEquals("Pesho",listIterator.print());
    }
}