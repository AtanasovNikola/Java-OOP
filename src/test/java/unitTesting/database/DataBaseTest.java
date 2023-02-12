package unitTesting.database;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import javax.naming.OperationNotSupportedException;


public class DataBaseTest {

    private static final Integer[] ELEMENTS = {1, 2, 3, 4};

    private DataBase dataBase;


    @Before
    public void setUp() throws OperationNotSupportedException {
        this.dataBase = new DataBase(ELEMENTS);

    }

    @Test(expected = OperationNotSupportedException.class)
    public void testAIfAddWithParameterNullThrowsException() throws OperationNotSupportedException {
        dataBase.add(null);
    }

    @Test
    public void testIfAddsTheElementToTheDBAndChangeTheSizeAndAddTheElement() throws OperationNotSupportedException {
        dataBase.add(5);
        Assert.assertEquals(ELEMENTS.length + 1, dataBase.getElements().length);
        Assert.assertArrayEquals(new Integer[]{1, 2, 3, 4, 5}, dataBase.getElements());
    }

    @Test(expected = OperationNotSupportedException.class)
    public void testIfElementsAreMoreThan16() throws OperationNotSupportedException {

        new DataBase(new Integer[17]);
    }

    @Test(expected = OperationNotSupportedException.class)
    public void testIfElementsAreLessThanOne() throws OperationNotSupportedException {

        new DataBase();
    }

    @Test(expected = OperationNotSupportedException.class)
    public void testIfItThrowsONSEWhenRemovingElementThatIsNull() throws OperationNotSupportedException {
        dataBase.remove();
        dataBase.remove();
        dataBase.remove();
        dataBase.remove();
        dataBase.remove();
    }
}