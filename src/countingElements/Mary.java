package countingElements;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Mary {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{3, 4, 7, 7, 6, 6}));
    }

    public static int solution(int[] T) {
        Arrays.sort(T);
        Set<Integer> values = new HashSet<>();

        for (int i = 0; i < T.length; i++) {
            values.add(T[i]);
        }

        if (values.size() > (T.length / 2)) {
            return T.length / 2;
        } else {
            return values.size();
        }
    }
}
