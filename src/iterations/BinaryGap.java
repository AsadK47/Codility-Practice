package iterations;

import java.util.ArrayList;
import java.util.List;

public class BinaryGap {
    public static int solution(int N) {
        String binaryString = Integer.toBinaryString(N);

        int longestBinaryGap = 0;
        List<Integer> positionOfOnesInList = new ArrayList<>();

        for (int i = 0; i < binaryString.length(); i++) {
            if (binaryString.charAt(i) == '0') {
                continue;
            }
            positionOfOnesInList.add(i);
        }

        for (int i = 0; i < positionOfOnesInList.size() - 1; i++) {
            int indiciesDiff = positionOfOnesInList.get(i + 1) - positionOfOnesInList.get(i) - 1;

            longestBinaryGap = Math.max(longestBinaryGap, indiciesDiff);
        }

        return longestBinaryGap;
    }
}
