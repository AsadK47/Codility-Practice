package timeComplexity;

/**
 * Solution with O(N * N) complexity
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
