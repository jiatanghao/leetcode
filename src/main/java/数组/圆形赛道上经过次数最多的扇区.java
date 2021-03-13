package 数组;

import java.util.*;

public class 圆形赛道上经过次数最多的扇区 {
    public List<Integer> mostVisited(int n, int[] rounds) {
        List<Integer> result = new ArrayList<>(rounds.length);
        Map<Integer, Integer> count = new HashMap<>();
        for (int i = 0; i < rounds.length - 1; i++) {
            if (rounds[i] < rounds[i + 1]) {
                for (int j = rounds[i]; j < rounds[i + 1]; j++) {
                    if (count.containsKey(j)) {
                        count.put(j, count.get(j) + 1);
                    } else {
                        count.put(j, 1);
                    }
                }
            } else {
                for (int j = rounds[i]; j <= n; j++) {
                    if (count.containsKey(j)) {
                        count.put(j, count.get(j) + 1);
                    } else {
                        count.put(j, 1);
                    }
                }
                for (int j = 1; j < rounds[i + 1]; j++) {
                    if (count.containsKey(j)) {
                        count.put(j, count.get(j) + 1);
                    } else {
                        count.put(j, 1);
                    }
                }
            }
        }
        if (count.containsKey(rounds[rounds.length - 1])) {
            count.put(rounds[rounds.length - 1], count.get(rounds[rounds.length - 1]) + 1);
        } else {
            count.put(rounds[rounds.length - 1], 1);
        }
        List<Map.Entry<Integer, Integer>> entries = new ArrayList<>(count.entrySet());
        entries.sort((o1, o2) -> o2.getValue() - o1.getValue());
        Map.Entry<Integer, Integer> max = entries.get(0);
        for (Map.Entry<Integer, Integer> entry : entries) {
            if (result.isEmpty()) {
                result.add(entry.getKey());
            } else if (entry.getValue().equals(max.getValue())) {
                result.add(entry.getKey());
            } else {
                break;
            }
        }
        result.sort(Comparator.comparingInt(o -> o));
        return result;
    }
}
