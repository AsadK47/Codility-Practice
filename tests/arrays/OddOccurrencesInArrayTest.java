package arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OddOccurrencesInArrayTest {
    @Test
    public void findOddPairInSmallArray() {
        int[] myArray = {1, 2, 1, 2, 3};
        assertEquals(3, OddOccurrencesInArray.findOccurence(myArray));
    }

    @Test
    public void findOddPairInMediumArray() {
        int[] myArray = {4, 2, 2, 3, 4, 1, 3, 5, 5, 6, 6};
        assertEquals(1, OddOccurrencesInArray.findOccurence(myArray));
    }

}