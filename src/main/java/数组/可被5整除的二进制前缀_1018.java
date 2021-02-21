package 数组;

import java.util.ArrayList;
import java.util.List;

public class 可被5整除的二进制前缀_1018 {
    public List<Boolean> prefixesDivBy5(int[] A) {
        List<Boolean> result = new ArrayList<>();
        int current = 0;
        for (int j : A) {
            current <<= 1;
            current += j;
            current %= 5;
            result.add(current == 0);
        }
        return result;
    }
}
