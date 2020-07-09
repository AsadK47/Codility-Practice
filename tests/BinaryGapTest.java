import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryGapTest {
    @Test
    public void returnsBinaryGapOf9() {
        assertEquals(2, BinaryGap.solution(9));
    }

    @Test
    public void returnsBinaryGapOf529() {
        assertEquals(4, BinaryGap.solution(529));
    }

    @Test
    public void returnsBinaryGapOf0() {
        assertEquals(0, BinaryGap.solution(0));
    }
}