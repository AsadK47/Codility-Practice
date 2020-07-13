package countingElements;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FrogRiverOneTest {
    @Test
    public void basicTest() {
        int[] A = {1, 3, 1, 4, 2, 3, 5, 4};
        int X = 5;
        int expectedValue = 6;
        assertEquals(expectedValue, FrogRiverOne.solution(X, A));
    }
}