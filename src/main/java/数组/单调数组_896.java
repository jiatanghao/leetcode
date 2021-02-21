package 数组;

public class 单调数组_896 {
    public boolean isMonotonic(int[] A) {
        if (A.length == 1) {
            return true;
        }
        int i = 0;
        while (i < A.length - 1) {
            if (A[i] != A[i + 1]) {
                break;
            }
            i++;
        }
        if (i == A.length - 1) {
            return true;
        }
        if (A[i] < A[i + 1]) {
            for (int j = i + 1; j < A.length - 1; j++) {
                if (A[j] > A[j + 1]) {
                    return false;
                }
            }
        } else {
            for (int j = i + 1; j < A.length - 1; j++) {
                if (A[j] < A[j + 1]) {
                    return false;
                }
            }
        }
        return true;
    }
}
