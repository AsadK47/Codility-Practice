package countingElements;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaryTest {
    @Test
    public void testOne() {
        int[] T = {3, 4, 7, 7, 6, 6};
        assertEquals(3, Mary.solution(T));
    }

    @Test
    public void testTwo() {
        int[] T = {80, 80, 1000000000, 80, 80, 80, 80, 80, 80, 123456789};
        assertEquals(3, Mary.solution(T));
    }
}