package arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CyclicRotationsTest {
    @Test
    public void oneRotation() {
        int[] myArray = {3, 8, 9, 7, 6};
        int[] expectedArray = {6, 3, 8, 9, 7};
        assertEquals(expectedArray, CyclicRotations.rotate(myArray, 1));
    }

    @Test
    public void threeRotations() {
        int[] myArray = {3, 8, 9, 7, 6};
        int[] expectedArray = {9, 7, 6, 3, 8};
        assertEquals(expectedArray, CyclicRotations.rotate(myArray, 3));
    }
}