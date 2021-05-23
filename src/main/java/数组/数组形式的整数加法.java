package 数组;

import java.util.ArrayList;
import java.util.List;

public class 数组形式的整数加法 {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> first = new ArrayList<>(num.length);
        for (int i : num) {
            first.add(i);
        }
        List<Integer> second = new ArrayList<>();
        while (k > 0) {
            second.add(0, k % 10);
            k /= 10;
        }
        int min = Math.min(first.size(), second.size());
        int carry = 0;
        for (int i = 0; i < min; i++) {
            int base = first.get(first.size() - i - 1) + second.get(second.size() - i - 1) + carry;
            carry = base / 10;
            if (first.size() > second.size()) {
                first.set(first.size() - i - 1, base % 10);
            } else {
                second.set(second.size() - i - 1, base % 10);
            }
        }
        if (first.size() > second.size()) {
            return getData(first, second, carry);
        } else {
            return getData(second, first, carry);
        }
    }

    private List<Integer> getData(List<Integer> first, List<Integer> second, int carry) {
        for (int i = first.size() - second.size() - 1; i >= 0; i--) {
            int base = first.get(i) + carry;
            carry = base / 10;
            first.set(i, base % 10);
        }
        if (carry == 1) {
            first.add(0, 1);
        }
        return first;
    }
}
