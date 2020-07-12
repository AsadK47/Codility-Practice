import java.util.Arrays;

public class PermMissingElem {
    public static int solution(int[] A) {
        int counter = 1;
        Arrays.sort(A);

        if (A.length == 0) {
            return counter;
        }

        for (int i = 0; i < A.length; i++) {
            if (A[i] != counter) {
                return counter;
            }
            counter ++;
        }

        return counter;
    }
}

