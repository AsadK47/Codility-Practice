package iterations;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BinaryGapTest {
    @Test
    public void returnsBinaryGapOf9() {
        Assertions.assertEquals(2, BinaryGap.solution(9));
    }

    @Test
    public void returnsBinaryGapOf529() {
        Assertions.assertEquals(4, BinaryGap.solution(529));
    }

    @Test
    public void returnsBinaryGapOf0() {
        Assertions.assertEquals(0, BinaryGap.solution(0));
    }
}