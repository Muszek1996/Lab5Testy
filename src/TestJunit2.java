import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.Arrays;
import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.*;

public class TestJunit2 {

    @Rule
    public ExpectedException thrown = ExpectedException.none();


    int array[][] = new int[][]{
            {3, 5, 1},
            {'#', 4, 5},
            {433,543,Integer.MAX_VALUE,0},
            {},
            {-4,3,2,5},
            {4,3,2,-5},
            {0,0,0,0,0},
            {0443,0x414}
    };
    int notInitializedArr[];

    @Test
    public void testOfCorrectData() throws Exception {
        assertEquals(9, Solution.solution(array[0]));
    }

    @Test
    public void illegalArgumentCharacterTest() throws Exception {
        thrown.expect(Exception.class);
        thrown.expectMessage("Element nie spenia zalozen");
        Solution.solution(array[1]);
    }

    @Test
    public void illegalArgumentNumberInsteadOfSingleDigitTest() throws Exception {
        thrown.expect(Exception.class);
        thrown.expectMessage("Element nie spenia zalozen");
        Solution.solution(array[2]);
    }

    @Test
    public void notInitializedArrayTest() throws Exception {
        thrown.expect(Exception.class);
        thrown.expectMessage("Tablica pusta");
        Solution.solution(array[3]);
    }

    @Test
    public void arrayWithSignedNumberAtIndex0Test() throws Exception {
        thrown.expect(Exception.class);
        thrown.expectMessage("Element nie spenia zalozen");
        Solution.solution(array[4]);
    }

    @Test
    public void arrayWithSignedNumberAtLastIndex() throws Exception {
        thrown.expect(Exception.class);
        thrown.expectMessage("Element nie spenia zalozen");
        Solution.solution(array[5]);
    }
    @Test
    public void filledWithZerosTest() throws Exception {
        assertEquals(0, Solution.solution(array[6]));
    }

    @Test
    public void octalAndHexalTest() throws Exception {
        assertEquals(3, Solution.solution(array[6]));
    }
}