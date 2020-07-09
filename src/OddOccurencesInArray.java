public class OddOccurencesInArray {
    public static int findOccurence(int[] myArray) {
        int counter = 0;

        for (int i = 0; i < myArray.length; i++) {
            counter ^= myArray[i];
        }
        return counter;
    }
}


