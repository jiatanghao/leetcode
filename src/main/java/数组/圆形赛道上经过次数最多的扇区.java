package 数组;

import java.util.*;

public class 圆形赛道上经过次数最多的扇区 {
    public List<Integer> mostVisited(int n, int[] rounds) {
        List<Integer> ret = new ArrayList<>();
        int length = rounds.length;
        int start = rounds[0], end = rounds[length - 1];
        if (start <= end) {
            for (int i = start; i <= end; i++) {
                ret.add(i);
            }
        } else {
            for (int i = 1; i <= end; i++) {
                ret.add(i);
            }
            for (int i = start; i <= n; i++) {
                ret.add(i);
            }
        }
        return ret;
    }
}
