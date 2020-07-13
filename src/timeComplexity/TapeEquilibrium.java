package timeComplexity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class TapeEquilibrium {
    public static int solution(int[] A) {
        if (A.length == 0) {
            return 1;
        }

        List<Integer> myArrayList = Arrays.stream(A).boxed().collect(Collectors.toList());
        ArrayList<Integer> newList = new ArrayList<>();
        List<Integer> sublist1;
        List<Integer> sublist2;
        int sum;
        int sum2;
        int absoluteSubtraction;

        for (int i = 0; i < myArrayList.size() - 1; i++) {
            sublist1 = myArrayList.subList(0, i + 1);
            sublist2 = myArrayList.subList(i + 1, myArrayList.size());
            sum = sublist1.stream().mapToInt(a -> a).sum();
            sum2 = sublist2.stream().mapToInt(b -> b).sum();
            absoluteSubtraction = Math.abs(sum - sum2);
            newList.add(absoluteSubtraction);
        }

        Collections.sort(newList);
        return newList.get(0);
    }
}
