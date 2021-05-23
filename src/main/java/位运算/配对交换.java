package 位运算;

import java.util.ArrayList;
import java.util.List;

public class 配对交换 {
    public int exchangeBits(int num) {
        List<Integer> data = new ArrayList<>();
        while (num > 0) {
            data.add(num & 1);
            num >>= 1;
        }
        int result = 0;
        int base = 1;
        for (int i = 0; i < data.size(); i += 2) {
            if (i != data.size() - 1) {
                result += data.get(i + 1) * base;
            }
            base <<= 1;
            result += data.get(i) * base;
            base <<= 1;
        }
        return result;
    }
}
