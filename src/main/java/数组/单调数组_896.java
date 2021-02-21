package 数组;

public class 单调数组_896 {
    public boolean isMonotonic(int[] A) {
        return isDecrease(A) || isIncrease(A);
    }

    private boolean isIncrease(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i+1]) {
                return false;
            }
        }
        return true;
    }

    private boolean isDecrease(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] < a[i+1]) {
                return false;
            }
        }
        return true;
    }
}
