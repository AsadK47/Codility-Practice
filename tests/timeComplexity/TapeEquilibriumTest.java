package timeComplexity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TapeEquilibriumTest {
    @Test
    public void exampleTest() {
        int[] A = {3, 1, 2, 4, 3};
        assertEquals(1, TapeEquilibrium.solution(A));
    }

}