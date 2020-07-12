package arrays;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CyclicRotations {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(rotate(new int[]{1, 2, 3}, 1)));
        System.out.println(Arrays.toString(rotate(new int[]{}, 1)));
    }
    public static int[] rotate(int[] A, int K) {
        if (A == null || A.length == 0) {
            return A;
        }

        List<Integer> myArrayList = Arrays.stream(A).boxed().collect(Collectors.toList());

        for (int i = 0; i < K; i++) {
            int lastNum = myArrayList.get(A.length - 1);
            myArrayList.add(0, lastNum);
            myArrayList.remove(myArrayList.size() - 1);
        }

        return myArrayList.stream().mapToInt(i -> i).toArray();
    }
}
