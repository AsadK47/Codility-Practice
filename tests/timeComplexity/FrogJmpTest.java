package timeComplexity;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FrogJmpTest {
    @Test
    public void jumpForThirty() {
        int x = 10;
        int y = 85;
        int z = 30;
        Assertions.assertEquals(3, FrogJmp.jump(x, y, z));
    }
}