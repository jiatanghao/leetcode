package 数组;

import java.util.HashMap;
import java.util.Map;

public class 多数元素_169 {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int key : nums) {
            if (map.containsKey(key)) {
                map.put(key, map.get(key) + 1);
            } else {
                map.put(key, 1);
            }
        }
        int half = nums.length >> 1;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > half) {
                return entry.getKey();
            }
        }
        return 0;
    }
}
