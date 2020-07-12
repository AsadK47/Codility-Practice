package timeComplexity;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PermMissingElemTest {
    @Test
    public void missingWithin() {
        int[] A = {2, 3, 1, 5};
        Assertions.assertEquals(4, PermMissingElem.solution(A));
    }

    @Test
    public void missingOutsideOfRange() {
        int[] A = {2, 3, 1, 4};
        Assertions.assertEquals(5, PermMissingElem.solution(A));
    }
}