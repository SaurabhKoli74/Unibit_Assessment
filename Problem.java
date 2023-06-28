import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem {

    public static List<List<Integer>> pairsFindFunc(int[] array, int target) {
        List<List<Integer>> pairs = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == target) {
                    pairs.add(Arrays.asList(array[i], array[j]));
                }
            }
        }
        return pairs;
    }

    public static List<Integer> mergeArray(List<List<Integer>> pairs) {
        List<Integer> mergedArray = new ArrayList<>();
        for (List<Integer> pair : pairs) {
            for (int element : pair) {
                if (!mergedArray.contains(element)) {
                    mergedArray.add(element);
                }
            }
        }
        return mergedArray;
    }

    public static List<List<Integer>> doubleTarget(List<Integer> array, int target) {
        int doubledTarget = target * 2;
        List<List<Integer>> pairs = new ArrayList<>();
        for (int i = 0; i < array.size(); i++) {
            for (int j = i + 1; j < array.size(); j++) {
                for (int k = j + 1; k < array.size(); k++) {
                    if (array.get(i) + array.get(j) + array.get(k) == doubledTarget) {
                        pairs.add(Arrays.asList(array.get(i), array.get(j), array.get(k)));
                    }
                }
            }
        }
        return pairs;
    }

    public static void main(String[] args) {
        int[] array = { 1, 3, 2, 2, -4, -6, -2, 8 };
        int target = 4;
        List<List<Integer>> pairs = pairsFindFunc(array, target);
        System.out.println(pairs);
        List<Integer> mergedArray = mergeArray(pairs);
        System.out.println(mergedArray);
        List<List<Integer>> doubledTarget = doubleTarget(mergedArray, target);
        System.out.println(doubledTarget);
    }
}