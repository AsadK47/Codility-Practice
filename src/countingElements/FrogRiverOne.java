package countingElements;

import java.util.HashSet;
import java.util.Set;

public class FrogRiverOne {
    public static int solution(int X, int[] A) {
        Set<Integer> values = new HashSet<>();

        for (int i = 0; i < A.length; i++) {
            if (values.add(A[i])) X--;
            if (X == 0) return i;
        }

        return -1;
    }
}
