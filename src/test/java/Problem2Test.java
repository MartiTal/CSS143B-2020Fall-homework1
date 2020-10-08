import org.junit.Test;

import static org.junit.Assert.*;

public class Problem2Test {

    // Example test
    // Okay to change
    @Test
    public void testBubbleSort() {
        // add your tests here

        //Test 1 (all different numbers)
        int[] input = {1, 7, 5, 2, 8};
        int[] expected = {1, 2, 5, 7, 8};
        Problem2.bubbleSort(input);
        assertArrayEquals(expected, input);

        //Test 2 (numbers are repeated)
        input = new int[] {9, -2, 3, -2, 9, 15, 0};
        expected = new int[] {-2, -2, 0, 3, 9, 9, 15};
        Problem2.bubbleSort(input);
        assertArrayEquals(expected, input);

        //Test 3 (all same number)
        input = new int[] {2, 2, 2, 2, 2};
        expected = new int[] {2, 2, 2, 2, 2};
        Problem2.bubbleSort(input);
        assertArrayEquals(expected, input);

        //Test 4 (single number)
        input = new int[] {4};
        expected = new int[] {4};
        Problem2.bubbleSort(input);
        assertArrayEquals(expected, input);

        //Test 5 (null)
        input = null;
        expected = null;
        Problem2.bubbleSort(input);
        assertArrayEquals(expected, input);

    }
}
