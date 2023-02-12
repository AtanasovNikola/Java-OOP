package unitTesting.bubbleSort;

import org.junit.Assert;
import org.junit.Test;


public class BubbleTest {

    private static final int[] elements = {-5, 1, -3, 10, 4};


    @Test
    public void testIfSortTheGivenIntegers() {
        Bubble.sort(elements);
        Assert.assertArrayEquals(new int[]{-5, -3, 1, 4, 10},elements);
    }

}