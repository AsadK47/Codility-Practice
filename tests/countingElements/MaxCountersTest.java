package countingElements;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxCountersTest {
    @Test
    public void exampleTest() {
        int N = 5;
        int[] expectedArray = {3, 2, 2, 4, 2};
        int[] A = {3, 4, 4, 6, 1, 4, 4};
        assertEquals(expectedArray, MaxCounters.solution(N, A));
    }

}