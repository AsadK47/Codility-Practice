package timeComplexity;

/*
 * A non-empty array A consisting of N integers is given.
 * Array A represents numbers on a tape.
 *
 * Any integer P, such that 0 < P < N, splits this tape into two non-empty parts:
 * A[0], A[1], ..., A[P − 1] and A[P], A[P + 1], ..., A[N − 1].
 *
 * The difference between the two parts is the value of: |(A[0] + A[1] + ... +
 * A[P − 1]) − (A[P] + A[P + 1] + ... + A[N − 1])|
 *
 * In other words, it is the absolute difference between the sum of the first
 * part and the sum of the second part.
 *
 * For example, consider array A such that:
 *
 *   A[0] = 3
 *   A[1] = 1
 *   A[2] = 2
 *   A[3] = 4
 *   A[4] = 3
 * We can split this tape in four places:
 *
 * P = 1, difference = |3 − 10| = 7
 * P = 2, difference = |4 − 9| = 5
 * P = 3, difference = |6 − 7| = 1
 * P = 4, difference = |10 − 3| = 7
 * Write a function:
 * class Solution { public int solution(int[] A); }
 *
 * that, given a non-empty array A of N integers, returns the minimal difference that can be achieved.
 *
 * For example, given:
 *
 *   A[0] = 3
 *   A[1] = 1
 *   A[2] = 2
 *   A[3] = 4
 *   A[4] = 3
 * the function should return 1, as explained above.
 *
 * Write an efficient algorithm for the following assumptions:
 *
 * N is an integer within the range [2..100,000];
 * each element of array A is an integer within the range [−1,000..1,000].
 */

/*
 * My solution before with O(N * N) complexity
 *
 * public class TapeEquilibrium {
 *     public static int solution(int[] A) {
 *         if (A.length == 0) {
 *             return 1;
 *         }
 *
 *         List<Integer> myArrayList = Arrays.stream(A).boxed().collect(Collectors.toList());
 *         ArrayList<Integer> newList = new ArrayList<>();
 *         List<Integer> sublist1;
 *         List<Integer> sublist2;
 *         int sum;
 *         int sum2;
 *         int absoluteSubtraction;
 *
 *         for (int i = 0; i < myArrayList.size() - 1; i++) {
 *             sublist1 = myArrayList.subList(0, i + 1);
 *             sublist2 = myArrayList.subList(i + 1, myArrayList.size());
 *             sum = sublist1.stream().mapToInt(a -> a).sum();
 *             sum2 = sublist2.stream().mapToInt(b -> b).sum();
 *             absoluteSubtraction = Math.abs(sum - sum2);
 *             newList.add(absoluteSubtraction);
 *         }
 *
 *         Collections.sort(newList);
 *         return newList.get(0);
 *     }
 * }
 */


public class TapeEquilibrium {
    public static int solution(int[] A) {
        long sumOfAllElements = 0;

        for (int value : A) {
            sumOfAllElements += value;
        }

        int minDifference = Integer.MAX_VALUE;
        int currentDifference;
        long sumOfFirstPart = 0;
        long sumOfSecondPart;

        for (int p = 0; p < A.length - 1; p++) {
            sumOfFirstPart += A[p];
            sumOfSecondPart = sumOfAllElements - sumOfFirstPart;
            currentDifference = (int) Math.abs(sumOfFirstPart - sumOfSecondPart);
            minDifference = Math.min(currentDifference, minDifference);
        }

        return minDifference;
    }
}
