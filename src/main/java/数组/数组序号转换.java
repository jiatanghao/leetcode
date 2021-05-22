package 数组;

import java.util.*;

public class 数组序号转换 {
    public int[] arrayRankTransform(int[] arr) {
        int[] result = new int[arr.length];
        Set<Integer> set = new HashSet<>();
        for (int i : arr) {
            set.add(i);
        }
        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list);
        Map<Integer, Integer> indexMap = new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            indexMap.put(list.get(i), i + 1);
        }
        for (int i = 0; i < arr.length; i++) {
            result[i] = indexMap.get(arr[i]);
        }
        return result;
    }
}
